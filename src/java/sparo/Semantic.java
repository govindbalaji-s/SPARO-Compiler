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

    // Data structure for inheritance graph. Stores parent of each node(class)
    HashMap<Integer, Integer> inheritanceGraph = new HashMap<>();

    // Data structure for class table. Contains all methods, members, constructors
    // of the class
    HashMap<String, ClassInfo> classTable = new HashMap<String, ClassInfo>();

    // Data structure for storing list of all classes
    Set<String> classnames = new HashSet<String>();

    // Data structure for encoding class with node indices
    HashMap<String, Integer> classNum = new HashMap<>();

    /* Constructor that starts with ProgramContext of the parse tree */
    public Semantic(SparoParser.ProgramContext prgctx) throws IOException {
        // Add built-in classes to the inheritance graph and do cycle detection
        addBuiltInClasses();
        printAllClasses(prgctx.class_definition_list());
        genInheritanceGraph(prgctx.class_definition_list());
        checkcycle(inheritanceGraph);

        // Build class and method tables to detect redeclarations
        buildClassTable(prgctx);
        fw.close();
    }

    /* Adds all the built in classes to the inheritance graph */
    public void addBuiltInClasses() throws IOException {
        String builtins[] = { "Object", "Int", "Float", "Bool", "String", "Array", "Tensor" };
        for (String cls : builtins) {
            classnames.add(cls);
            classNum.put(cls, classnames.size() - 1);
            // fw.write(cls+" " +(classnames.size()-1)+"\n");

            // Except "Object", every class' parent is "Object" class
            if (!cls.equals("Object"))
                inheritanceGraph.put(classNum.get(cls), classNum.get("Object"));
        }
    }

    /*
     * Adds all the user defined classes into classnames. Checks for class
     * redeclaration errors param: ctx - the class definition list context
     */
    public void printAllClasses(SparoParser.Class_definition_listContext ctx) throws IOException {
        if (ctx == null)
            return;
        String temp = ctx.class_definition().class_head().TYPEID().getText();
        // fw.write(ctx.class_definition().class_head().TYPEID());

        if (classnames.contains(temp) == false) {
            classnames.add(temp);
            // System.out.println(temp+" " +(classnames.size()-1)+"\n");
            classNum.put(temp, classnames.size() - 1);
        } else {
            System.out.println(ctx.class_definition().class_head().TYPEID().getSymbol().getLine() + ": class " + temp
                    + " already exists");
        }

        printAllClasses(ctx.class_definition_list());
    }

    /*
     * Generates the inheritance graph out of the user defined classes. param: ctx -
     * the class definition list context
     */
    public void genInheritanceGraph(SparoParser.Class_definition_listContext ctx) throws IOException {
        if (ctx == null)
            return;
        String node_a = ctx.class_definition().class_head().TYPEID().getText();

        // Default parent class is Object
        String node_b = "Object";
        if (ctx.class_definition().class_head().base_clause() != null)
            node_b = ctx.class_definition().class_head().base_clause().type_specifier().TYPEID().getText();

        int a = classNum.get(node_a);
        int b = classNum.get(node_b);
        inheritanceGraph.put(a, b);

        // Recurse!
        genInheritanceGraph(ctx.class_definition_list());
    }

    // Flag whether a cycle is detected
    int flag = 0;

    /*
     * Detects cycle and sets flag as per the inheritance graph in the parameter
     */
    public void checkcycle(HashMap<Integer, Integer> graph) throws IOException {
        Set<Integer> stack = new HashSet<Integer>();
        Set<Integer> visited = new HashSet<Integer>();

        for (int i = 0; i < classnames.size(); i++) {
            if (flag == 1) {
                break;
            }
            if (visited.contains(i) == false && graph.containsKey(i) == true) {
                dfs(graph, stack, i, visited);
            }
        }
        if (flag == 1) {
            System.out.println("\n Class redeclaration or Cycle is present in inheritance graph \n");
        } else {
            fw.write("Cycle is not present\n");
        }

    }

    /*
     * Helper dfs for cycle detection
     */
    public void dfs(HashMap<Integer, Integer> graph, Set<Integer> stack, int current, Set<Integer> visited) {
        Set<Integer> s = new HashSet<Integer>();
        s.addAll(stack);
        if (flag == 1)
            return;
        visited.add(current);
        s.add(current);
        int neighbour = graph.get(current);
        if (graph.containsKey(neighbour) == true) {
            if (stack.contains(neighbour) == true) {
                flag = 1;
                return;
            }
            dfs(graph, s, neighbour, visited);
        } else {
            return;
        }
    }

    /*
     * Builds the class table from given program context param. Iteratively calls
     * per class buildClassTable() method.
     */
    public void buildClassTable(ProgramContext prgctx) throws IOException {
        Class_definition_listContext ctx = prgctx.class_definition_list();
        while (ctx != null) {
            buildClassTable(ctx.class_definition());
            ctx = ctx.class_definition_list();
        }

        // PRINT CLASSTABLE
        classTable.forEach((cname, ci) -> {
            try {
                Set<String> membercheck = new HashSet<String>();
                Set<String> methodcheck = new HashSet<String>();
                fw.write("Class name: " + cname + "\n");
                fw.write("--Constructors:\n");

                ci.ctorList.forEach(mi -> {
                    try {
                        fw.write("\n" + mi.toString() + "\n");
                    } catch (Exception e) {
                    }
                });
                fw.write("\n--Members:\n");
                ci.memberList.forEach(vi -> {
                    try {
                        fw.write(vi.toString() + "\n");
                    } catch (Exception e) {
                    }
                });
                for (var x : ci.memberList) {
                    String y = x.name;
                    if (membercheck.contains(y) == true) {
                        System.out.println(x.lineNo + ": " + y + " member already exists\n");
                    }
                    membercheck.add(y);
                }
                fw.write("\n--Methods:\n");
                ci.methodList.forEach(mi -> {
                    try {
                        fw.write("\n" + mi.toString() + "\n");
                    } catch (Exception e) {
                    }
                });
                for (var x : ci.methodList) {
                    String y = x.name;
                    if (methodcheck.contains(y) == true) {
                        String temp = x.name;
                        System.out.println(x.lineNo + ": " + temp + "method already exists\n");
                    }
                    methodcheck.add(y);
                }
                fw.write("-----------------------------\n\n");
                ;
            } catch (Exception e) {
            }
        });
    }

    /*
     * Build class table for a given class definition context Traverses through all
     * its data members, constructors and methods, and adds to the class table.
     */
    public void buildClassTable(Class_definitionContext cdctx) {
        String cname = cdctx.class_head().typeid.getText();
        String pname = getKeyByValue(classNum, inheritanceGraph.get(cname));
        ClassInfo ci = new ClassInfo(cname, pname, cdctx.class_head().TYPEID().getSymbol().getLine());

        var mlctx = cdctx.member_list();
        while (mlctx != null) {
            MemberContext mtx = mlctx.member();
            if (mtx.member_declaration() != null) {
                Type t = getType(mtx.member_declaration().declaration_specifier());
                String n = mtx.member_declaration().OBJECTID().getText();
                ci.memberList.add(new VariableInfo(t, n, mtx.member_declaration().OBJECTID().getSymbol().getLine()));
            } else if (mtx.method_definition() != null) {
                Type rt = getType(mtx.method_definition().declaration_specifier());
                String n = mtx.method_definition().OBJECTID().getText();
                var ptypes = getPTypes(mtx.method_definition().parameter_declaration_list());
                ci.methodList
                        .add(new MethodInfo(n, rt, ptypes, mtx.method_definition().OBJECTID().getSymbol().getLine()));
            } else if (mtx.constructor() != null) {
                var ptypes = getPTypes(mtx.constructor().parameter_declaration_list());
                ci.ctorList.add(new MethodInfo("#", null, ptypes, mtx.constructor().AFTER().getSymbol().getLine()));
            }

            mlctx = mlctx.member_list();
        }
        classTable.put(cname, ci);
    }

    public void print() {
        for (int i = 0; i < classnames.size(); i++) {
            if (inheritanceGraph.containsKey(i) == true) {
                int b = inheritanceGraph.get(i);
                // System.out.println(i+" "+b+"\n");
            }
        }

        // System.out.println("Hello");
    }

    /*
     * Helper function for class table. Gets the Type class filled from the given
     * declaration_specifier node and returns the same
     */
    public Type getType(Declaration_specifierContext ctx) {
        Pointer_typeContext ptrctx = ctx.pointer_type();
        Type.PointerType ptr = Type.PointerType.unique;
        if (ptrctx != null)
            ptr = Type.PointerType.valueOf(ptrctx.getText());
        return new Type(ptr, ctx.type_specifier().getText());
    }

    /*
     * Helper function for class table. Gets the ArrayList of Type class of
     * parameters filled from the given parameter_declaration_list node and returns
     * the same.
     */
    public ArrayList<Type> getPTypes(Parameter_declaration_listContext pdlctx) {
        ArrayList<Type> ptypes = new ArrayList<Type>();

        while (pdlctx != null) {
            Type t = getType(pdlctx.parameter_declaration().declaration_specifier());
            ptypes.add(t);
            pdlctx = pdlctx.parameter_declaration_list();
        }
        return ptypes;
    }

    /*
     * Helper utility to search by key on a Map<T, E> Returns the key corresponding
     * to the value in param
     */
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
