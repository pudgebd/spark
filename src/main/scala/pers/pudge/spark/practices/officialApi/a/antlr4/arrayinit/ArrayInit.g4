/*语法文件都由一个语法头开始，它指定了语法的名称，而且语法名称必须和文件名相同。
 * 在这个例子中，语法名称是ArrayInit，文件名为ArrayInit.g4
 */
grammar ArrayInit;

@header{package pers.pudge.spark.practices.officialApi.a.antlr4.arrayinit;}

/* init将匹配在大括号中，由英文逗号分割的值。*/
init : '{' value (',' value)* '}' ; // 匹配至少一个值

/*值可以是整数，也可以是嵌套的数组*/
value : init | INT ;

//语法规则由小写字母开头，词法规则由大写字母开头
INT : [0-9]+ ; //定义整数

WS : [ \t\r\n]+ -> skip ; // 忽略空白符



