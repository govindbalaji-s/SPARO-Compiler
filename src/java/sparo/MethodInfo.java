package sparo;

import java.util.ArrayList;

import sparo.Type.PointerType;

public class MethodInfo extends SymbolInfo {
    public Type retType;
    public int lineNo;
    public ArrayList<Type> paramTypes = new ArrayList<Type>();

    public MethodInfo(String n, Type rt, ArrayList<Type> pt, int ln) {
        super(n);
        retType = rt;
        lineNo = ln;
        if(retType == null)
            retType = new Type(PointerType.unique, "CTOR");
        paramTypes = pt;

        mangle();
    }

    private void mangle() {
        String newName = "(" + retType.typeName + ")" +
                         name + "(";
        for(Type paramType : paramTypes) {
            newName += paramType.typeName + ",";
        }
        newName += ")";
        name = newName;
    }

    public String toString() {
        return "MethodName:"+name + 
            "\nReturn type:" + retType.toString() +
            "\nParam types:" + paramTypes.toString();
    }
    public String tostring(){
    return name;
}
}
