package sparo;

import java.util.*;
import java.util.Map.Entry;

import sparo.SparoParser.Class_definitionContext;
import sparo.SparoParser.Class_definition_listContext;
import sparo.SparoParser.Declaration_specifierContext;
import sparo.SparoParser.MemberContext;
import sparo.SparoParser.Member_listContext;
import sparo.SparoParser.Parameter_declarationContext;
import sparo.SparoParser.Parameter_declaration_listContext;
import sparo.SparoParser.Pointer_typeContext;
import sparo.SparoParser.ProgramContext;

class Semantic {
  private boolean errorFlag = false;

  public boolean getErrorFlag() {
    return errorFlag;
  }
  HashMap<Integer,Integer> inheritanceGraph = new HashMap<>();
  HashMap<String, ClassInfo> classTable = new HashMap<String, ClassInfo>();

  public Semantic(SparoParser.ProgramContext prgctx) {
    addBuiltInClasses();
    printAllClasses(prgctx.class_definition_list());
    genInheritanceGraph(prgctx.class_definition_list());
    checkcycle(inheritanceGraph);


    buildClassTable(prgctx);
    //check types, build symbol table etc
    // traverseProgram(prgctx);
  }
  
  Set<String> classnames = new HashSet<String>();
  HashMap<String, Integer> classNum = new HashMap<>();

  public void addBuiltInClasses() {
    String builtins[] = {"Object", "Int", "Float", "Bool", "String", "Array", "Tensor"};
    for(String cls : builtins) {
      classnames.add(cls);
      classNum.put(cls, classnames.size()-1);
      System.out.println(cls+" " +(classnames.size()-1)+"\n");

      if(!cls.equals("Object"))
        inheritanceGraph.put(classNum.get(cls), classNum.get("Object"));
    }
  }

  public void printAllClasses(SparoParser.Class_definition_listContext ctx) {
    if(ctx == null)
      return;
    String temp = ctx.class_definition().class_head().TYPEID().getText();
    System.out.println(ctx.class_definition().class_head().TYPEID());

    if(classnames.contains(temp)== false){
      classnames.add(temp);
      System.out.println(temp+" " +(classnames.size()-1)+"\n");
      classNum.put(temp,classnames.size()-1);
    }
    else
    {
      System.out.println(temp+" class already exists");
    }
      
    printAllClasses(ctx.class_definition_list());
  }

  
  public void genInheritanceGraph(SparoParser.Class_definition_listContext ctx){
	  if(ctx == null)
    return;
    String node_a = ctx.class_definition().class_head().TYPEID().getText();

    //Default parent class is Object
    String node_b = "Object";
    if(ctx.class_definition().class_head().base_clause()!=null)
      node_b = ctx.class_definition().class_head().base_clause().type_specifier().TYPEID().getText();
    
      int a = classNum.get(node_a);
    int b = classNum.get(node_b);
    inheritanceGraph.put(a,b);

    genInheritanceGraph(ctx.class_definition_list());    
	}
	
 int flag=0;  
 public void checkcycle( HashMap<Integer,Integer> graph)
 {
	 Set<Integer> stack = new HashSet<Integer>();
	  Set<Integer> visited = new HashSet<Integer>();

	 
	 for(int i=0;i<classnames.size();i++)
	 {
		 if(flag==1)
		 {
			 break;
		 }
		 if(visited.contains(i)==false&&graph.containsKey(i)==true)
		 {
		    dfs(graph,stack,i,visited);
	     }
	 }
	 if(flag==1)
	 {
		 System.out.println("\n Cycle is present \n");
	 }
	 else
	 {
		 System.out.println("Cycle is not present\n");
		 
	 }
	 
 }
 
