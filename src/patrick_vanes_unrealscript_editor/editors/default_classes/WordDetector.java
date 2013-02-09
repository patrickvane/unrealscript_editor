package patrick_vanes_unrealscript_editor.editors.default_classes;

import org.eclipse.jface.text.rules.IWordDetector;


public class WordDetector implements IWordDetector
{
	protected static WordDetector instance = new WordDetector();
	
	
	protected WordDetector()
	{
	}
	
	public static WordDetector getSharedInstance()
	{
		return instance;
	}
	
	
	@Override
	public boolean isWordPart( char c )
	{
		return ((c == '_') || Character.isLetterOrDigit(c));
	}
	
	@Override
	public boolean isWordStart( char c )
	{
		return ((c == '_') || Character.isLetter(c));
	}
}
