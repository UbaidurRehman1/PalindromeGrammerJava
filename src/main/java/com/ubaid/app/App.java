package com.ubaid.app;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import com.ubaid.grammer.PalindromeGrammerLexer;
import com.ubaid.grammer.PalindromeGrammerParser;


public class App
{
	public static void main(String [] args)
	{
		String str = "23+21*(15/23)\r\n";
		
//		CharStream input = CharStreams.fromString(str);
//		
//        CExpressionLexer lexer = new CExpressionLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        CExpressionParser parser = new CExpressionParser(tokens);
//        ParseTree tree = parser.prog(); // parse
//        
//        System.out.println(Trees.toStringTree(tree));

		
		String p1 = "aabb";
		
		CharStream s1 = CharStreams.fromString(p1);
		
		PalindromeGrammerLexer lexer = new PalindromeGrammerLexer(s1);
		CommonTokenStream token = new CommonTokenStream(lexer);
		PalindromeGrammerParser parser = new PalindromeGrammerParser(token);
		
		ParseTree tree = parser.prog();
		
		System.out.println(Trees.toStringTree(tree));
		
	}
}
