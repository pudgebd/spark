// Generated from Ip.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.ip;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IpParser}.
 */
public interface IpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code findOneRow}
	 * labeled alternative in {@link IpParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterFindOneRow(IpParser.FindOneRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findOneRow}
	 * labeled alternative in {@link IpParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitFindOneRow(IpParser.FindOneRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void enterDate(IpParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void exitDate(IpParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ip}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void enterIp(IpParser.IpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ip}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void exitIp(IpParser.IpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code api}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void enterApi(IpParser.ApiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code api}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void exitApi(IpParser.ApiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code respCode}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRespCode(IpParser.RespCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code respCode}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRespCode(IpParser.RespCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sendData}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void enterSendData(IpParser.SendDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sendData}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void exitSendData(IpParser.SendDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code end}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void enterEnd(IpParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code end}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 */
	void exitEnd(IpParser.EndContext ctx);
}