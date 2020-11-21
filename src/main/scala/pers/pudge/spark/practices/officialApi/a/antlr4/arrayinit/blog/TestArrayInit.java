package pers.pudge.spark.practices.officialApi.a.antlr4.arrayinit.blog;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import pers.pudge.spark.practices.officialApi.a.antlr4.arrayinit.*;

public class TestArrayInit {


    public static void main(String[] args) throws Exception {
        //创建一个读取标准输入的CharStream
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        //创建一个从指定的CharStream中读取数据的词法分析器
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        //创建一个词法分析器产生的token缓冲
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //创建一个从token缓冲中读取token的语法分析器
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); //开始分析规则init
        // 创建一个普通的遍历器来触发监听器事件
        ParseTreeWalker walker = new ParseTreeWalker();

        // 遍历语法分析树，在遍历的过程中，触发回调
        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println(); // 翻译后打印一个换行
    }


}
