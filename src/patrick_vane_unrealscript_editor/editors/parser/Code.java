package patrick_vane_unrealscript_editor.editors.parser;

import java.util.ArrayList;


public interface Code
{
	public boolean isClosed();
	public void close();
	
	public boolean isNewWordOpen();
	
	public ArrayList<CodeWord> getLastLine();
	
	public int getDepth();
	
	public void addCharacter( int characterPosition, char character );
	//public void newWord( int characterPosition );
	public void closeWord( int characterPosition );
	public void newLine();
	
	public CodeBlock getParent();
}
