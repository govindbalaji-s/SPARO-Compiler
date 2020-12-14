package sparo;

public class VariableInfo extends SymbolInfo {
    public Type type;
    public VariableInfo(Type t, String n){
        super(n);
        type = t;
    }

    public String toString() {
        return type.toString() + " " + name;
    }
}
