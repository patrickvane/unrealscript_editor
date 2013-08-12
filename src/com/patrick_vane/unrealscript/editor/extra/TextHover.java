package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.constants.KeywordInfoConstants;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
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
		
		return getTextOfAttribute( classOrAttribute );
    }
    
    
    // static functions >>
		private static String toText( String documentation, String text )
		{
			if( text != null )
			{
				if( documentation != null )
				{
					return documentation + "\n\n" + text + "\n";
				}
				return "\n" + text + "\n";
			}
			return null;
		}
    	
    	
	    public static String getTextOfAttribute( ClassOrAttribute attribute )
		{
			if( attribute.isClass() )
				return getTextOfAttribute( attribute.unrealscriptClass );
			else if( attribute.isAttribute() )
				return getTextOfAttribute( attribute.attribute );
			else
				return null;
		}
		public static String getTextOfAttribute( CodeAttribute attribute )
		{
			if( attribute instanceof CodeAttributeFunction )
				return getTextOfAttribute( (CodeAttributeFunction) attribute );
			else if( attribute instanceof CodeAttributeVariable )
				return getTextOfAttribute( (CodeAttributeVariable) attribute );
			return null;
		}
		
		public static String getTextOfAttribute( UnrealScriptClass attribute )
		{
			String documentation = UnrealScriptAdvancedParser.getDocumentation( attribute );
    		String text = "class "+attribute.getName();
    		
    		UnrealScriptClass parent = attribute.getParent();
    		if( parent != null )
    			text += " extends "+parent.getName();
    		
    		return toText( documentation, text );
		}
		
		public static String getTextOfAttribute( CodeAttributeFunction attribute )
		{
			String documentation = UnrealScriptAdvancedParser.getDocumentation( attribute );
    		String text = attribute.getModifiersAsString( true ) + "function " + attribute.getType() + " " + attribute.getName() + attribute.getParametersAsString( true );
    		return toText( documentation, text );
		}
		
		public static String getTextOfAttribute( CodeAttributeVariable attribute )
		{
			if( attribute instanceof CodeAttributeLocalVariable )
				return getTextOfAttribute( (CodeAttributeLocalVariable) attribute );
			
			String documentation = UnrealScriptAdvancedParser.getDocumentation( attribute );
			
			String modifiers = attribute.getModifiersAsString( true );
			if( !modifiers.startsWith("(") )
				modifiers = " " + modifiers;
			
			String text = "var" + modifiers + attribute.getType() + " " + attribute.getName();
			return toText( documentation, text );
		}
		
		public static String getTextOfAttribute( CodeAttributeLocalVariable attribute )
		{
			if( attribute instanceof CodeAttributeParameterLocalVariable )
				return getTextOfAttribute( (CodeAttributeParameterLocalVariable) attribute );
			
			String documentation = UnrealScriptAdvancedParser.getDocumentation( attribute );
			
			String modifiers = attribute.getModifiersAsString( true );
			if( !modifiers.startsWith("(") )
				modifiers = " " + modifiers;
			
			String text = "local" + modifiers + attribute.getType() + " " + attribute.getName();
			return toText( documentation, text );
		}
		
		public static String getTextOfAttribute( CodeAttributeParameterLocalVariable attribute )
		{
			String documentation = UnrealScriptAdvancedParser.getDocumentation( attribute );
			String text = attribute.getModifiersAsString( true ) + attribute.getType() + " " + attribute.getName();
			return toText( documentation, text );
		}
    // static functions <<
}