package pers.pudge.spark.practices.officialApi.a.antlr4.enchar;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pers.pudge.spark.practices.officialApi.a.antlr4.arrayinit.blog.ShortToUnicodeString;

public class TestEnChar {


    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        EnCharLexer lexer = new EnCharLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        EnCharParser parser = new EnCharParser(tokens);

        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println();
    }


}
