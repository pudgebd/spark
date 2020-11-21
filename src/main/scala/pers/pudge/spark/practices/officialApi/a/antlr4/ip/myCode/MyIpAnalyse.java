package pers.pudge.spark.practices.officialApi.a.antlr4.ip.myCode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyIpAnalyse {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/main/resources/antlr/access_log.txt"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        IpLexer lexer = new IpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IpParser parser = new IpParser(tokens);
        ParseTree tree = parser.prog(); //starting rule

//        System.out.println("LISP:");
//        System.out.println(tree.toStringTree(parser));
//        System.out.println();

//        System.out.println("Visitor:");
//        MyIpVisitor myIpVisitor = new MyIpVisitor();
//        myIpVisitor.visit(tree);

        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        MyIpListener myIpListener = new MyIpListener();
        walker.walk(myIpListener, tree);
    }

}
