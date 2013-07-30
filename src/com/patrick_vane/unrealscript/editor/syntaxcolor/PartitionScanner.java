package com.patrick_vane.unrealscript.editor.syntaxcolor;

import java.util.ArrayList;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import com.patrick_vane.unrealscript.editor.constants.TagConstant;


public class PartitionScanner extends RuleBasedPartitionScanner
{
	private IToken	commentLine			= new Token( TagConstant.COMMENT_LINE );
	private IToken	commentBlock		= new Token( TagConstant.COMMENT_BLOCK );
	private IToken	docsBlock			= new Token( TagConstant.DOCS );
	private IToken	string				= new Token( TagConstant.STRING );
	
	public int		commentBlockCount	= 0;
	
	
	public PartitionScanner()
	{
		ArrayList<IPredicateRule> rules = new ArrayList<IPredicateRule>();
		
		rules.add( new EndOfLineRule("//", commentLine) );
		
		rules.add( new SingleLineRule("\"", "\"", string, '\\') );
		rules.add( new SingleLineRule("'", "'", string, '\\') );
		
		rules.add( new EmptyCommentRule(commentBlock) );
		
		rules.add( new MultiLineRule("/**", "*/", docsBlock, (char)0, true) );
		rules.add( new MultiLineRule("/*", "*/", commentBlock, (char)0, true) );
		
		setPredicateRules( rules.toArray(new IPredicateRule[0]) );
	}
	
	
	private static class EmptyCommentRule extends WordRule implements IPredicateRule
	{
		private IToken successToken;
		
		public EmptyCommentRule( IToken successToken )
		{
			super
			(
				new IWordDetector()
				{
					@Override
					public boolean isWordStart( char c )
					{
						return (c == '/');
					}
					@Override
					public boolean isWordPart( char c )
					{
						return ((c == '*') || (c == '/'));
					}
				}
			);
			this.successToken = successToken;
			addWord( "/**/", successToken );
		}
		
		@Override
		public IToken evaluate( ICharacterScanner scanner, boolean resume )
		{
			return super.evaluate( scanner );
		}
		
		@Override
		public IToken getSuccessToken()
		{
			return successToken;
		}
	}
}
