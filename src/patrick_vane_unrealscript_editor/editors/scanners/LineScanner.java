package patrick_vane_unrealscript_editor.editors.scanners;

import java.util.ArrayList;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import patrick_vane_unrealscript_editor.editors.default_classes.KeywordDetector;
import patrick_vane_unrealscript_editor.editors.default_classes.WhitespaceDetector;
import patrick_vane_unrealscript_editor.editors.settings.TextAttributeConstant;
import patrick_vane_unrealscript_editor.editors.settings.WordConstant;


public class LineScanner extends RuleBasedScanner
{
	private IToken keyword 	= new Token( TextAttributeConstant.createKeyword() );
	private IToken string 	= new Token( TextAttributeConstant.createString() );
	private IToken comment 	= new Token( TextAttributeConstant.createComment() );
	private IToken other 	= new Token( TextAttributeConstant.createDefault() );
	
	
	public LineScanner()
	{
		ArrayList<IRule> rules = new ArrayList<IRule>();
		
		
		rules.add( new EndOfLineRule("//", comment) );
		
		rules.add( new SingleLineRule("\"", "\"", string, '\\') );
		rules.add( new SingleLineRule("'", "'", string, '\\') );
		
		rules.add( new WhitespaceRule(WhitespaceDetector.getSharedInstance()) );
		
		WordRule wordRule = new WordRule( KeywordDetector.getSharedInstance(), other, true );
		for( int i=0; i<WordConstant.KEYWORDS.length; i++ )
		{
			wordRule.addWord( WordConstant.KEYWORDS[i], keyword );
		}
		rules.add( wordRule );
		
		
		setRules( rules.toArray(new IRule[0]) );
	}
}
