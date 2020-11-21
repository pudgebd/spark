package pers.pudge.spark.practices.officialApi.a.antlr4.hive.myCode;

import pers.pudge.spark.practices.officialApi.a.antlr4.hive.HplsqlBaseListener;
import pers.pudge.spark.practices.officialApi.a.antlr4.hive.HplsqlBaseVisitor;
import pers.pudge.spark.practices.officialApi.a.antlr4.hive.HplsqlParser;

public class MyHiveListener extends HplsqlBaseListener {


    @Override
    public void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        System.out.println(ctx.getText());
        System.out.println(ctx.cte_select_stmt());
        System.out.println(ctx.fullselect_stmt());


        super.enterSelect_stmt(ctx);
    }


    @Override
    public void exitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        super.exitSelect_stmt(ctx);
    }
}
