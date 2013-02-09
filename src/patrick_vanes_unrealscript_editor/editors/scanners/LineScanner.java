package patrick_vanes_unrealscript_editor.editors.scanners;

import java.util.ArrayList;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import patrick_vanes_unrealscript_editor.editors.default_classes.WhitespaceDetector;
import patrick_vanes_unrealscript_editor.editors.default_classes.WordDetector;
import patrick_vanes_unrealscript_editor.editors.settings.TextAttributeConstant;
import patrick_vanes_unrealscript_editor.editors.settings.WordConstant;


public class LineScanner extends RuleBasedScanner
{
	private static IToken keyword 	= new Token( TextAttributeConstant.KEYWORD );
	private static IToken string 	= new Token( TextAttributeConstant.STRING );
	private static IToken comment 	= new Token( TextAttributeConstant.COMMENT );
	private static IToken other 	= new Token( TextAttributeConstant.DEFAULT );
	
	
	public LineScanner()
	{
		ArrayList<IRule> rules = new ArrayList<IRule>();
		
		
		rules.add( new EndOfLineRule("//", comment) );
		
		rules.add( new SingleLineRule("\"", "\"", string, '\\') );
		rules.add( new SingleLineRule("'", "'", string, '\\') );
		
		rules.add( new WhitespaceRule(WhitespaceDetector.getSharedInstance()) );
		
		WordRule wordRule = new WordRule( WordDetector.getSharedInstance(), other, true );
		for( int i=0; i<WordConstant.KEYWORDS.length; i++ )
		{
			wordRule.addWord( WordConstant.KEYWORDS[i], keyword );
		}
		rules.add( wordRule );
		
		
		setRules( rules.toArray(new IRule[0]) );
	}
}
