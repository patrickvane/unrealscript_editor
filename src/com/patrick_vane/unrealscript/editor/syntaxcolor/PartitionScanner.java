package com.patrick_vane.unrealscript.editor.syntaxcolor;

import java.util.ArrayList;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import com.patrick_vane.unrealscript.editor.constants.TagConstant;


public class PartitionScanner extends RuleBasedPartitionScanner
{
	private IToken commentLine 	= new Token( TagConstant.COMMENT_LINE );
	private IToken commentBlock = new Token( TagConstant.COMMENT_BLOCK );
	private IToken docsBlock 	= new Token( TagConstant.DOCS );
	private IToken string 		= new Token( TagConstant.STRING );
	
	
	public PartitionScanner()
	{
		ArrayList<IPredicateRule> rules = new ArrayList<IPredicateRule>();
		
		rules.add( new EndOfLineRule("//", commentLine) );
		
		rules.add( new SingleLineRule("\"", "\"", string, '\\') );
		rules.add( new SingleLineRule("'", "'", string, '\\') );
		
		rules.add( new MultiLineRule("/**", "*/", docsBlock, (char)0, true) );
		rules.add( new MultiLineRule("/*", "*/", commentBlock, (char)0, true) );
		
		setPredicateRules( rules.toArray(new IPredicateRule[0]) );
	}
}