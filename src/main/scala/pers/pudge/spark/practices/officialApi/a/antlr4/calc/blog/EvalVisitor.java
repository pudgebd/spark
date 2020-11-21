package pers.pudge.spark.practices.officialApi.a.antlr4.calc.blog;

import pers.pudge.spark.practices.officialApi.a.antlr4.calc.CalcBaseVisitor;
import pers.pudge.spark.practices.officialApi.a.antlr4.calc.CalcParser;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CalcBaseVisitor<Double> {

    public Map<String, Double> vars = new HashMap<>();

    // stmt : ID '=' expr_not_good NEWLINE ;
    @Override
    public Double visitAssign(CalcParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Double val = visit(ctx.expr());
        vars.put(id, val);
        return val;
    }

    // stmt : expr_not_good NEWLINE ;
    @Override
    public Double visitPrintExpr(CalcParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        System.out.println(value);
        return .0;
    }

    // expr_not_good : INT ;
    @Override
    public Double visitLiteral(CalcParser.LiteralContext ctx) {
        return Double.valueOf(ctx.NUMBER().getText());
    }

    // expr_not_good : ID ;
    @Override
    public Double visitId(CalcParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (vars.containsKey(id)) return vars.get(id);
        return .0;
    }

    // expr_not_good : expr_not_good op=('*'|'/') expr_not_good ;
    @Override
    public Double visitMulDiv(CalcParser.MulDivContext ctx) {
        double lhs = visit(ctx.expr(0));
        double rhs = visit(ctx.expr(1));
        if (ctx.op.getType() == CalcParser.MUL) return lhs * rhs;
        return lhs / rhs;
    }

    // expr_not_good : expr_not_good op=('+'|'-') expr_not_good ;
    @Override
    public Double visitAddSub(CalcParser.AddSubContext ctx) {
        double lhs = visit(ctx.expr(0));
        double rhs = visit(ctx.expr(1));
        if (ctx.op.getType() == CalcParser.ADD) return lhs + rhs;
        return lhs - rhs;
    }

    // expr_not_good : '(' expr_not_good ')' ;
    @Override
    public Double visitParen(CalcParser.ParenContext ctx) {
        return visit(ctx.expr());
    }

}
