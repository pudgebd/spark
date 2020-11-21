// Generated from Unknown.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.unknown;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UnknownParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UnknownVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UnknownParser#manyrows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyrows(UnknownParser.ManyrowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str}
	 * labeled alternative in {@link UnknownParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(UnknownParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date}
	 * labeled alternative in {@link UnknownParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(UnknownParser.DateContext ctx);
}