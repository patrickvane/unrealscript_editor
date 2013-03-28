package com.patrick_vane.unrealscript.editor.outline;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class OutlineLabelProvider extends LabelProvider
{
	//private static final Image	STRUCT				= getImage( "outline/struct.gif" );
	private static final Image	FUNCTION			= getImage( "outline/function.gif" );
	private static final Image	FUNCTION_OVERRIDDEN	= getImage( "outline/function_overridden.gif" );
	//private static final Image	VARIABLE_PUBLIC		= getImage( "outline/var_public.gif" );
	private static final Image	VARIABLE_PRIVATE	= getImage( "outline/var_private.gif" );
	
	
	@Override
	public String getText( Object element )
	{
		if( element != null )
		{
			if( element instanceof CodeAttribute )
			{
				CodeAttribute attribute = (CodeAttribute) element;
				return attribute.getName()+" : "+attribute.getType();
			}
		}
		return null;
	}
	
	@Override
	public Image getImage( Object element )
	{
		if( element != null )
		{
			if( element instanceof CodeAttribute )
			{
				CodeAttribute attribute = (CodeAttribute) element;
				if( !attribute.isFunction() )
				{
					// - No public variable image, because it looks like crap -
					//if( attribute.getModifiers().contains("private") )
						return VARIABLE_PRIVATE;
					//else
					//	return VARIABLE_PUBLIC;
				}
				else
				{
					UnrealScriptClass attributeClass = UnrealScriptEditor.getUnrealScriptClass( attribute.getClassName() );
					if( attributeClass != null )
					{
						UnrealScriptClass parentClass = attributeClass.getParent();
						if( parentClass != null )
						{
							UnrealScriptAttributes parentAttributes = UnrealScriptEditor.getUnrealScriptAttributesWithParents( parentClass.getName() );
							if( parentAttributes.getAttributeFunction(attribute.getName()) != null )
							{
								return FUNCTION_OVERRIDDEN;
							}
						}
					}
					return FUNCTION;
				}
			}
		}
		return null;
	}
	
	
	private static Image getImage( String file )
	{
		return UnrealScriptEditor.getImageDescriptor( file ).createImage();
	}
}