package com.patrick_vane.unrealscript.editor.parser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.patrick_vane.unrealscript.editor.default_classes.KeywordDetector;
import com.patrick_vane.unrealscript.editor.default_classes.WhitespaceDetector;


public class UnrealScriptParser
{
	public static CodeException[] findErrors( String data )
	{
		CodeBlock block;
		try
		{
			block = parse( data );
		}
		catch( CodeException e )
		{
			return new CodeException[]{ e };
		}
		return findErrors( block );
	}
	public static CodeException[] findErrors( File file ) throws IOException
	{
		CodeBlock block;
		try
		{
			block = parse( file );
		}
		catch( CodeException e )
		{
			return new CodeException[]{ e };
		}
		return findErrors( block );
	}
	public static CodeException[] findErrors( CodeBlock data )
	{
		ArrayList<CodeException> errors = new ArrayList<CodeException>();
		findErrorsInBlock( errors, data );
		return errors.toArray( new CodeException[0] );
	}
	
	protected static void findErrorsInBlock( ArrayList<CodeException> errors, Code data )
	{
		if( data instanceof CodeBlockCode )
		{
			CodeBlockCode code = (CodeBlockCode) data;
			
			boolean isFunction = code.getParent().isFunction();
			boolean isInFunction = code.getParent().isInFunction();
			boolean isFirstInFunction = code.isFirstInFunction();
			
			boolean noLocalsAnymore = false;
			for( ArrayList<CodeWord> line : code.getLines() )
			{
				CodeWord worddata = null;
				String word = null;
				if( line.size() > 0 )
				{
					if( line.get(0) != null )
					{
						worddata = line.get( 0 );
						word = worddata.getWord();
					}
				}
				
				if( (worddata != null) && (word != null) )
				{
					if( isFunction || isInFunction )
					{
						if( word.equals("var") )
							errors.add( new CodeException( worddata.getFirstCharacterPosition(), worddata.getLastCharacterPosition(), true, "You can't make a var in a function, make a local instead") );
						
						if( (noLocalsAnymore || !isFirstInFunction) && word.equals("local") )
							errors.add( new CodeException( worddata.getFirstCharacterPosition(), worddata.getLastCharacterPosition(), true, "You can only make locals at the beginning of the function") );
						
						if( !noLocalsAnymore && !word.equals("local") && !word.equals("var") )
							noLocalsAnymore = true;
					}
				}
			}
		}
		else if( data instanceof CodeBlock )
		{
			CodeBlock block = (CodeBlock) data;
			for( Code child : block.getChilds() )
			{
				findErrorsInBlock( errors, child );
			}
		}
	}
	
	
	public static ArrayList<CodeAttribute> getAttributes( CodeBlock code )
	{
		ArrayList<CodeAttribute> attributes = new ArrayList<CodeAttribute>();
		for( Code child : code.getChilds() )
		{
			if( child instanceof CodeBlockCode )
			{
				attributes.addAll( getAttributes((CodeBlockCode)child) );
			}
		}
		return attributes;
	}
	public static ArrayList<CodeAttribute> getAttributes( CodeBlockCode code )
	{
		ArrayList<CodeAttribute> attributes = new ArrayList<CodeAttribute>();
		
		for( ArrayList<CodeWord> line : code.getLines() )
		{
			if( line.size() <= 0 )
				continue;
			
			if( line.get(0).getWord().equalsIgnoreCase("var") )
			{
				ArrayList<String> names = new ArrayList<String>();
				String type = "";
				ArrayList<String> modifiers = new ArrayList<String>();
				int i;
				
				// parse variable names >>
					{
						int brackets 		= 0;
						int squareBrackets 	= 0;
						int parentheses 	= 0;
						int chevrons 		= 0;
						boolean comma = true;
						for( i=line.size()-1; i>=1; i-- )
						{
							String word = line.get(i).getWord();
							char firstChar = word.charAt( 0 );
							
							if( !comma && (firstChar != ',') )
								break;
							
							if( firstChar == '<' )
							{
								chevrons++;
								continue;
							}
							else if( firstChar == '>' )
							{
								chevrons--;
								continue;
							}
							else if( firstChar == '(' )
							{
								parentheses++;
								continue;
							}
							else if( firstChar == ')' )
							{
								parentheses--;
								continue;
							}
							else if( firstChar == '[' )
							{
								squareBrackets++;
								continue;
							}
							else if( firstChar == ']' )
							{
								squareBrackets--;
								continue;
							}
							else if( firstChar == '{' )
							{
								brackets++;
								continue;
							}
							else if( firstChar == '}' )
							{
								brackets--;
								continue;
							}
							
							if( brackets != 0 )
								continue;
							if( squareBrackets != 0 )
								continue;
							if( parentheses != 0 )
								continue;
							if( chevrons != 0 )
								continue;
							
							if( comma )
							{
								names.add( word );
								comma = false;
								continue;
							}
							else if( firstChar == ',' )
							{
								comma = true;
								continue;
							}
							break;
						}
					}
				// parse variable names <<
				
				// parse variable type >>
					{
						int brackets 		= 0;
						int squareBrackets 	= 0;
						int parentheses 	= 0;
						int chevrons 		= 0;
						boolean noBrackets = true;
						for( ; i>=1; i-- )
						{
							String word = line.get(i).getWord();
							char firstChar = word.charAt( 0 );
							
							type = word + type;
							
							if( firstChar == '<' )
								chevrons++;
							else if( firstChar == '>' )
								chevrons--;
							else if( firstChar == '(' )
								parentheses++;
							else if( firstChar == ')' )
								parentheses--;
							else if( firstChar == '[' )
								squareBrackets++;
							else if( firstChar == ']' )
								squareBrackets--;
							else if( firstChar == '{' )
								brackets++;
							else if( firstChar == '}' )
								brackets--;
							
							if( brackets != 0 )
							{
								noBrackets = false;
								continue;
							}
							if( squareBrackets != 0 )
							{
								noBrackets = false;
								continue;
							}
							if( parentheses != 0 )
							{
								noBrackets = false;
								continue;
							}
							if( chevrons != 0 )
							{
								noBrackets = false;
								continue;
							}
							
							if( !noBrackets )
								noBrackets = true;
							else
								break;
						}
					}
				// parse variable type <<
				
				// parse variable modifiers >>
					{
						int brackets 		= 0;
						int squareBrackets 	= 0;
						int parentheses 	= 0;
						int chevrons 		= 0;
						String modifier = "";
						for( int j=1; j<i; j++ )
						{
							String word = line.get(j).getWord();
							char firstChar = word.charAt( 0 );
							
							modifier += word;
							
							if( firstChar == '<' )
								chevrons++;
							else if( firstChar == '>' )
								chevrons--;
							else if( firstChar == '(' )
								parentheses++;
							else if( firstChar == ')' )
								parentheses--;
							else if( firstChar == '[' )
								squareBrackets++;
							else if( firstChar == ']' )
								squareBrackets--;
							else if( firstChar == '{' )
								brackets++;
							else if( firstChar == '}' )
								brackets--;
							
							if( brackets != 0 )
								continue;
							if( squareBrackets != 0 )
								continue;
							if( parentheses != 0 )
								continue;
							if( chevrons != 0 )
								continue;
							
							modifiers.add( modifier );
							modifier = "";
						}
					}
				// parse variable modifiers <<
				
				for( int n=names.size()-1; n>=0; n-- )
				{
					attributes.add( new CodeAttributeVariable(modifiers, type, names.get(n)) );
				}
			}
			else
			{
				boolean function = false;
				for( int i=0; i<line.size(); i++ )
				{
					if( line.get(i).getWord().equalsIgnoreCase("function") )
					{
						function = true;
						break;
					}
				}
				
				if( function )
				{
					ArrayList<CodeAttributeVariable> parameters = new ArrayList<CodeAttributeVariable>();
					String name = "";
					String type = "";
					ArrayList<String> modifiers = new ArrayList<String>();
					int i;
					
					// parse parameters >>
						{
							String variableName = null;
							ArrayList<String> variableModifiers = new ArrayList<String>();
							String variableType = "";
							boolean gotType = false;
							String modifierWord = "";
							
							int brackets 		= 0;
							int squareBrackets 	= 0;
							int parentheses 	= 0;
							int chevrons 		= 0;
							for( i=line.size()-2; i>=0; i-- )
							{
								String word = line.get(i).getWord();
								char firstChar = word.charAt( 0 );
								
								if( firstChar == '<' )
									chevrons++;
								else if( firstChar == '>' )
									chevrons--;
								else if( firstChar == '(' )
									parentheses++;
								else if( firstChar == ')' )
									parentheses--;
								else if( firstChar == '[' )
									squareBrackets++;
								else if( firstChar == ']' )
									squareBrackets--;
								else if( firstChar == '{' )
									brackets++;
								else if( firstChar == '}' )
									brackets--;
								
								if( (firstChar == ',') || (parentheses >= 1) )
								{
									if( (brackets == 0) && (squareBrackets == 0) && (parentheses >= 0) && (chevrons == 0) )
									{
										if( variableName != null )
										{
											// add parameter >>
												parameters.add( new CodeAttributeVariable(variableModifiers, variableType, variableName) );
												variableModifiers = new ArrayList<String>();
												variableName = null;
												variableType = "";
												gotType = false;
											// add parameter <<
										}
										
										if( parentheses >= 1 )
											break;
										continue;
									}
								}
								
								if( variableName == null )
								{
									if( KeywordDetector.getSharedInstance().isWordStart(firstChar) )
									{
										variableName = word;
									}
									continue;
								}
								else
								{
									if( (firstChar == '=') || (firstChar == '-') || (firstChar == '.') )
									{
										variableName = null;
										continue;
									}
								}
								
								if( !gotType )
								{
									variableType = word + variableType;
								}
								else
								{
									modifierWord = word + modifierWord;
								}
								
								if( brackets != 0 )
									continue;
								if( squareBrackets != 0 )
									continue;
								if( parentheses != 0 )
									continue;
								if( chevrons != 0 )
									continue;
								
								if( !gotType )
								{
									if( (variableType.length() > 0) && KeywordDetector.getSharedInstance().isWordStart(variableType.charAt(0)) )
									{
										gotType = true;
									}
									continue;
								}
								else
								{
									variableModifiers.add( modifierWord );
									modifierWord = "";
								}
							}
							i--;
							Collections.reverse( parameters );
						}
					// parse parameters <<
					
					// parse name >>
						{
							if( i >= 0 )
							{
								name = line.get(i).getWord();
								i--;
							}
						}
					// parse name <<
					
					// parse return type >>
						{
							int brackets 		= 0;
							int squareBrackets 	= 0;
							int parentheses 	= 0;
							int chevrons 		= 0;
							for( ; i>=0; i-- )
							{
								String word = line.get(i).getWord();
								char firstChar = word.charAt( 0 );
								
								if( word.toLowerCase().equals("function") )
									break;
								
								if( firstChar == '<' )
									chevrons++;
								else if( firstChar == '>' )
									chevrons--;
								else if( firstChar == '(' )
									parentheses++;
								else if( firstChar == ')' )
									parentheses--;
								else if( firstChar == '[' )
									squareBrackets++;
								else if( firstChar == ']' )
									squareBrackets--;
								else if( firstChar == '{' )
									brackets++;
								else if( firstChar == '}' )
									brackets--;
								
								type = word + type;
								
								if( brackets != 0 )
									continue;
								if( squareBrackets != 0 )
									continue;
								if( parentheses != 0 )
									continue;
								if( chevrons != 0 )
									continue;
								
								break;
							}
							
							if( type.length() == 0 )
								type = "void";
						}
					// parse return type <<
					
					// parse variable modifiers >>
						{
							int brackets 		= 0;
							int squareBrackets 	= 0;
							int parentheses 	= 0;
							int chevrons 		= 0;
							String modifier = "";
							for( int j=0; j<i; j++ )
							{
								String word = line.get(j).getWord();
								char firstChar = word.charAt( 0 );
								
								if( word.toLowerCase().equals("function") )
									continue;
								
								modifier += word;
								
								if( firstChar == '<' )
									chevrons++;
								else if( firstChar == '>' )
									chevrons--;
								else if( firstChar == '(' )
									parentheses++;
								else if( firstChar == ')' )
									parentheses--;
								else if( firstChar == '[' )
									squareBrackets++;
								else if( firstChar == ']' )
									squareBrackets--;
								else if( firstChar == '{' )
									brackets++;
								else if( firstChar == '}' )
									brackets--;
								
								if( brackets != 0 )
									continue;
								if( squareBrackets != 0 )
									continue;
								if( parentheses != 0 )
									continue;
								if( chevrons != 0 )
									continue;
								
								modifiers.add( modifier );
								modifier = "";
							}
						}
					// parse variable modifiers <<
					
					if( name.length() > 0 )
						attributes.add( new CodeAttributeFunction(modifiers, type, name, parameters) );
				}
			}
		}
		
		return attributes;
	}
	
	
	
