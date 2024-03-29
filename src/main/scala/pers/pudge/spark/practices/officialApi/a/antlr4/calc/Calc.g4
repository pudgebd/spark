grammar Calc;

@header{package pers.pudge.spark.practices.officialApi.a.antlr4.calc;}

calc: stmt*;

stmt:   expr NEWLINE             # printExpr
    |   ID '=' expr NEWLINE      # assign
    |   NEWLINE                  # blank
    ;

expr:   expr op=('*'|'/') expr   # mulDiv
    |   expr op=('+'|'-') expr   # addSub
    |   NUMBER                   # literal
    |   ID                       # id
    |   '(' expr ')'             # paren
    ;


MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';

ID      : [a-zA-Z_]+ ;
NUMBER  : DIGIT+
        | DIGIT+ '.' DIGIT*
        | '.' DIGIT+
        ;
fragment DIGIT : [0-9];
NEWLINE : '\r'? '\n';
WS      : [ \t]+ -> skip;