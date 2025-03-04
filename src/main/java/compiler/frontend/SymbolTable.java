package compiler.frontend;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
	List<SymbolTableLevel> levels;
	Map<ParserRuleContext, SymbolTableLevel> obj_to_level;

	public SymbolTable() {
		levels = new ArrayList<>();
		obj_to_level = new HashMap<>();
		levels.add(new SymbolTableLevel(null)); // niveau 0 représentant le fichier entier
	}
	
	public SymbolTableLevel initializeScope(ParserRuleContext ctx) {
		SymbolTableLevel lvl = new SymbolTableLevel(levels.getFirst());
		levels.addFirst(lvl);
		obj_to_level.put(ctx, lvl);
		return lvl;
	}
	
	public void finalizeScope() {
		levels.removeFirst();
	}
	
	public SymbolTableEntry insert(String symbol) {
		return levels.getFirst().insert(symbol);
	}
	
	public SymbolTableEntry lookup(String symbol) {
		SymbolTableLevel curr = levels.getFirst();
		while(curr != null && curr.lookup(symbol) == null) curr = curr.parent;
		if (curr == null)
			throw new RuntimeException("Variable `" + symbol + "` not found.");
		return curr.lookup(symbol);
	}
}