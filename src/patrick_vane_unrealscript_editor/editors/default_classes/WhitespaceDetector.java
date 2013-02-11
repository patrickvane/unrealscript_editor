package patrick_vane_unrealscript_editor.editors.default_classes;

import org.eclipse.jface.text.rules.IWhitespaceDetector;


public class WhitespaceDetector implements IWhitespaceDetector
{
	protected static WhitespaceDetector instance = new WhitespaceDetector();
	
	
	protected WhitespaceDetector()
	{
	}
	
	public static WhitespaceDetector getSharedInstance()
	{
		return instance;
	}
	
	
	@Override
	public boolean isWhitespace( char c )
	{
		return Character.isWhitespace( c );
	}
}
