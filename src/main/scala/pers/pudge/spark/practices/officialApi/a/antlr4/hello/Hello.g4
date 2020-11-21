grammar Hello;

@header{package pers.pudge.spark.practices.officialApi.a.antlr4.hello;}

//书里写法过时？

r: 'hello' ID   #sayHelloTo
 ;

ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;