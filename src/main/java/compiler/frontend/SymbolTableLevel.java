package compiler.frontend;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableLevel {
    SymbolTableLevel parent;
    Map<String, SymbolTableEntry> map;

    SymbolTableLevel(SymbolTableLevel parent) {
        map = new HashMap<>();
        this.parent = parent;
    }

    public SymbolTableEntry insert(String symbol) {
        SymbolTableEntry entry = new SymbolTableEntry(symbol);
        map.put(symbol, entry);
        return entry;
    }

    public SymbolTableEntry lookup(String symbol) {
        return map.get(symbol);
    }
}
