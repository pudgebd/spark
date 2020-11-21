package pers.pudge.spark.practices.officialApi.a.antlr4.hive.myCode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pers.pudge.spark.practices.officialApi.a.antlr4.hive.HplsqlLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.hive.HplsqlParser;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpParser;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.myCode.MyIpListener;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyHiveAnalyse {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/main/resources/antlr/mySqlAnalyse.sql"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        HplsqlLexer lexer = new HplsqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokens);
        ParseTree tree = parser.select_stmt(); //starting rule

        System.out.println("Visitor:");
        MyHiveVisitor visitor = new MyHiveVisitor();
        visitor.visit(tree);

//        System.out.println("Listener:");
//        ParseTreeWalker walker = new ParseTreeWalker();
//        MyHiveListener listener = new MyHiveListener();
//        walker.walk(listener, tree);

    }

}
