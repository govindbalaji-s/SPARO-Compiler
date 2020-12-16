package sparo;

import java.util.*;
import java.util.Map.Entry;
import java.io.FileWriter;
import java.io.IOException;

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
  private FileWriter fw = new FileWriter("semanticlogs.txt");

  public boolean getErrorFlag() {
    return errorFlag;
  }
  HashMap<Integer,Integer> inheritanceGraph = new HashMap<>();
  HashMap<String, ClassInfo> classTable = new HashMap<String, ClassInfo>();

  public Semantic(SparoParser.ProgramContext prgctx) throws IOException {
    addBuiltInClasses();
    printAllClasses(prgctx.class_definition_list());
    genInheritanceGraph(prgctx.class_definition_list());
    checkcycle(inheritanceGraph);


    buildClassTable(prgctx);
    fw.close();
    //check types, build symbol table etc
    // traverseProgram(prgctx);
  }
  
  Set<String> classnames = new HashSet<String>();
  HashMap<String, Integer> classNum = new HashMap<>();

  public void addBuiltInClasses() throws IOException{
    String builtins[] = {"Object", "Int", "Float", "Bool", "String", "Array", "Tensor"};
    for(String cls : builtins) {
      classnames.add(cls);
      classNum.put(cls, classnames.size()-1);
      // fw.write(cls+" " +(classnames.size()-1)+"\n");

      if(!cls.equals("Object"))
        inheritanceGraph.put(classNum.get(cls), classNum.get("Object"));
    }
  }

  public void printAllClasses(SparoParser.Class_definition_listContext ctx) throws IOException{
    if(ctx == null)
      return;
    String temp = ctx.class_definition().class_head().TYPEID().getText();
    // fw.write(ctx.class_definition().class_head().TYPEID());

    if(classnames.contains(temp)== false){
      classnames.add(temp);
      // System.out.println(temp+" " +(classnames.size()-1)+"\n");
      classNum.put(temp,classnames.size()-1);
    }
    else
    {
      System.out.println(ctx.class_definition().class_head().TYPEID().getSymbol().getLine()+
                            ": class " + temp + " already exists");
    }
      
    printAllClasses(ctx.class_definition_list());
  }

  
  public void genInheritanceGraph(SparoParser.Class_definition_listContext ctx) throws IOException {
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
 public void checkcycle( HashMap<Integer,Integer> graph) throws IOException
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
		 System.out.println("\n Class redeclaration or Cycle is present in inheritance graph \n");
	 }
	 else
	 {
		fw.write("Cycle is not present\n");
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
 
public void buildClassTable(ProgramContext prgctx) throws IOException{
  Class_definition_listContext ctx = prgctx.class_definition_list();
  while(ctx != null) {
    buildClassTable(ctx.class_definition());
    ctx = ctx.class_definition_list();
  }
  

  //PRINT CLASSTABLE
  classTable.forEach((cname, ci) -> {
    try{
	  Set<String> membercheck = new HashSet<String>(); 
	  Set<String> methodcheck = new HashSet<String>();
    fw.write("Class name: " + cname + "\n");
    fw.write("--Constructors:\n");
    
    ci.ctorList.forEach(mi -> {try{fw.write("\n"+mi.toString()+"\n");}catch(Exception e){}});
    fw.write("\n--Members:\n");
    ci.memberList.forEach(vi -> {try{fw.write(vi.toString()+"\n");}catch(Exception e){}});
    for(var x : ci.memberList)
    {
      String y = x.name;
      if(membercheck.contains(y)==true)
      {
        System.out.println(x.lineNo + ": " + y+" member already exists\n");
      }
      membercheck.add(y);
	}
    fw.write("\n--Methods:\n");
    ci.methodList.forEach(mi  -> {try{fw.write("\n"+mi.toString()+"\n");}catch(Exception e){}});
    for(var x : ci.methodList)
    {
		String y = x.name;
		if(methodcheck.contains(y)==true)
		{
			String temp= x.name;
			System.out.println(x.lineNo + ": " + temp+"method already exists\n");
		}
		methodcheck.add(y);
	}
    fw.write("-----------------------------\n\n");
    ;}catch(Exception e){}
  });  
}

public void buildClassTable(Class_definitionContext cdctx){
  String cname = cdctx.class_head().typeid.getText();
  String pname = getKeyByValue(classNum, inheritanceGraph.get(cname));
  ClassInfo ci = new ClassInfo(cname, pname, cdctx.class_head().TYPEID().getSymbol().getLine());

  var mlctx = cdctx.member_list();
  while(mlctx != null) {
    MemberContext mtx = mlctx.member();
    if(mtx.member_declaration() != null) {
      Type t = getType(mtx.member_declaration().declaration_specifier());
      String n = mtx.member_declaration().OBJECTID().getText();
      ci.memberList.add(new VariableInfo(t, n,
                mtx.member_declaration().OBJECTID().getSymbol().getLine()));
    }
    else if(mtx.method_definition() != null) {
      Type rt = getType(mtx.method_definition().declaration_specifier());
      String n = mtx.method_definition().OBJECTID().getText();
      var ptypes = getPTypes(mtx.method_definition().parameter_declaration_list());
      ci.methodList.add(new MethodInfo(n, rt, ptypes, 
                mtx.method_definition().OBJECTID().getSymbol().getLine()));
    }
    else if(mtx.constructor() != null) {
      var ptypes = getPTypes(mtx.constructor().parameter_declaration_list());
      ci.ctorList.add(new MethodInfo("#", null, ptypes, 
                mtx.constructor().AFTER().getSymbol().getLine()));
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
			// System.out.println(i+" "+b+"\n");
		}
	}
		
    // System.out.println("Hello");
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
