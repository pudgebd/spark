package pers.pudge.spark.practices.officialApi.a.antlr4.spark.myCode;

import org.antlr.v4.runtime.Token;
import pers.pudge.spark.practices.officialApi.a.antlr4.spark.SqlBaseBaseVisitor;
import pers.pudge.spark.practices.officialApi.a.antlr4.spark.SqlBaseParser;

/**
 * org.apache.spark.sql.catalyst.parser.SqlBaseBaseVisitor
 */
public class MySqlBaseVisitor extends SqlBaseBaseVisitor<String> {


    @Override
    public String visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        return super.visitSingleStatement(ctx);
    }

    @Override
    public String visitCreateHiveTable(SqlBaseParser.CreateHiveTableContext ctx) {
        System.out.println(ctx.columns.getText());
        System.out.println(ctx.comment.getText());
        return super.visitCreateHiveTable(ctx);
    }

    @Override
    public String visitMyCreateTableStmt(SqlBaseParser.MyCreateTableStmtContext ctx) {
        Token token = ctx.lifecycleNum;
        System.out.println(token.getText());
//        System.out.println(token.getCharPositionInLine());
//        System.out.println(token.getStartIndex());
//        System.out.println(token.getStopIndex());
//        System.out.println(token.getLine());
//        System.out.println(token.getTokenSource().getSourceName());
//        System.out.println(token.getChannel());

//        System.out.println(ctx.columns.getText());
        return super.visitMyCreateTableStmt(ctx);
    }


    @Override
    public String visitQuery(SqlBaseParser.QueryContext ctx) {
        ctx.queryTerm();
        return super.visitQuery(ctx);
    }


    @Override
    public String visitMultipartIdentifier(SqlBaseParser.MultipartIdentifierContext ctx) {
        System.out.println(ctx.getText());
        return super.visitMultipartIdentifier(ctx);
    }
}
















