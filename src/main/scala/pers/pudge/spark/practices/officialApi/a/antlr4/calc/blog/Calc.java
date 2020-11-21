package pers.pudge.spark.practices.officialApi.a.antlr4.calc.blog;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import pers.pudge.spark.practices.officialApi.a.antlr4.calc.*;

public class Calc {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("example/1.txt"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        CalcLexer lexer = new CalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        ParseTree tree = parser.calc(); // calc is the starting rule

        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();

        System.out.println("Visitor:");
        EvalVisitor evalByVisitor = new EvalVisitor();
        evalByVisitor.visit(tree);
        System.out.println();

        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        Evaluator evalByListener = new Evaluator();
        walker.walk(evalByListener, tree);
    }

}
