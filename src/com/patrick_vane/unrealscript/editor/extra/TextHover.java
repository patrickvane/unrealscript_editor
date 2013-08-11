package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.constants.KeywordInfoConstants;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeFunction;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeLocalVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeParameterLocalVariable;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeVariable;
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
    		String text = "class "+classOrAttribute.unrealscriptClass.getName();
    		UnrealScriptClass parent = classOrAttribute.unrealscriptClass.getParent();
    		if( parent != null )
    			text += " extends "+parent.getName();
			return text;
    	}
    	
    	if( classOrAttribute.isAttribute() )
    	{
    		if( classOrAttribute.attribute instanceof CodeAttributeFunction )
    		{
    			CodeAttributeFunction function = (CodeAttributeFunction) classOrAttribute.attribute;
				return function.getModifiersAsString( true ) + "function " + function.getType() + " " + function.getName() + function.getParametersAsString( true );
			}
    		else if( classOrAttribute.attribute instanceof CodeAttributeParameterLocalVariable )
    		{
    			CodeAttributeParameterLocalVariable parameter = (CodeAttributeParameterLocalVariable) classOrAttribute.attribute;
				return parameter.getModifiersAsString( true ) + parameter.getType() + " " + parameter.getName();
			}
    		else if( classOrAttribute.attribute instanceof CodeAttributeLocalVariable )
    		{
    			CodeAttributeLocalVariable local = (CodeAttributeLocalVariable) classOrAttribute.attribute;
				return "local " + local.getModifiersAsString( true ) + local.getType() + " " + local.getName();
			}
    		else if( classOrAttribute.attribute instanceof CodeAttributeVariable )
    		{
    			CodeAttributeVariable var = (CodeAttributeVariable) classOrAttribute.attribute;
				return "var " + var.getModifiersAsString( true ) + var.getType() + " " + var.getName();
			}
    	}
    	
    	return null;
    }
}