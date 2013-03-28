package com.patrick_vane.unrealscript.editor.parser;

import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class UnrealScriptAttributeParser
{
	public static UnrealScriptAttributes parseAttributesOfClass( String className )
	{
		UnrealScriptAttributes attributes = new UnrealScriptAttributes();
		try
		{
			UnrealScriptClass thisClass = UnrealScriptEditor.getUnrealScriptClass( className );
			if( thisClass != null )
			{
				attributes.addAttributes( UnrealScriptParser.getAttributesOfClass(thisClass) );
			}
		}
		catch( Exception e )
		{
		}
		return attributes;
	}
	
	public static UnrealScriptAttributes parseAttributesOfClassAndParents( String className )
	{
		UnrealScriptAttributes attributes = new UnrealScriptAttributes();
		try
		{
			UnrealScriptClass thisClass = UnrealScriptEditor.getUnrealScriptClass( className );
			if( thisClass != null )
			{
				attributes.addAttributes( UnrealScriptParser.getAttributesOfClass(thisClass) );
				
				UnrealScriptClass parentClass = thisClass.getParent();
				if( parentClass != null )
				{
					while( parentClass.getParent() != null )
					{
						attributes.addAttributes( UnrealScriptParser.getAttributesOfClass(parentClass) );
						parentClass = parentClass.getParent();
					}
				}
			}
		}
		catch( Exception e )
		{
		}
		return attributes;
	}
}