  public void dfs(HashMap<Integer,Integer> graph, Set<Integer> stack,int current,Set<Integer> visited)
 {
	 Set<Integer> s = new HashSet<Integer>();
	 s.addAll(stack);
	 if(flag==1)
	 return;
	visited.add(current);
	s.add(current);
	int neighbour=graph.get(current);
	if(graph.containsKey(neighbour)==true)
	{
		if(stack.contains(neighbour)==true)
		{
			flag=1;
			return;
		}
		dfs(graph,s,neighbour,visited);
	} 
	else
	{
		return;
	}
 }
 
public void buildClassTable(ProgramContext prgctx) {
  Class_definition_listContext ctx = prgctx.class_definition_list();
  while(ctx != null) {
    buildClassTable(ctx.class_definition());
    ctx = ctx.class_definition_list();
  }
  

  //PRINT CLASSTABLE
  classTable.forEach((cname, ci) -> {
	  Set<String> membercheck = new HashSet<String>(); 
	  Set<String> methodcheck = new HashSet<String>();
    System.out.println("Class name: " + cname);
    System.out.println("Constructors:");
    ci.ctorList.forEach(mi -> System.out.println(mi.toString()));
    System.out.println("Members:");
    ci.memberList.forEach(vi -> System.out.println(vi.toString()));
    for(var x : ci.memberList)
    {
		String y = x.toString();
		if(membercheck.contains(y)==true)
		{
			System.out.println(y+" member already exists\n");
		}
		membercheck.add(y);
	}
    System.out.println("Methods:");
    ci.methodList.forEach(mi  -> System.out.println(mi.toString()));
    for(var x : ci.methodList)
    {
		String y = x.toString();
		if(methodcheck.contains(y)==true)
		{
			String temp= x.tostring();
			System.out.println("\n"+temp+"method already exists\n");
		}
		methodcheck.add(y);
	}
    System.out.println("-----------------------------");
  });

}

public void buildClassTable(Class_definitionContext cdctx) {
  String cname = cdctx.class_head().typeid.getText();
  String pname = getKeyByValue(classNum, inheritanceGraph.get(cname));
  ClassInfo ci = new ClassInfo(cname, pname);

  var mlctx = cdctx.member_list();
  while(mlctx != null) {
    MemberContext mtx = mlctx.member();
    if(mtx.member_declaration() != null) {
      Type t = getType(mtx.member_declaration().declaration_specifier());
      String n = mtx.member_declaration().OBJECTID().getText();
      ci.memberList.add(new VariableInfo(t, n));
    }
    else if(mtx.method_definition() != null) {
      Type rt = getType(mtx.method_definition().declaration_specifier());
      String n = mtx.method_definition().OBJECTID().getText();
      var ptypes = getPTypes(mtx.method_definition().parameter_declaration_list());
      ci.methodList.add(new MethodInfo(n, rt, ptypes));
    }
    else if(mtx.constructor() != null) {
      var ptypes = getPTypes(mtx.constructor().parameter_declaration_list());
      ci.ctorList.add(new MethodInfo("construct", null, ptypes));
    }

    mlctx = mlctx.member_list();
  }
  classTable.put(cname, ci);
}

 public void traverseProgram(SparoParser.ProgramContext prgctx) {
   SparoParser.Class_definition_listContext ctx = prgctx.class_definition_list();
   while(ctx != null) {
     traverseClassDefinition(ctx.class_definition());
     ctx = ctx.class_definition_list();
   }
 }

 public void traverseClassDefinition(SparoParser.Class_definitionContext ctx) {
   SparoParser.Member_listContext mtx = ctx.member_list();
   while(mtx != null) {
     //traverse
   }
 }

	  
  public void print(){
	for(int i=0;i<classnames.size();i++)
	{
		if(inheritanceGraph.containsKey(i)==true)
		{
			int b = inheritanceGraph.get(i);
			System.out.println(i+" "+b+"\n");
		}
	}
		
    System.out.println("Hello");
  }

  public Type getType(Declaration_specifierContext ctx) {
    Pointer_typeContext ptrctx = ctx.pointer_type();
    Type.PointerType ptr = Type.PointerType.unique;
    if(ptrctx != null)
      ptr = Type.PointerType.valueOf(ptrctx.getText());
    return new Type(ptr, ctx.type_specifier().getText());
  }

  public ArrayList<Type> getPTypes(Parameter_declaration_listContext pdlctx) {
    ArrayList<Type> ptypes = new ArrayList<Type>();

    while(pdlctx != null) {
      Type t = getType(pdlctx.parameter_declaration().declaration_specifier());
      ptypes.add(t);
      pdlctx = pdlctx.parameter_declaration_list();
    }
    return ptypes;
  }

  public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
    for (Entry<T, E> entry : map.entrySet()) {
        if (Objects.equals(value, entry.getValue())) {
            return entry.getKey();
        }
    }
    return null;
}
}
