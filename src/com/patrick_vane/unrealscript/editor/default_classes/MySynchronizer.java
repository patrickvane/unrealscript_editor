package com.patrick_vane.unrealscript.editor.default_classes;

import java.util.HashMap;


/**
 *  Used to synchronize blocks of code using the hashcode of a specified class. <br>
 *  <br>
 *  Usage:
 *  <pre>
 *  MySynchronizer<Integer> synchronizer = new MySynchronizer<Integer>();
 *  synchronized( synchronizer.get(5) )
 *  {
 *  	//synchronized code
 *  	//synchronizer.get(5) will always return the same Object
 *  }
 *  </pre>
 */
public class MySynchronizer<T>
{
	private final HashMap<T,Object> synchronizer = new HashMap<T,Object>();
	
	
	public Object get( T key )
	{
		synchronized( synchronizer )
		{
			Object syncObject = synchronizer.get( key );
			if( syncObject == null )
			{
				syncObject = new Object();
				synchronizer.put( key, syncObject );
			}
			return syncObject;
		}
	}
}
