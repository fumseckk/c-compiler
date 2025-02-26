package compiler.frontend;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class SymbolTable {
	Stack<SymbolTableLevel> s;

	public SymbolTable() {
		s = new Stack<>();
		s.push(new SymbolTableLevel());
	}
	
	public SymbolTableLevel initializeScope(ParserRuleContext ctx) {
		s.push(new SymbolTableLevel());
		return s.peek();
	}
	
	public void finalizeScope() {
	}
	
	public SymbolTableEntry insert(String name) {
		return null;
	}
	
	public SymbolTableEntry lookup(String name) {
		return null;
	}
	
}