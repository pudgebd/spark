package pers.pudge.spark.practices.officialApi.a.antlr4.unknown.myCode;

import org.antlr.v4.runtime.Token;
import pers.pudge.spark.practices.officialApi.a.antlr4.unknown.UnknownBaseListener;
import pers.pudge.spark.practices.officialApi.a.antlr4.unknown.UnknownParser;

public class MyUnknownListener extends UnknownBaseListener {

    @Override
    public void enterManyrows(UnknownParser.ManyrowsContext ctx) {
//        System.out.println(ctx.getText());
        super.enterManyrows(ctx);
    }


    @Override
    public void enterStr(UnknownParser.StrContext ctx) {
        System.out.println(ctx.getText());
        super.enterStr(ctx);
    }

    @Override
    public void enterDate(UnknownParser.DateContext ctx) {
//        Token token = ctx.ipDate;
//        System.out.println(token.getText());
//        System.out.println(ctx.getText());
        super.enterDate(ctx);
    }

}
