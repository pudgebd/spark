package pers.pudge.spark.practices.officialApi.a.antlr4.hive.myCode;

import pers.pudge.spark.practices.officialApi.a.antlr4.hive.HplsqlBaseVisitor;
import pers.pudge.spark.practices.officialApi.a.antlr4.hive.HplsqlParser;


public class MyHiveVisitor extends HplsqlBaseVisitor<String> {


    @Override
    public String visitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
//        System.out.println(ctx.);
        System.out.println(ctx.fullselect_stmt());
        return super.visitSelect_stmt(ctx);
    }


}
