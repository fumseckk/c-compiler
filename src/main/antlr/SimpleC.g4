grammar SimpleC;

@header {
    package antlr;
}

IDENTIFIER : [a-zA-Z]+ [0-9a-zA-Z]*;
INTEGER : '-'? [0-9]+;

WS  :   ( ' ' | '\t' | '\r' '\n' | '\n' ) -> skip;




translationUnit : functionDefinition+;

functionDefinition : returnType=type name=IDENTIFIER '(' (args+=functionArgument ',')* args+=functionArgument? ')' body=blockStatement ;

functionArgument : argType=type name=IDENTIFIER ('[' size=INTEGER ']')?;

type : 'void'  	#VoidType
	| 'int' 	#IntType
	| 'unsigned int'  	#UintType;

statement :
      blockStatement
    | returnStatement
    | varDefStatement
    | varDeclStatement
    | varAssignStatement
    | ifStatement
    | forStatement
    | whileStatement
    | expressionStatement
    ;

blockStatement : '{' statements+=statement* '}';
// TODO add visitors for non-finished stmts to add them to for loop print
varDefStatement : varType=type name=IDENTIFIER '=' expr=expression ';';


varDeclStatement : varType=type name=IDENTIFIER ';';

varAssignStatement : name=IDENTIFIER '=' expr=expression ';';

ifStatement : 'if' '(' expr=expression ')' stmt1=statement ('else' stmt2=statement)?;

forVarDef : varType=type name=IDENTIFIER '=' expr=expression;
forVarAssign : name=IDENTIFIER '=' expr=expression;

forStatement : 'for' '(' (initDef=forVarDef | initAssign=forVarAssign)? ';' cond=expression? ';' incr=forVarAssign? ')' body=statement;

whileStatement : 'while' '(' cond=expression ')' body=statement;

returnStatement : 'return' expr=expression?';';

expressionStatement : expr=expression ';';
expression : expr1=expression '*' expr2=expression 	#MulExpr
		| expr1=expression '/' expr2=expression 	#DivExpr
		| expr1=expression '+' expr2=expression  #AddExpr
		| expr1=expression '-' expr2=expression 	#SubExpr
		| expr1=expression '<' expr2=expression 	#CmpLtExpr
		| expr1=expression '>' expr2=expression 	#CmpGtExpr
		|'-' expr1=expression					#OppExpr
	    | '(' expr1=expression ')' 		    #ExprNode
		| name=IDENTIFIER 					#IdNode
		| functionCall                  #functionCallExpr
		| INTEGER 						#IntNode;


functionCall : name=IDENTIFIER '(' (args+=expression ',')* args+=expression? ')';
