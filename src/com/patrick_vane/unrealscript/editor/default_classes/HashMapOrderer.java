package com.patrick_vane.unrealscript.editor.default_classes;

import java.util.Arrays;
import java.util.HashMap;
import com.patrick_vane.unrealscript.editor.executable.Profile;


public class HashMapOrderer
{
	public static HashMap<String,Profile> orderHashMap( HashMap<String,Profile> map )
	{
		HashMap<String,Profile> newMap = new HashMap<String,Profile>();
		String[] keys = map.keySet().toArray( new String[0] );
		Arrays.sort( keys );
		for( String key : keys )
		{
			newMap.put( key, map.get(key) );
		}
		return newMap;
	}
}
