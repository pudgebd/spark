grammar EnChar;  //第一行是语法文件名Hello，保存之后文件要按这个名字取，即 EnChar.g4
r :'enchar' ID;  //第二行以小写字母开头，是一个语法规则。hello后面跟着一个ID标识符。ID标识符的定义在第三行定义
ID : [a-zA-Z]+;    //第三行以大写字母开头，是一个词法规则。ID由英文字母的一个或多个组成
WS : [\t\r\n ]+->skip;

//第四行以大写字母开头，是一个词法规则。WS由制表符、换行符的一个或多个组成。
// ->skip是action，表示当处理这个词法规则时采取的处理方法。skip表示跳过，不处理制表符、换行符，
// 直接处理下一个词法规则。







