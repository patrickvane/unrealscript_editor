package com.patrick_vane.unrealscript.editor.outline;

import java.util.HashMap;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.CodeAttributeFunction;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAdvancedParser;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class OutlineLabelProvider extends LabelProvider
{
	//private static final Image	STRUCT				= UnrealScriptEditor.getImage( "icons/outline/struct.gif" );
	private static final Image		FUNCTION			= UnrealScriptEditor.getImage( "icons/outline/function.gif" );
	private static final Image		FUNCTION_OVERRIDDEN	= UnrealScriptEditor.getImage( "icons/outline/function_overridden.gif" );
	//private static final Image	VARIABLE_PUBLIC		= UnrealScriptEditor.getImage( "icons/outline/var_public.gif" );
	private static final Image		VARIABLE_PRIVATE	= UnrealScriptEditor.getImage( "icons/outline/var_private.gif" );
	
	
	private static final HashMap<String,HashMap<String,Boolean>> overriddenFunctions = new HashMap<String,HashMap<String,Boolean>>();
	
	
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
					try
					{
						synchronized( overriddenFunctions )
						{
							String className = attribute.getClassName().toLowerCase();
							String functionName = attribute.getName().toLowerCase();
							if( overriddenFunctions.get(className).get(functionName) == true )
							{
								return FUNCTION_OVERRIDDEN;
							}
						}
					}
					catch( Exception e )
					{
					}
					return FUNCTION;
				}
			}
		}
		return null;
	}
	
	
	public static void parseOverriddenFunctions( UnrealScriptAttributes attributes )
	{
		for( CodeAttributeFunction function : attributes.getAttributeFunctions() )
		{
			String className = function.getClassName().toLowerCase();
			String functionName = function.getName().toLowerCase();
			boolean overridden = false;
			
			UnrealScriptAttributes functionClassAttributes = UnrealScriptAdvancedParser.getAttributes( className );
			if( functionClassAttributes.getAttributeFunction(functionName, 1) != null )
			{
				overridden = true;
			}
			
			synchronized( overriddenFunctions )
			{
				HashMap<String,Boolean> overriddenFunctionsClass = overriddenFunctions.get( className );
				if( overriddenFunctionsClass == null )
				{
					overriddenFunctionsClass = new HashMap<String,Boolean>();
					overriddenFunctions.put( className, overriddenFunctionsClass );
				}
				overriddenFunctionsClass.put( functionName, overridden );
			}
		}
	}
}