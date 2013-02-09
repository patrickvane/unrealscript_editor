package patrick_vanes_unrealscript_editor.editors.parser;

import java.util.ArrayList;


public interface Code
{
	public int getFirstLineNumber();
	public int getLastLineNumber();
	public void close( int lastLineNumber );
	public ArrayList<String> getLastLine();
	public int getDepth();
	public void addCharacter( char character );
	public void newWord();
	public void newLine();
	public CodeBlock getParent();
}
