package sparo;

import java.util.ArrayList;

public class ClassInfo {
    public String name;
    public String parentName;

    public ArrayList<VariableInfo> memberList;
    public ArrayList<MethodInfo> methodList;
    public ArrayList<MethodInfo> ctorList;

    public ClassInfo(String n, String pn) {
        name = n;
        parentName = pn;

        memberList = new ArrayList<VariableInfo>();
        methodList = new ArrayList<MethodInfo>();
        ctorList = new ArrayList<MethodInfo>();
    }
}