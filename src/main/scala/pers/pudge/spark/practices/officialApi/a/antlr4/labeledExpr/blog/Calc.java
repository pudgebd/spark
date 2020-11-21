package pers.pudge.spark.practices.officialApi.a.antlr4.labeledExpr.blog;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import pers.pudge.spark.practices.officialApi.a.antlr4.labeledExpr.LabeledExprLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.labeledExpr.LabeledExprParser;

import java.io.FileInputStream;
import java.io.InputStream;

public class Calc {

    public static void main(String[] args) throws Exception {
//        String inputFile = null;
//        if ( args.length>0 ) inputFile = args[0];
//        InputStream is = System.in;
//        if ( inputFile!=null ) is = new FileInputStream(inputFile);

        InputStream is = new FileInputStream("src/main/resources/antlr/calc.txt");

        ANTLRInputStream input = new ANTLRInputStream(is);
        LabeledExprLexer lexer = new LabeledExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog(); // parse

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }

}