	public static CodeBlock parse( File file ) throws CodeException, IOException
	{
		if( file == null )
			return parse( "" );
		List<String> lines = Files.readAllLines( file.toPath(), Charset.defaultCharset() );
		StringBuilder builder = new StringBuilder();
		boolean first = true;
		for( String line : lines )
		{
			if( !first )
				builder.append( "\n" );
			else
				first = false;
			builder.append( line );
		}
		return parse( builder.toString() );
	}
	
	public static CodeBlock parse( String data ) throws CodeException
	{
		CodeBlock root = new CodeBlock( null );
		CodeBlock block = root;
		
		int characterPosition = -1;
		
		boolean inString = false;
		boolean inChar = false;
		boolean inCommentLine = false;
		int commentBlocksOpen = 0;
		int stringStartCharacterPosition = 0;
		UnrealScriptParserBracketBlock bracketBlock = new UnrealScriptParserBracketBlock();
		char previousChar = ' ';
		char character = ' ';
		char nextChar = ' ';
		int skip = 0;
		for( int i=0; i<data.length(); i++ )
		{
			characterPosition++;
			if( skip > 0 )
			{
				skip--;
				continue;
			}
			
			previousChar = character;
			character = data.charAt( i );
			if( i+1 < data.length() )
				nextChar = data.charAt( i+1 );
			else
				nextChar = '\0';
			
			if( commentBlocksOpen == 0 )
			{
				if( (character == '\n') || (character == '\r') )
				{
					if( !inString && !inChar )
					{
						boolean isInDefaultProperties = false;
						UnrealScriptParserBracketBlock bracketBlockLoop = bracketBlock;
						while( bracketBlockLoop != null )
						{
							if( (bracketBlockLoop.getKeywordWord() != null) && bracketBlockLoop.getKeywordWord().endsWith("defaultproperties") )
							{
								isInDefaultProperties = true;
								break;
							}
							bracketBlockLoop = bracketBlockLoop.getParent();
						}
						
						if( isInDefaultProperties )
						{
							block.closeWord( characterPosition );
							block.newLine();
							bracketBlock.newLine( characterPosition );
						}
						if( (character == '\n') && (nextChar == '\r') )
							skip = 1;
						else if( (character == '\r') && (nextChar == '\n') )
							skip = 1;
						inCommentLine = false;
					}
					else
					{
						throw new CodeException( stringStartCharacterPosition, characterPosition, true, "String not closed" );
					}
					continue;
				}
			}
			if( !inString && !inChar )
			{
				if( !inCommentLine )
				{
					if( commentBlocksOpen == 0 )
					{
						if( WhitespaceDetector.getSharedInstance().isWhitespace(character) )
						{
							block.closeWord( characterPosition );
							continue;
						}
						
						if( character == ';' )
						{
							block.closeWord( characterPosition );
							block.newLine();
							
							bracketBlock.newLine( characterPosition );
							continue;
						}
						
						if( character == '{' )
						{
							bracketBlock = new UnrealScriptParserBracketBlock( bracketBlock, block.getLastCompletedWord(), '{', '}' );
							
							block.closeWord( characterPosition );
							block = new CodeBlock( block );
							continue;
						}
						if( character == '}' )
						{
							bracketBlock.close( characterPosition, '{', '}' );
							bracketBlock = bracketBlock.getParent();
							
							block.closeWord( characterPosition );
							block.close();
							block = block.getParent();
							continue;
						}
						
						if( character == '(' )
						{
							bracketBlock = new UnrealScriptParserBracketBlock( bracketBlock, block.getLastCompletedWord(), '(', ')' );
							
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
							continue;
						}
						if( character == ')' )
						{
							bracketBlock.close( characterPosition, '(', ')' );
							bracketBlock = bracketBlock.getParent();
							
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
							continue;
						}
						
						if( character == '[' )
						{
							bracketBlock = new UnrealScriptParserBracketBlock( bracketBlock, block.getLastCompletedWord(), '[', ']' );
							
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
							continue;
						}
						if( character == ']' )
						{
							bracketBlock.close( characterPosition, '[', ']' );
							bracketBlock = bracketBlock.getParent();
							
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
							continue;
						}
						
						if( (character == '/') && (nextChar == '/') )
						{
							inCommentLine = true;
							continue;
						}
					}
					if( (character == '/') && (nextChar == '*') )
					{
						commentBlocksOpen++;
						continue;
					}
				}
				if( (character == '*') && (nextChar == '/') )
				{
					if( commentBlocksOpen <= 0 )
						throw new CodeException( characterPosition, characterPosition+2, true, "Unexpected: */" );
					commentBlocksOpen--;
					skip = 1;
					continue;
				}
			}
			if( !inCommentLine && (commentBlocksOpen == 0) )
			{
				if( previousChar != '\\' )
				{
					if( character == '"' )
					{
						if( inString )
						{
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
						}
						else
						{
							stringStartCharacterPosition = characterPosition;
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
						}
						inString = !inString;
						continue;
					}
					if( character == '\'' )
					{
						if( inChar )
						{
							block.addCharacter( characterPosition, character );
							block.closeWord( characterPosition+1 );
						}
						else
						{
							stringStartCharacterPosition = characterPosition;
							block.closeWord( characterPosition );
							block.addCharacter( characterPosition, character );
						}
						inChar = !inChar;
						continue;
					}
				}
				
				if( (!block.isNewWordOpen() && KeywordDetector.getSharedInstance().isWordStart(character)) || (block.isNewWordOpen() && KeywordDetector.getSharedInstance().isWordPart(character)) )
				{
					block.addCharacter( characterPosition, character );
					continue;
				}
				else
				{
					block.closeWord( characterPosition );
					block.addCharacter( characterPosition, character );
					block.closeWord( characterPosition+1 );
					continue;
				}
			}
		}
		
		bracketBlock.close( characterPosition );
		block.closeWord( characterPosition );
		block.close();
		
		return root;
	}
}
