package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public interface Code
{
	public boolean isClosed();
	public void close();
	
	public boolean isNewWordOpen();
	
	public ArrayList<CodeWord> getLastLine();
	public CodeWord getLastCompletedWord();
	public int getFirstCharacterPosition();
	public int getLastCharacterPosition();
	public boolean isInFunction();
	
	public boolean isChildOf( CodeBlock block );
	public int getBlockNumber();
	public int getDepth();
	
	public void addCharacter( int characterPosition, char character );
	public void closeWord( int characterPosition );
	public void newLine();
	
	public CodeBlock getParent();
}
