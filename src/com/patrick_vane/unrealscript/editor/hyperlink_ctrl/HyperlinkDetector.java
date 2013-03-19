package com.patrick_vane.unrealscript.editor.hyperlink_ctrl;

import org.eclipse.jface.text.hyperlink.IHyperlink;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.constants.WordConstant;
import com.patrick_vane.unrealscript.editor.default_classes.MyAbstractHyperlink;
import com.patrick_vane.unrealscript.editor.default_classes.MyAbstractHyperlinkDetector;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeFunction;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeWord;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class HyperlinkDetector extends MyAbstractHyperlinkDetector
{
	private UnrealScriptAttributes lastAttributes;
	private long lastTime;
	
	
	@Override
	protected IHyperlink getHyperlink( final CodeWord word, final String before, final String after ) throws Exception
	{
		if( ".".equals(before) )
		{
			return null;
		}
		
		// class >>
		{
			final UnrealScriptClass unrealscriptClass = UnrealScriptEditor.getUnrealScriptClass( word.getWord() );
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
		}
		// class <<
		
		// functions and variables >>
		{
			if( System.currentTimeMillis()-lastTime >= 1000 )
			{
				lastAttributes = UnrealScriptEditor.getActiveUnrealScriptAttributes();
				lastTime = System.currentTimeMillis();
			}
			
			if( "(".equals(after) )
			{
				final CodeAttributeFunction function = lastAttributes.getAttributeFunction( word.getWord(), (WordConstant.FUNCTION_KEYWORDS_HASHSET.contains(before) ? 1 : 0) );
				
				if( function != null )
				{
					final UnrealScriptClass unrealscriptClass = UnrealScriptEditor.getUnrealScriptClass( function.getClassName() );
					if( unrealscriptClass != null )
					{
						return new MyAbstractHyperlink( word )
						{
							@Override
							public void open()
							{
								UnrealScriptEditor.openFile( unrealscriptClass.getFile(), function.getFirstCharacterPosition(), function.getLastCharacterPosition() );
							}
						};
					}
				}
			}
			else
			{
				final CodeAttributeVariable variable = lastAttributes.getAttributeVariable( word.getWord() );
				if( variable != null )
				{
					final UnrealScriptClass unrealscriptClass = UnrealScriptEditor.getUnrealScriptClass( variable.getClassName() );
					if( unrealscriptClass != null )
					{
						return new MyAbstractHyperlink( word )
						{
							@Override
							public void open()
							{
								UnrealScriptEditor.openFile( unrealscriptClass.getFile(), variable.getFirstCharacterPosition(), variable.getLastCharacterPosition() );
							}
						};
					}
				}
			}
		}
		// functions and variables <<
		
		return null;
	}
}
