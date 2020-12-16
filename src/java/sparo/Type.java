package sparo;

public class Type {
    enum PointerType {
        unique,
        shared,
        weak
    }
    public PointerType ptrType;
    public String typeName;

    public Type(PointerType p, String t) {
        ptrType = p;
        typeName = t;
    }

    public String toString() {
        return ptrType.toString() + " " + typeName;
    }
}
