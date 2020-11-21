package pers.pudge.spark.practices.officialApi.a.antlr4.sqlite.myCode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pers.pudge.spark.practices.officialApi.a.antlr4.sqlite.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        // The list that will hold our function names.
        final List<String> functionNames = new ArrayList<String>();

        // The select-statement to be parsed.
        String sql1 = "SELECT log AS x FROM t1 \n" +
                "GROUP BY x\n" +
                "HAVING count(*) >= 4 \n" +
                "ORDER BY max(n) + 0";

        String sql = "create table if not exists LH_00CIF_D_POPNEXT_DT (\n" +
                "Pid string comment 'PID' ,\n" +
                "OpnProv string comment '注册省市代码' ,\n" +
                "OpnBk string comment '注册机构' ,\n" +
                "newfielddate string comment '新增日期' ) lifecycle 365;";

        // Create a lexer and parser for the input.
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));

        // Invoke the `select_stmt` production.
        ParseTree tree = parser.create_table_stmt();

        // Walk the `select_stmt` production and listen when the parser
        // enters the `expr` production.
        ParseTreeWalker.DEFAULT.walk(new SQLiteBaseListener(){

            @Override
            public void enterExpr(@NotNull SQLiteParser.ExprContext ctx) {
                // Check if the expression is a function call.
                if (ctx.function_name() != null) {
                    // Yes, it was a function call: add the name of the function
                    // to out list.
                    functionNames.add(ctx.function_name().getText());
                }
            }

            @Override
            public void enterCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx) {
                System.out.println(ctx.lifecycleNum.getText());
                super.enterCreate_table_stmt(ctx);
            }
        }, tree);

        // Print the parsed functions.
        System.out.println("functionNames=" + functionNames);
    }
}
