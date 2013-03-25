package com.patrick_vane.unrealscript.editor.default_classes;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import com.patrick_vane.unrealscript.editor.executable.Profile;


public class MyArraySorter
{
	public static String[] sort( String[] array )
	{
		Arrays.sort( array );
		return array;
	}
	
	public static TreeMap<String,Profile> sort( Map<String,Profile> array )
	{
		return new TreeMap<String,Profile>( array );
	}
}
