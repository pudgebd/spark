package pers.pudge.spark.practices.officialApi.a.antlr4.rows.book;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import pers.pudge.spark.practices.officialApi.a.antlr4.labeledExpr.LabeledExprLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.labeledExpr.LabeledExprParser;
import pers.pudge.spark.practices.officialApi.a.antlr4.labeledExpr.blog.EvalVisitor;
import pers.pudge.spark.practices.officialApi.a.antlr4.rows.RowsLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.rows.RowsParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class RowsCal {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("src/main/resources/antlr/rows.txt");

        ANTLRInputStream input = new ANTLRInputStream(is);
        RowsLexer lexer = new RowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        int colIndex = 0;

        RowsParser parser = new RowsParser(tokens, colIndex);
        parser.setBuildParseTree(false);
        parser.file();
    }

}
