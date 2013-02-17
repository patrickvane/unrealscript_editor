package com.patrick_vane.unrealscript.editor.parser;


public class CodeWord
{
	protected StringBuilder characters = new StringBuilder();
	protected String word;
	
	protected int firstCharacterPosition;
	protected int lastCharacterPosition;
	
	protected boolean closed = false;
	
	
	public CodeWord( int characterPosition )
	{
		this.firstCharacterPosition = characterPosition;
	}
	
	public void close( int characterPosition )
	{
		if( !closed )
		{
			closed = true;
			this.lastCharacterPosition = characterPosition;
			word = characters.toString();
			characters = null;
		}
	}
	
	
	public void addCharacter( char character )
	{
		characters.append( character );
	}
	
	
	public int getFirstCharacterPosition()
	{
		return firstCharacterPosition;
	}
	public int getLastCharacterPosition()
	{
		return lastCharacterPosition;
	}
	public String getWord()
	{
		return word;
	}
	public boolean isClosed()
	{
		return closed;
	}
}
