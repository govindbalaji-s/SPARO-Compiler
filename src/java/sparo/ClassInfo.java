package sparo;

import java.util.ArrayList;

public class ClassInfo {
    public String name;
    public String parentName;
    public int lineNo;

    public ArrayList<VariableInfo> memberList;
    public ArrayList<MethodInfo> methodList;
    public ArrayList<MethodInfo> ctorList;

    public ClassInfo(String n, String pn, int ln) {
        name = n;
        parentName = pn;
        lineNo = ln;

        memberList = new ArrayList<VariableInfo>();
        methodList = new ArrayList<MethodInfo>();
        ctorList = new ArrayList<MethodInfo>();
    }
}