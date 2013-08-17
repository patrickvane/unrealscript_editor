package com.patrick_vane.unrealscript.editor.parser;


public class CodeWord
{
	public static class CodeWordData
	{
		public final CodeWord	word;
		public final CodeWord[]	line;
		public final int		inLineArrayPos;
		public final boolean	function;
		
		public CodeWordData( CodeWord word, CodeWord[] line, int inLineArrayPos, boolean function )
		{
			this.word = word;
			this.line = line;
			this.inLineArrayPos = inLineArrayPos;
			this.function = function;
		}
		
		public CodeWordData getParentWord()
		{
			return word.getParentWord( line, inLineArrayPos );
		}
	}
	
	
	protected StringBuilder	characters	= new StringBuilder();
	protected String		word;
	
	protected int			firstCharacterPosition;
	protected int			lastCharacterPosition;
	
	protected boolean		closed		= false;
	
	
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
		if( ((word == null) || (other.word == null)) && ((word != null) || (other.word != null)) )
			return false;
		if( !word.equals(other.word) )
			return false;
		return true;
	}
	
	
	public CodeWordData getParentWord( CodeWord[] line )
	{
		for( int i=0; i<line.length; i++ )
		{
			if( equals(line[i]) )
			{
				return getParentWord( line, i );
			}
		}
		return null;
	}
	public CodeWordData getParentWord( CodeWord[] line, int inLineArrayPos )
	{
		int brackets 		= 0;
		int squareBrackets 	= 0;
		int parentheses 	= 0;
		int chevrons 		= 0;
		boolean hadDot 		= false;
		boolean function 	= false;
		
		CodeWord mainWord = line[inLineArrayPos];
		hadDot = ".".equals( mainWord.getWord() );
		
		if( "(".equals(mainWord.getWord()) )
			return null;
		
		for( int i=inLineArrayPos-1; i>=0; i-- )
		{
			CodeWord word = line[i];
			String wordWord = word.getWord();
			
			if( "(".equals(wordWord) )
			{
				if( brackets <= 0 )
					return null;
				brackets--;
				function = true;
				continue;
			}
			else if( "[".equals(wordWord) )
			{
				if( squareBrackets <= 0 )
					return null;
				squareBrackets--;
				continue;
			}
			else if( "{".equals(wordWord) )
			{
				if( parentheses <= 0 )
					return null;
				parentheses--;
				continue;
			}
			else if( "<".equals(wordWord) )
			{
				if( chevrons <= 0 )
					return null;
				chevrons--;
				continue;
			}
			else if( ")".equals(wordWord) )
			{
				brackets++;
			}
			else if( "]".equals(wordWord) )
			{
				squareBrackets++;
			}
			else if( "}".equals(wordWord) )
			{
				parentheses++;
			}
			else if( ">".equals(wordWord) )
			{
				chevrons++;
			}
			
			if( brackets > 0 )
				continue;
			if( squareBrackets > 0 )
				continue;
			if( parentheses > 0 )
				continue;
			if( chevrons > 0 )
				continue;
			
			if( "'".equals(wordWord) )
				continue;
			
			if( ".".equals(wordWord) )
			{
				if( hadDot )
					return null;
				
				hadDot = true;
				continue;
			}
			
			if( !hadDot )
				return null;
			
			if( !function )
			{
				if( "static".equals(wordWord) || "self".equals(wordWord) || "default".equals(wordWord) || "super".equals(wordWord) || "global".equals(wordWord) )
				{
					hadDot = false;
					continue;
				}
			}
			
			return new CodeWordData( word, line, i, function );
		}
		
		return null;
	}
}
