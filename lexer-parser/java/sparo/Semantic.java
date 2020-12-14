package sparo;
import java.util.*;

class Semantic {
  private boolean errorFlag = false;

  public boolean getErrorFlag() {
    return errorFlag;
  }
  HashMap<Integer,Integer> graph = new HashMap<>();
  public Semantic(SparoParser.ProgramContext prgctx) {
    printAllClasses(prgctx.class_definition_list());
    Graph(prgctx.class_definition_list());
    checkcycle(graph);
  }
  
  Set<String> classnames = new HashSet<String>();
  HashMap<String, Integer> map = new HashMap<>();
  Integer i=0;
  Integer graphsize=0;
  public void printAllClasses(SparoParser.Class_definition_listContext ctx) {
    if(ctx == null)
      return;
    String temp = ctx.class_definition().class_head().TYPEID().getText();
    System.out.println(ctx.class_definition().class_head().TYPEID());
    if(classnames.contains(temp)== false){
		classnames.add(temp);
		System.out.println(temp+" " +i+"\n");
		map.put(temp,i);
		i++;
	}
	else
	{
		System.out.println(temp+" class already exists");
	}
		
    printAllClasses(ctx.class_definition_list());
    graphsize=i;
  }

  
  public void Graph(SparoParser.Class_definition_listContext ctx){
	  if(ctx == null)
	  return;
	  if(ctx.class_definition().class_head().base_clause()!=null)
	  {
	     String node_a = ctx.class_definition().class_head().TYPEID().getText();
	     String node_b = ctx.class_definition().class_head().base_clause().type_specifier().TYPEID().getText();
	     int a = map.get(node_a);
	     int b = map.get(node_b);
	     graph.put(a,b);
      }
      Graph(ctx.class_definition_list());    
	  }
	
 int flag=0;  
 public void checkcycle( HashMap<Integer,Integer> graph)
 {
	 Set<Integer> stack = new HashSet<Integer>();
	  Set<Integer> visited = new HashSet<Integer>();

	 
	 for(int i=0;i<graphsize;i++)
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
	for(int i=0;i<graphsize;i++)
	{
		if(graph.containsKey(i)==true)
		{
			int b = graph.get(i);
			System.out.println(i+" "+b+"\n");
		}
	}
		
    System.out.println("Hello");
  }
}
