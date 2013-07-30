package com.patrick_vane.unrealscript.editor.parser;


class UnrealScriptParserBracketBlock
{
	private static final char ROOT_CHAR = ' ';
	
	private UnrealScriptParserBracketBlock parent;
	private CodeWord keyword;
	private char closeBracketCharacter;
	@SuppressWarnings( "unused" )
	private char openBracketCharacter;
	
	
	public UnrealScriptParserBracketBlock()
	{
		this.parent = null;
		this.keyword = null;
		this.openBracketCharacter = ROOT_CHAR;
		this.closeBracketCharacter = ROOT_CHAR;
	}
	
	public UnrealScriptParserBracketBlock( UnrealScriptParserBracketBlock parent, CodeWord keyword, char openBracketCharacter, char closeBracketCharacter )
	{
		this.parent = parent;
		this.keyword = keyword;
		this.openBracketCharacter = openBracketCharacter;
		this.closeBracketCharacter = closeBracketCharacter;
	}
	
	
	public void newLine( int characterPosition ) throws CodeException
	{
		if( (openBracketCharacter == '(') || (openBracketCharacter == '[') )
			if( !canBracketsContainSemicolon() )
				throw new CodeException( characterPosition, characterPosition+1, true, "Unexpected: ;" );
	}
	
	private boolean canBracketsContainSemicolon()
	{
		if( openBracketCharacter == '{' )
			return true;
		if( getKeywordWord() == null )
			return false;
		
		String word = getKeywordWord().toLowerCase();
		
		if( word.equals("for") )
			return true;
		if( word.endsWith("virtual") )
			return true;
		
		return true;
	}
	
	
	public void close( int characterPosition ) throws CodeException
	{
		close( characterPosition, ROOT_CHAR, ROOT_CHAR );
	}
	
	public void close( int characterPosition, char openBracketCharacter, char closeBracketCharacter ) throws CodeException
	{
		if( this.closeBracketCharacter != closeBracketCharacter )
		{
			if( closeBracketCharacter == ROOT_CHAR )
				throw new CodeException( characterPosition, characterPosition+1, true, "Missing: "+this.closeBracketCharacter );
			else if( this.closeBracketCharacter == ROOT_CHAR )
				throw new CodeException( characterPosition, characterPosition+1, true, "Missing: "+openBracketCharacter );
			else
				throw new CodeException( characterPosition, characterPosition+1, true, "Unexpected: "+closeBracketCharacter+", was expecting: "+this.closeBracketCharacter );
		}
	}
	
	
	public UnrealScriptParserBracketBlock getParent()
	{
		return parent;
	}
	public int getDepth()
	{
		int depth = 0;
		UnrealScriptParserBracketBlock block = parent;
		while( block.getParent() != null )
		{
			depth++;
			block = block.getParent();
		}
		return depth;
	}
	public CodeWord getKeyword()
	{
		return keyword;
	}
	public String getKeywordWord()
	{
		if( keyword == null )
			return null;
		return keyword.getWord();
	}
}