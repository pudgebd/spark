package pers.pudge.spark.practices.officialApi.a.antlr4.arrayinit.blog;

import org.antlr.v4.runtime.tree.TerminalNode;
import pers.pudge.spark.practices.officialApi.a.antlr4.arrayinit.ArrayInitBaseListener;
import pers.pudge.spark.practices.officialApi.a.antlr4.arrayinit.ArrayInitParser;

/* 将像{1,2,3}这样的数组转换为"\u0001\u0002\u0003" */
public class ShortToUnicodeString extends ArrayInitBaseListener {

    /* 将`{`翻译为`"` */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /* 将`}`翻译为`"` */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /* 将整数翻译为以`\\u`为前缀的四位十六进制字符串 */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        // 假设没有嵌套
        TerminalNode tn = ctx.INT();
        String txt = tn.getText();
        int value = Integer.valueOf(txt);
        System.out.printf("\\u%04x", value);
    }

}
