package pers.pudge.spark.practices.officialApi.a.antlr4.spark.myCode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import pers.pudge.spark.practices.officialApi.a.antlr4.spark.SqlBaseLexer;
import pers.pudge.spark.practices.officialApi.a.antlr4.spark.SqlBaseParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MySqlBaseAnalyse {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/main/resources/antlr/createExample.sql"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        //parser.removeErrorListeners(); 可选，控制台打印错误
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        ParseTree tree = parser.myCreateTableStmt(); //starting rule

        System.out.println("Visitor:");
        MySqlBaseVisitor visitor = new MySqlBaseVisitor();
        visitor.visit(tree);

        //失败的例子
//        DSLErrorListener errorListener = new DSLErrorListener();
//        //parser.removeErrorListeners();
//        parser.addErrorListener(errorListener);
//
//        if (errorListener.hasErrors()) {
//            System.err.printf("%s\n", errorListener);
//        } else {
//            ParseTree tree = parser.myCreateTableStmt(); //starting rule
//            System.out.println("Visitor:");
//            MySqlBaseVisitor visitor = new MySqlBaseVisitor();
//            visitor.visit(tree);
//        }
    }

}
