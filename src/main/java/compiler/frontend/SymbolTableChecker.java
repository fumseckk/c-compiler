package compiler.frontend;


import antlr.SimpleCBaseVisitor;
import antlr.SimpleCParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class SymbolTableChecker extends SimpleCBaseVisitor<Void> {
    SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visitFunctionDefinition(SimpleCParser.FunctionDefinitionContext ctx) {
        symbolTable.initializeScope(ctx);
        for (SimpleCParser.FunctionArgumentContext a : ctx.args) {
            symbolTable.insert(a.name.getText());
        }
        visit(ctx.body);
        symbolTable.finalizeScope();
        return null;
    }

    @Override
    public Void visitBlockStatement(SimpleCParser.BlockStatementContext ctx) {
        symbolTable.initializeScope(ctx);
        for (ParseTree child : ctx.statements) {
            visit(child);
        }
        symbolTable.finalizeScope();
        return null;
    }

    @Override
    public Void visitVarDef(SimpleCParser.VarDefContext ctx) {
        visit(ctx.expr);
        symbolTable.insert(ctx.name.getText());
        return null;
    }

    @Override
    public Void visitVarDecl(SimpleCParser.VarDeclContext ctx) {
        symbolTable.insert(ctx.name.getText());
        return null;
    }

    @Override
    public Void visitVarAssign(SimpleCParser.VarAssignContext ctx) {
        symbolTable.lookup(ctx.name.getText());
        visit(ctx.expr);
        return null;
    }

    @Override
    public Void visitIfStatement(SimpleCParser.IfStatementContext ctx) {
        visit(ctx.expr);

        symbolTable.initializeScope(ctx);
        visit(ctx.stmt1);
        symbolTable.finalizeScope();

        symbolTable.initializeScope(ctx);
        visit(ctx.stmt2);
        symbolTable.finalizeScope();

        return null;
    }

    @Override
    public Void visitForVarDef(SimpleCParser.ForVarDefContext ctx) {
        visit(ctx.expr);
        symbolTable.insert(ctx.name.getText());
        return null;
    }

    @Override
    public Void visitForVarAssign(SimpleCParser.ForVarAssignContext ctx) {
        symbolTable.lookup(ctx.name.getText());
        visit(ctx.expr);
        return null;
    }

    @Override
    public Void visitForStatement(SimpleCParser.ForStatementContext ctx) {
        symbolTable.initializeScope(ctx);
        if (ctx.initDef != null) visit(ctx.initDef);
        else if (ctx.initAssign != null) visit(ctx.initAssign);
        if (ctx.cond != null) visit(ctx.cond);
        if (ctx.incr != null) visit(ctx.incr);
        visit(ctx.body);
        symbolTable.finalizeScope();
        return null;
    }

    @Override
    public Void visitWhileStatement(SimpleCParser.WhileStatementContext ctx) {
        visit(ctx.cond);
        symbolTable.initializeScope(ctx);
        visit(ctx.body);
        symbolTable.finalizeScope();
        return null;
    }


    @Override
    public Void visitIdNode(SimpleCParser.IdNodeContext ctx) {
        symbolTable.lookup(ctx.name.getText());
        return null;
    }
}

