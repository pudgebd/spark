package pers.pudge.spark.practices.officialApi.a.antlr4.calc.blog;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import pers.pudge.spark.practices.officialApi.a.antlr4.calc.CalcBaseListener;
import pers.pudge.spark.practices.officialApi.a.antlr4.calc.CalcParser;

import java.util.HashMap;
import java.util.Map;

public class Evaluator extends CalcBaseListener {

    public Map<String, Double> vars = new HashMap<>();
    public ParseTreeProperty<Double> values = new ParseTreeProperty<>();

    // stmt : ID '=' expr_not_good NEWLINE ;
    @Override
    public void exitAssign(CalcParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Double val = values.get(ctx.expr());
        vars.put(id, val);
    }

    // stmt : expr_not_good NEWLINE ;
    @Override
    public void exitPrintExpr(CalcParser.PrintExprContext ctx) {
        System.out.println(values.get(ctx.expr()));
    }

    // expr_not_good : NUMBER ;
    @Override
    public void exitLiteral(CalcParser.LiteralContext ctx) {
        values.put(ctx, Double.valueOf(ctx.NUMBER().getText()));
    }

    // expr_not_good : ID ;
    @Override
    public void exitId(CalcParser.IdContext ctx) {
        values.put(ctx, vars.containsKey(ctx.ID().getText()) ? vars.get(ctx.ID().getText()) : .0);
    }

    // expr_not_good : expr_not_good op=('*'|'/') expr_not_good ;
    @Override
    public void exitMulDiv(CalcParser.MulDivContext ctx) {
        double lhs = values.get(ctx.expr(0));
        double rhs = values.get(ctx.expr(1));
        values.put(ctx, ctx.op.getType() == CalcParser.MUL ? lhs * rhs : lhs / rhs);
    }

    // expr_not_good : expr_not_good op=('+'|'-') expr_not_good ;
    @Override
    public void exitAddSub(CalcParser.AddSubContext ctx) {
        double lhs = values.get(ctx.expr(0));
        double rhs = values.get(ctx.expr(1));
        values.put(ctx, ctx.op.getType() == CalcParser.ADD ? lhs + rhs : lhs - rhs);
    }

    // expr_not_good : '(' expr_not_good ')' ;
    @Override
    public void exitParen(CalcParser.ParenContext ctx) {
        values.put(ctx, values.get(ctx.expr()));
    }

}
