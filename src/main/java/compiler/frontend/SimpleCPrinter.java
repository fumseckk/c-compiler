package compiler.frontend;

import org.antlr.v4.runtime.tree.ParseTree;

import antlr.SimpleCBaseVisitor;
import antlr.SimpleCParser;

public class SimpleCPrinter extends SimpleCBaseVisitor<String> {

	public String visitTranslationUnit(SimpleCParser.TranslationUnitContext ctx) {
		StringBuilder result = new StringBuilder();
		for (ParseTree c : ctx.children)
			result.append("\n").append(this.visit(c));
		return result.toString();
	}

	public String visitFunctionDefinition(SimpleCParser.FunctionDefinitionContext ctx) {
		StringBuilder result = new StringBuilder(this.visit(ctx.returnType) + " " + ctx.name.getText() + "(");

		if (!ctx.args.isEmpty()) {
			int num_args = ctx.args.size();
			for (ParseTree c : ctx.args.subList(0, num_args - 1))
				result.append(this.visit(c)).append(", ");
			result.append(this.visit(ctx.args.get(num_args - 1)));
		}
		result.append(")");

		return result + "\n" + this.visit(ctx.body) + "\n";

	}

	public String visitFunctionArgument(SimpleCParser.FunctionArgumentContext ctx) {
		String result = this.visit(ctx.argType) + " " + ctx.name.getText();
		if (ctx.size != null)
			result += "[" + ctx.size.getText() + "]";
		return result;
	}

	public String visitVoidType(SimpleCParser.VoidTypeContext ctx) {
		return "void";
	}

	public String visitIntType(SimpleCParser.IntTypeContext ctx) {
		return "int";
	}

	public String visitUintType(SimpleCParser.UintTypeContext ctx) {
		return "unsigned int";
	}

	@Override
	public String visitBlockStatement(SimpleCParser.BlockStatementContext ctx) {
		String result = "{\n";
		for (ParseTree child : ctx.statements) {
			result += visit(child);
		}
		return result + "}\n";
	}

	@Override
	public String visitVarDefStatement(SimpleCParser.VarDefStatementContext ctx) {
		return visit(ctx.varType) + " " + ctx.name.getText() + " = " + visit(ctx.expr) + ";\n";
	}

	@Override
	public String visitVarDeclStatement(SimpleCParser.VarDeclStatementContext ctx) {
		return visit(ctx.varType) + " " + ctx.name.getText() + ";\n";
	}

	@Override
	public String visitVarAssignStatement(SimpleCParser.VarAssignStatementContext ctx) {
		return ctx.name.getText() + " = " + visit(ctx.expr) + ";\n";
	}

	@Override
	public String visitIfStatement(SimpleCParser.IfStatementContext ctx) {
		String res = "if (" + visit(ctx.expr) + ") " + visit(ctx.stmt1);
		if (ctx.stmt2 != null) {
			res += "else " + visit(ctx.stmt2);
		}
		return res;
	}

	@Override
	public String visitForStatement(SimpleCParser.ForStatementContext ctx) {
		String res = "for (";
		if (ctx.initDef != null) res += visit(ctx.initDef);
		else if (ctx.initAssign != null) res += visit(ctx.initAssign);
		else res += ';';
		if (ctx.cond != null) res += visit(ctx.cond);
		res += "; ";
		if (ctx.incr != null) res += visit(ctx.incr);
		return res + ") " + visit(ctx.body);
	}

	@Override
	public String visitWhileStatement(SimpleCParser.WhileStatementContext ctx) {
		return "while (" + visit(ctx.cond) + ") " + visit(ctx.body);
	}

	@Override
	public String visitReturnStatement(SimpleCParser.ReturnStatementContext ctx) {
		return "return " + visit(ctx.expr) + ";\n";
	}

	@Override
	public String visitExpressionStatement(SimpleCParser.ExpressionStatementContext ctx) {
		return visit(ctx.expr) + ";\n" ;
	}

	@Override
	public String visitExprNode(SimpleCParser.ExprNodeContext ctx) {
		return "(" + visit(ctx.expr1) + ")";
	}

	@Override
	public String visitMulExpr(SimpleCParser.MulExprContext ctx) {
		return visit(ctx.expr1) + " * " + visit(ctx.expr2);
	}

	@Override
	public String visitOppExpr(SimpleCParser.OppExprContext ctx) {
		return "-" +visit(ctx.expr1);
	}

	@Override
	public String visitIntNode(SimpleCParser.IntNodeContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitDivExpr(SimpleCParser.DivExprContext ctx) {
		return visit(ctx.expr1) + " / " + visit(ctx.expr2);
	}

	@Override
	public String visitCmpLtExpr(SimpleCParser.CmpLtExprContext ctx) {
		return visit(ctx.expr1) + " < " + visit(ctx.expr2);
	}

	@Override
	public String visitIdNode(SimpleCParser.IdNodeContext ctx) {
		return ctx.name.getText();
	}

	@Override
	public String visitCmpGtExpr(SimpleCParser.CmpGtExprContext ctx) {
		return visit(ctx.expr1) + " > " + visit(ctx.expr2);
	}

	@Override
	public String visitSubExpr(SimpleCParser.SubExprContext ctx) {
		return visit(ctx.expr1) + " - " + visit(ctx.expr2);
	}

	@Override
	public String visitAddExpr(SimpleCParser.AddExprContext ctx) {
		return visit(ctx.expr1) + " + " + visit(ctx.expr2);
	}

	@Override
	public String visitFunctionCall(SimpleCParser.FunctionCallContext ctx) {
		String result = ctx.name.getText() + "(";
		if (ctx.args.size() >= 1){
			result += visit(ctx.args.get(0));
		}
		for (int child = 1; child < ctx.args.size(); child++) {
			result += ", " + visit(ctx.args.get(child));
		}
		return result + ")";
	}
}
