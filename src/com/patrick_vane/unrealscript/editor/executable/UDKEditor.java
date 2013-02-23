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
	
	
	public static void run( final IProject project )
	{
		run( project, (ArrayList<String>) params.clone() );
	}
	public static void run( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		run( project, newParams );
	}
	
	
	private static void run( final IProject project, final ArrayList<String> params )
	{
		if( project == null )
			return;
		new Thread()
		{
			@Override
			public void run()
			{
				UDKCompiler.saveAndWaitForCompiles( project );
				
				String map;
				try
				{
					map = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP );
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
				UnrealScriptEditor.runUDK( project, null, null, params );
			}
		}.start();
	}
}
