package sparo;
import java.util.*;

class Semantic {
  private boolean errorFlag = false;

  public boolean getErrorFlag() {
    return errorFlag;
  }
  HashMap<Integer,Integer> inheritanceGraph = new HashMap<>();
  public Semantic(SparoParser.ProgramContext prgctx) {
    addBuiltInClasses();
    printAllClasses(prgctx.class_definition_list());
    genInheritanceGraph(prgctx.class_definition_list());
    checkcycle(inheritanceGraph);
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
}
