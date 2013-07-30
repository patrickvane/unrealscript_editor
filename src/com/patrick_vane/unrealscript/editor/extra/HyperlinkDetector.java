package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.AbstractHyperlinkDetector;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.default_classes.MyAbstractHyperlink;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.CodeWord;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser.ClassOrAttribute;


public class HyperlinkDetector extends AbstractHyperlinkDetector
{
	@Override
	public IHyperlink[] detectHyperlinks( ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks )
	{
		ClassOrAttribute classOrAttribute = UnrealScriptAdvancedParser.getClassOrAttributeAt( textViewer.getDocument(), region.getOffset() );
		if( classOrAttribute == null )
			return null;
		
		IHyperlink link = null;
		
		if( classOrAttribute.isClass() )
			link = getHyperlinkOfClass( classOrAttribute.unrealscriptClass, classOrAttribute.word );
		if( classOrAttribute.isAttribute() )
			link = getHyperlinkOfAttribute( classOrAttribute.attribute, classOrAttribute.word );
		
		if( link != null )
			return new IHyperlink[]{ link };
		return null;
	}
	
	protected IHyperlink getHyperlinkOfClass( final UnrealScriptClass unrealscriptClass, final CodeWord word )
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
	
	protected IHyperlink getHyperlinkOfAttribute( final CodeAttribute attribute, final CodeWord word )
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
