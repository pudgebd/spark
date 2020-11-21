grammar LabeledExpr; // rename to distinguish from Expr.g4

@header{package pers.pudge.spark.practices.officialApi.a.antlr4.labeledExpr;}

prog:   stat+ ;

//为不同的备选分支添加的了标签(#MulDiv/#AddSub),如果没有标签,
// ANTLR是为每条规则来生成方法如果希望每个备选分支都有相应的方法来访问,就可以像我这样在右侧加上#标签。
stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op=('*'|'/') expr      # MulDiv
    |   expr op=('+'|'-') expr      # AddSub
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
    ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement   signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace