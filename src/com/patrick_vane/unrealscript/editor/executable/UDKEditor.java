package com.patrick_vane.unrealscript.editor.executable;

import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;


public class UDKEditor
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( 0, "editor" );
	}
	
	
	public static void run()
	{
		run( (ArrayList<String>) params.clone() );
	}
	public static void run( final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		run( newParams );
	}
	
	
	private static void run( final ArrayList<String> params )
	{
		new Thread()
		{
			@Override
			public void run()
			{
				IProject activeProject = UnrealScriptEditor.getActiveProject();
				if( activeProject == null )
					return;
				
				String map;
				try
				{
					map = UnrealScriptEditor.getActiveProject().getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP );
				}
				catch( Exception e )
				{
					map = null;
					e.printStackTrace();
				}
				if( map == null )
					map = "ExampleMap";
				if( !map.endsWith(".udk") )
					map = map+".udk";
				
				params.add( 1, map );
				UnrealScriptEditor.runUDK( true, null, null, params );
			}
		}.start();
	}
}
