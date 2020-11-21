package pers.pudge.spark.practices.officialApi.a.antlr4.ip.myCode;

import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpBaseVisitor;
import pers.pudge.spark.practices.officialApi.a.antlr4.ip.IpParser;

public class MyIpVisitor extends IpBaseVisitor<String> {

    @Override
    public String visitFindOneRow(IpParser.FindOneRowContext ctx) {
//        System.out.println(ctx.getText());
        return super.visitFindOneRow(ctx);
    }

    @Override
    public String visitIp(IpParser.IpContext ctx) {
        System.out.println(ctx.IP());
        return super.visitIp(ctx);
    }

    @Override
    public String visitDate(IpParser.DateContext ctx) {
        return super.visitDate(ctx);
    }

    @Override
    public String visitApi(IpParser.ApiContext ctx) {
        return super.visitApi(ctx);
    }

    @Override
    public String visitRespCode(IpParser.RespCodeContext ctx) {
        return super.visitRespCode(ctx);
    }

    @Override
    public String visitSendData(IpParser.SendDataContext ctx) {
        return super.visitSendData(ctx);
    }

    @Override
    public String visitEnd(IpParser.EndContext ctx) {
        return super.visitEnd(ctx);
    }
}
