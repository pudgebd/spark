grammar Ip;

@header{package pers.pudge.spark.practices.officialApi.a.antlr4.ip;}

prog:   row+    #findOneRow
    ;
row:    DATE    #date
    |   IP      #ip
    |   STRING  #api
    |   INT     #respCode
    |   INT     #sendData
    |   NL      #end
    ;

IP: INT '.' INT '.' INT '.' INT;
INT: [0-9]+;
STRING: '"' .*? '"'; //匹配 "" 之间字符串
DATE: '[' .*? ']'; //匹配 [] 之间字符串
NL: '\n'; //匹配一行记录终止符
IGNORE1: ' ' -> skip; //忽略
IGNORE2: '-' -> skip; //忽略