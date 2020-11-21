package pers.pudge.spark.practices.officialApi.a.antlr4.ip.myCode;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpBaseListener;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpParser;

public class MyIpListener extends IpBaseListener {

    @Override
    public void enterFindOneRow(IpParser.FindOneRowContext ctx) {
//        System.out.println(ctx.start);
//        System.out.println(ctx.stop);
        super.enterFindOneRow(ctx);
    }

    @Override
    public void exitFindOneRow(IpParser.FindOneRowContext ctx) {
//        System.out.println(ctx.toString()); //返回 []
        super.exitFindOneRow(ctx);
    }

    @Override
    public void enterIp(IpParser.IpContext ctx) {
//        System.out.println(ctx.IP());
        super.enterIp(ctx);
    }

    @Override
    public void exitIp(IpParser.IpContext ctx) {
//        System.out.println(ctx.IP());
        super.exitIp(ctx);
    }

    @Override
    public void enterDate(IpParser.DateContext ctx) {
        super.enterDate(ctx);
    }

    @Override
    public void exitDate(IpParser.DateContext ctx) {
//        System.out.println(ctx.DATE());
        super.exitDate(ctx);
    }

    @Override
    public void enterApi(IpParser.ApiContext ctx) {
        System.out.println(ctx.getText());
        super.enterApi(ctx);
    }

    @Override
    public void exitApi(IpParser.ApiContext ctx) {
//        System.out.println(ctx.STRING());
        super.exitApi(ctx);
    }

    @Override
    public void enterRespCode(IpParser.RespCodeContext ctx) {
        super.enterRespCode(ctx);
    }

    @Override
    public void exitRespCode(IpParser.RespCodeContext ctx) {
        super.exitRespCode(ctx);
    }

    @Override
    public void enterSendData(IpParser.SendDataContext ctx) {
        super.enterSendData(ctx);
    }

    @Override
    public void exitSendData(IpParser.SendDataContext ctx) {
        super.exitSendData(ctx);
    }

    @Override
    public void enterEnd(IpParser.EndContext ctx) {
        super.enterEnd(ctx);
    }

    @Override
    public void exitEnd(IpParser.EndContext ctx) {
        super.exitEnd(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
//        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓ enterEveryRule ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
//        System.out.println("children: " + ctx.children);
//        System.out.println("depth: " + ctx.depth());
//        System.out.println("exception: " + ctx.exception);
//        System.out.println("getRuleIndex: " + ctx.getRuleIndex());
//        System.out.println("getChild(0): " + ctx.getChild(0));
//        System.out.println("getChildCount: " + ctx.getChildCount());
//        System.out.println("getParent: " + ctx.getParent());
//        System.out.println("getRuleContext: " + ctx.getRuleContext());
//        System.out.println("getSourceInterval: " + ctx.getSourceInterval());
//        System.out.println("getStart: " + ctx.getStart());
//        System.out.println("getStop: " + ctx.getStop());
//        System.out.println("getAltNumber: " + ctx.getAltNumber());
//        System.out.println("getTokens(0): " + ctx.getTokens(0));
//        System.out.println("getPayload: " + ctx.getPayload());
//        System.out.println("getText: " + ctx.getText());
//        System.out.println("hashCode: " + ctx.hashCode());
//        System.out.println("invokingState: " + ctx.invokingState);
//        System.out.println("isEmpty: " + ctx.isEmpty());
//        System.out.println("parent: " + ctx.parent);
//        System.out.println("start: " + ctx.start);
//        System.out.println("stop: " + ctx.stop);
//        System.out.println("toString: " + ctx.toString());
//        System.out.println("toStringTree: " + ctx.toStringTree());
//        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑ enterEveryRule ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
//        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓ visitTerminal ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
//        System.out.println("getText: " + node.getText());
//        System.out.println("toString: " + node.toString());
//        System.out.println("toStringTree: " + node.toStringTree());
//        System.out.println("getSymbol: " + node.getSymbol());
//        System.out.println("getChildCount: " + node.getChildCount());
//        System.out.println("getChild(0): " + node.getChild(0));
//        System.out.println("getChild(1): " + node.getChild(1));
//        System.out.println("getChild(2): " + node.getChild(2));
//        System.out.println("getParent: " + node.getParent());
//        System.out.println("getPayload: " + node.getPayload());
//        System.out.println("getSourceInterval: " + node.getSourceInterval());
//        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑ visitTerminal ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}