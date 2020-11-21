// Generated from Unknown.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.unknown;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UnknownParser}.
 */
public interface UnknownListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UnknownParser#manyrows}.
	 * @param ctx the parse tree
	 */
	void enterManyrows(UnknownParser.ManyrowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnknownParser#manyrows}.
	 * @param ctx the parse tree
	 */
	void exitManyrows(UnknownParser.ManyrowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str}
	 * labeled alternative in {@link UnknownParser#row}.
	 * @param ctx the parse tree
	 */
	void enterStr(UnknownParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code str}
	 * labeled alternative in {@link UnknownParser#row}.
	 * @param ctx the parse tree
	 */
	void exitStr(UnknownParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date}
	 * labeled alternative in {@link UnknownParser#row}.
	 * @param ctx the parse tree
	 */
	void enterDate(UnknownParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date}
	 * labeled alternative in {@link UnknownParser#row}.
	 * @param ctx the parse tree
	 */
	void exitDate(UnknownParser.DateContext ctx);
}