package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.constants.KeywordInfoConstants;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeFunction;
import com.patrick_vane.unrealscript.editor.parser.CodeWord.CodeWordData;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser.ClassOrAttribute;


public class TextHover implements ITextHover
{
	@Override
	public IRegion getHoverRegion( ITextViewer textViewer, int offset )
	{
		return new Region( offset, 1 );
	}
	
    @Override
    public String getHoverInfo( ITextViewer textviewer, IRegion region )
    {
    	ClassOrAttribute classOrAttribute = UnrealScriptAdvancedParser.getClassOrAttributeAt( textviewer.getDocument(), region.getOffset() );
		if( classOrAttribute == null )
		{
			CodeWordData word = UnrealScriptAdvancedParser.getWordAt( textviewer.getDocument(), region.getOffset() );
			if( word != null )
			{
				String info = KeywordInfoConstants.getKeywordInfo( word.word.getWord() );
				if( (info != null) && !info.isEmpty() )
					return "/**\n"+info+"\n*/";
			}
			return null;
		}
    	
    	if( classOrAttribute.isClass() )
    	{
    		String text = classOrAttribute.unrealscriptClass.getName();
    		UnrealScriptClass parent = classOrAttribute.unrealscriptClass.getParent();
    		if( parent != null )
    			text += " extends "+parent.getName();
			return text;
    	}
    	
    	if( classOrAttribute.isAttribute() )
    	{
    		String text = classOrAttribute.attribute.getType() + " " + classOrAttribute.attribute.getName();
    		if( classOrAttribute.attribute instanceof CodeAttributeFunction )
    			text += ((CodeAttributeFunction) classOrAttribute.attribute).getParametersAsString( true );
    		return text;
    	}
    	
    	return null;
    }
}