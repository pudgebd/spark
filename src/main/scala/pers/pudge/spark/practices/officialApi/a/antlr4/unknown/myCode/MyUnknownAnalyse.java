package pers.pudge.spark.practices.officialApi.a.antlr4.unknown.myCode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pers.pudge.spark.practices.officialApi.a.antlr4.unknown.UnknownLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.unknown.UnknownParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyUnknownAnalyse {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/main/resources/antlr/unknown.txt"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        UnknownLexer lexer = new UnknownLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UnknownParser parser = new UnknownParser(tokens);
        ParseTree tree = parser.manyrows(); //starting rule

//        System.out.println("LISP:");
//        System.out.println(tree.toStringTree(parser));
//        System.out.println();

//        System.out.println("Visitor:");
//        MyUnknownVisitor myUnknownVisitor = new MyUnknownVisitor();
//        myUnknownVisitor.visit(tree);
//        System.out.println();

        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        MyUnknownListener myUnknownListener = new MyUnknownListener();
        walker.walk(myUnknownListener, tree);
    }

}
