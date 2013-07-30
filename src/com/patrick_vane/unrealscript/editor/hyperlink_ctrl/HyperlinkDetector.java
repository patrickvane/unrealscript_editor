package com.patrick_vane.unrealscript.editor.hyperlink_ctrl;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.constants.WordConstant;
import com.patrick_vane.unrealscript.editor.default_classes.MyAbstractHyperlink;
import com.patrick_vane.unrealscript.editor.default_classes.MyAbstractHyperlinkDetector;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.CodeWord;
import com.patrick_vane.unrealscript.editor.parser.CodeWord.ParentCodeWord;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class HyperlinkDetector extends MyAbstractHyperlinkDetector
{
	private final HashMap<String,UnrealScriptAttributes>	lastAttributes 	= new HashMap<String,UnrealScriptAttributes>();
	private final HashMap<String,Long>						lastTime 		= new HashMap<String,Long>();
	
	
	@Override
	protected IHyperlink getHyperlink( CodeWord word, int inLineArrayPos, CodeWord[] line, String before, String after ) throws Exception
	{
		UnrealScriptClass usingClass = UnrealScriptEditor.getActiveUnrealScriptClass();
		boolean canBeClass = true;
		
		ArrayList<ParentCodeWord> parents = new ArrayList<ParentCodeWord>();
		ParentCodeWord parent = word.getParentWord( line, inLineArrayPos );
		while( parent != null )
		{
			parents.add( parent );
			parent = parent.getParentWord();
		}
		
		for( int i=parents.size()-1; i>=0; i-- )
		{
			parent = parents.get( i );
			
			boolean startWithClass = canBeClass;
			if( canBeClass )
			{
				char firstChar = parent.word.getWord().charAt( 0 );
				if( firstChar == Character.toLowerCase(firstChar) ) // firstChar is lower case
				{
					startWithClass = false;
				}
			}
			
			if( startWithClass )
			{
				UnrealScriptClass newClass = getClass( parent.word.getWord() );
				if( newClass != null )
				{
					usingClass = newClass;
				}
				else
				{
					CodeAttribute newAttribute = getAttribute( usingClass.getName(), parent.word.getWord(), parent.function );
					UnrealScriptClass newAttributeClass = ((newAttribute == null) ? null : getClass(newAttribute.getType()));
					if( newAttributeClass != null )
					{
						usingClass = newAttributeClass;
					}
					else
					{
						break;
					}
				}
			}
			else
			{
				CodeAttribute newAttribute = getAttribute( usingClass.getName(), parent.word.getWord(), parent.function );
				UnrealScriptClass newAttributeClass = ((newAttribute == null) ? null : getClass(newAttribute.getType()));
				if( newAttributeClass != null )
				{
					usingClass = newAttributeClass;
				}
				else if( canBeClass )
				{
					UnrealScriptClass newClass = getClass( parent.word.getWord() );
					if( newClass != null )
					{
						usingClass = newClass;
					}
					else
					{
						break;
					}
				}
				else
				{
					break;
				}
			}
			
			canBeClass = false;
		}
		
		
		boolean startWithClass = canBeClass;
		if( canBeClass )
		{
			char firstChar = word.getWord().charAt( 0 );
			if( firstChar == Character.toLowerCase(firstChar) ) // firstChar is lower case
			{
				startWithClass = false;
			}
		}
		
		IHyperlink hyperlink;
		if( startWithClass )
		{
			hyperlink = getHyperlinkOfClass( getClass(word.getWord()), word, inLineArrayPos, line, before, after );
			if( hyperlink != null )
				return hyperlink;
			
			hyperlink = getHyperlinkOfAttribute( getAttribute(usingClass.getName(), word.getWord(), "(".equals(after)), word, inLineArrayPos, line, before, after );
			if( hyperlink != null )
				return hyperlink;
		}
		else
		{
			hyperlink = getHyperlinkOfAttribute( getAttribute(usingClass.getName(), word.getWord(), "(".equals(after)), word, inLineArrayPos, line, before, after );
			if( hyperlink != null )
				return hyperlink;
			
			if( canBeClass )
			{
				hyperlink = getHyperlinkOfClass( getClass(word.getWord()), word, inLineArrayPos, line, before, after );
				if( hyperlink != null )
					return hyperlink;
			}
		}
		
		return null;
	}
	
	
	protected UnrealScriptAttributes getAttributes( String className )
	{
		if( className == null )
			return new UnrealScriptAttributes();
		className = className.toLowerCase();
		
		Long lastTime = this.lastTime.get( className );
		if( (lastTime == null) || (System.currentTimeMillis()-lastTime >= 3000) )
		{
			this.lastTime.put( className, System.currentTimeMillis() );
			this.lastAttributes.put( className, UnrealScriptEditor.getUnrealScriptAttributesWithParents(className) );
		}
		return this.lastAttributes.get( className );
	}
	
	
	protected UnrealScriptClass getClass( String word )
	{
		return UnrealScriptEditor.getUnrealScriptClass( word );
	}
	
	protected CodeAttribute getAttribute( String className, String word, boolean function )
	{
		UnrealScriptAttributes attributes = getAttributes( className );
		if( function )
			return attributes.getAttributeFunction( word, 0 );
		else
			return attributes.getAttributeVariable( word, 0 );
	}
	
	
	protected IHyperlink getHyperlinkOfClass( final UnrealScriptClass unrealscriptClass, final CodeWord word, final int inLineArrayPos, final CodeWord[] line, final String before, final String after ) throws Exception
	{
		if( unrealscriptClass != null )
		{
			return new MyAbstractHyperlink( word )
			{
				@Override
				public void open()
				{
					UnrealScriptEditor.openFile( unrealscriptClass.getFile() );
				}
			};
		}
		return null;
	}
	
	protected IHyperlink getHyperlinkOfAttribute( CodeAttribute attribute, CodeWord word, int inLineArrayPos, CodeWord[] line, String before, String after ) throws Exception
	{
		if( attribute != null )
		{
			boolean skipOne = false;
			
			if( !skipOne )
			{
				if( inLineArrayPos >= 2 )
				{
					skipOne = ("super".equals(line[inLineArrayPos-2].getWord()) || "super".equals(line[inLineArrayPos-1].getWord()));
				}
			}
			
			if( !skipOne )
			{
				if( attribute.isFunction() )
				{
					for( int i=0; i<inLineArrayPos; i++ )
					{
						if( WordConstant.FUNCTION_KEYWORDS_HASHSET.contains(line[i].getWord()) )
						{
							skipOne = true;
							break;
						}
					}
				}
			}
			
			if( skipOne )
			{
				if( !attribute.isFunction() )
				{
					CodeAttribute newAttribute = getAttributes( attribute.getClassName() ).getAttributeVariable( word.getWord(), 1 );
					if( newAttribute != null )
					{
						return getHyperlinkOfAttribute( newAttribute, word );
					}
				}
				else
				{
					CodeAttribute newAttribute = getAttributes( attribute.getClassName() ).getAttributeFunction( word.getWord(), 1 );
					if( newAttribute != null )
					{
						return getHyperlinkOfAttribute( newAttribute, word );
					}
				}
			}
			
			return getHyperlinkOfAttribute( attribute, word );
		}
		return null;
	}
	protected IHyperlink getHyperlinkOfAttribute( final CodeAttribute attribute, final CodeWord word ) throws Exception
	{
		if( attribute != null )
		{
			final UnrealScriptClass unrealscriptClass = UnrealScriptEditor.getUnrealScriptClass( attribute.getClassName() );
			if( unrealscriptClass != null )
			{
				return new MyAbstractHyperlink( word )
				{
					@Override
					public void open()
					{
						UnrealScriptEditor.openFile( unrealscriptClass.getFile(), attribute.getFirstCharacterPosition(), attribute.getLastCharacterPosition() );
					}
				};
			}
		}
		return null;
	}
}
