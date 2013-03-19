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
	/** Use getWord() instead. */
	@Override
	@Deprecated
	public String toString()
	{
		return word;
	}
	public String getWord()
	{
		return word;
	}
	public boolean isClosed()
	{
		return closed;
	}
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + firstCharacterPosition;
		result = prime * result + lastCharacterPosition;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	
	@Override
	public boolean equals( Object obj )
	{
		if( this == obj )
			return true;
		if( obj == null )
			return false;
		if( getClass() != obj.getClass() )
			return false;
		CodeWord other = (CodeWord) obj;
		if( firstCharacterPosition != other.firstCharacterPosition )
			return false;
		if( lastCharacterPosition != other.lastCharacterPosition )
			return false;
		if( word == null )
		{
			if( other.word != null )
				return false;
		}
		else if( !word.equals(other.word) )
			return false;
		return true;
	}
}
