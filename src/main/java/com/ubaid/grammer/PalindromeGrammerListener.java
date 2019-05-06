// Generated from PalindromeGrammer.g4 by ANTLR 4.7.2
package com.ubaid.grammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PalindromeGrammerParser}.
 */
public interface PalindromeGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PalindromeGrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PalindromeGrammerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PalindromeGrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PalindromeGrammerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PalindromeGrammerParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(PalindromeGrammerParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link PalindromeGrammerParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(PalindromeGrammerParser.PContext ctx);
}