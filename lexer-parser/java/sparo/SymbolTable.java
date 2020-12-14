package sparo;
import java.util.*;

public class SymbolTable {
	private int scope;
    private ArrayList<HashMap<String, SymbolInfo>> maps =
                        new ArrayList<HashMap<String, SymbolInfo>>();
	public SymbolTable(){
		scope = 0;
		maps.add(new HashMap<String, SymbolInfo>());
	}
	void insert(String s, SymbolInfo t){
		maps.get(scope).put(s,t);
	}
	void insertAll(HashMap<String, SymbolInfo> s) {
		maps.get(scope).putAll(s);
	}
	void enterScope(){
		scope++;
		maps.add(new HashMap<String, SymbolInfo>());
	}
	void exitScope(){
		if (scope>0){
			maps.remove(scope);
			scope--;
		}
	}	
	SymbolInfo lookUpLocal(String t){
		return maps.get(scope).get(t);
	}
	SymbolInfo lookUpGlobal(String t){
		for ( int i = scope; i>=0 ; i--){
			if (maps.get(i).containsKey(t))
				return maps.get(i).get(t);
		}
		return null;
	}
}