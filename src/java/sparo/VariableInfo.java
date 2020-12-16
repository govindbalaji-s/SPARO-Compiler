package sparo;

public class VariableInfo extends SymbolInfo {
    public Type type;
    public int lineNo;

    public VariableInfo(Type t, String n, int ln) {
        super(n);
        type = t;
        lineNo = ln;
    }

    public String toString() {
        return type.toString() + " " + name;
    }
}
