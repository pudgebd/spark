// Generated from Ip.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.ip;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code findOneRow}
	 * labeled alternative in {@link IpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindOneRow(IpParser.FindOneRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(IpParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ip}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp(IpParser.IpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code api}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApi(IpParser.ApiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code respCode}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespCode(IpParser.RespCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sendData}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendData(IpParser.SendDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code end}
	 * labeled alternative in {@link IpParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(IpParser.EndContext ctx);
}