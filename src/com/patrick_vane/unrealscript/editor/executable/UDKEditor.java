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
	
	public static void run( final IProject project, final Profile profile )
	{
		run( project, profile, (ArrayList<String>) params.clone() );
	}
	public static void run( final IProject project, final Profile profile, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		run( project, profile, newParams );
	}
	
	public static void run( final IProject project, String map )
	{
		run( project, map, (ArrayList<String>) params.clone() );
	}
	public static void run( final IProject project, String map, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		run( project, map, newParams );
	}
	
	
	private static void run( final IProject project, final ArrayList<String> params )
	{
		String map;
		try
		{
			map = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP );
			if( (map != null) && map.contains(".") )
				map = map.substring( map.indexOf(".")+1 );
		}
		catch( Exception e )
		{
			map = null;
			e.printStackTrace();
		}
		run( project, map, params );
	}
	
	private static void run( final IProject project, final Profile profile, final ArrayList<String> params )
	{
		if( profile != null )
			run( project, profile.map, params );
		else
			run( project, params );
	}
	
	
	private static void run( final IProject project, String map, final ArrayList<String> params )
	{
		if( project == null )
			return;
		
		// add params >>
			if( map == null )
				map = Profile.DEFAULT_MAP;
			if( !map.endsWith(".udk") )
				map = map+".udk";
			params.add( 1, map );
		// add params <<
		
		new Thread()
		{
			@Override
			public void run()
			{
				UDKCompiler.saveAndWaitForCompiles( project );
				UnrealScriptEditor.runUDK( project, null, null, params );
			}
		}.start();
	}
}
