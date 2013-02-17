package com.patrick_vane.unrealscript.editor.default_classes;

import java.lang.reflect.Field;
import java.util.ArrayList;


public class StaticClassFieldsReader
{
	public static String[] get( Class<?> constantsClass, String... add )
	{
		ArrayList<String> strings = new ArrayList<String>();
		
		for( String part : add )
		{
			strings.add( part );
		}
		
		Field[] fields = constantsClass.getFields();
		for( Field field : fields )
		{
			if( field.getType() == String.class )
			{
				try
				{
					String value = (String) field.get(constantsClass);
					if( value != null )
					{
						strings.add( value );
					}
				}
				catch( Exception e )
				{
				}
			}
		}
		
		return strings.toArray( new String[0] );
	}
}
