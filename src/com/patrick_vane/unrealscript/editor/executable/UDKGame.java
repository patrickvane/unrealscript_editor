package com.patrick_vane.unrealscript.editor.executable;

import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.console.UDKLaunchLogConsole;
import com.patrick_vane.unrealscript.editor.default_classes.StringSplitter;


public class UDKGame
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( "-useunpublished" );
		params.add( "-windowed -resx=1024 resy=768" );
		params.add( "-log" );
		params.add( "-forcelogflush" );
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
	
	public static void run( final IProject project, String map, String mode, String extraArgs, boolean disableSound, boolean disableStartupVideos )
	{
		run( project, map, mode, extraArgs, disableSound, disableStartupVideos, (ArrayList<String>) params.clone() );
	}
	public static void run( final IProject project, String map, String mode, String extraArgs, boolean disableSound, boolean disableStartupVideos, final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		run( project, map, mode, extraArgs, disableSound, disableStartupVideos, newParams );
	}
	
	
	private static void run( final IProject project, final ArrayList<String> params )
	{
		String map;
		String mode;
		String extraArgs;
		boolean disableSound;
		boolean disableStartupVideos;
		try
		{
			map = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP );
			if( (map != null) && map.contains(".") )
				map = map.substring( map.indexOf(".")+1 );
			mode = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MODE );
			extraArgs = project.getPersistentProperty( UnrealScriptID.PROPERTY_EXTRA_EXECUTE_ARGUMENTS );
			disableSound = Boolean.parseBoolean( project.getPersistentProperty(UnrealScriptID.PROPERTY_DISABLE_SOUND) );
			disableStartupVideos = Boolean.parseBoolean( project.getPersistentProperty(UnrealScriptID.PROPERTY_DISABLE_STARTUP_VIDEOS) );
		}
		catch( Exception e )
		{
			map = null;
			mode = null;
			extraArgs = null;
			disableSound = Profile.DEFAULT_DISABLE_SOUND;
			disableStartupVideos = Profile.DEFAULT_DISABLE_STARTUP_VIDEOS;
			e.printStackTrace();
		}
		run( project, map, mode, extraArgs, disableSound, disableStartupVideos, params );
	}
	
	private static void run( final IProject project, final Profile profile, final ArrayList<String> params )
	{
		if( profile != null )
			run( project, profile.map, profile.mode, profile.extraArgs, profile.disableSound, profile.disableStartupVideos, params );
		else
			run( project, params );
	}
	
	private static void run( final IProject project, String map, String mode, String extraArgs, boolean disableSound, boolean disableStartupVideos, final ArrayList<String> params )
	{
		if( project == null )
			return;
		
		// add params >>
			if( map == null )
				map = Profile.DEFAULT_MAP;
			if( !map.endsWith(".udk") )
				map = map+".udk";
			if( mode == null )
				mode = Profile.DEFAULT_MODE;
			if( extraArgs == null )
				extraArgs = Profile.DEFAULT_EXTRA_ARGS;
			
			params.add( 0, map+"?game="+mode );
			if( disableSound )
				params.add( "-nosound" );
			if( disableStartupVideos )
				params.add( "-nomoviestartup" );
			
			boolean serverTmp = false;
			if( extraArgs.length() > 0 )
			{
				String[] extraArgsArray = StringSplitter.splitCommandlineLike( extraArgs );
				for( String extraArg : extraArgsArray )
				{
					if( !serverTmp && "server".equalsIgnoreCase(extraArg) )
					{
						params.add( 0, extraArg );
						serverTmp = true;
						
						ArrayList<String> removeParams = new ArrayList<String>();
						for( String param : params )
						{
							if( param.toLowerCase().startsWith("-windowed") )
							{
								removeParams.add( param );
							}
						}
						for( String param : removeParams )
						{
							params.remove( param );
						}
					}
					else
					{
						params.add( extraArg );
					}
				}
			}
			final boolean server = serverTmp;
		// add params <<
		
		new Thread()
		{
			@Override
			public void run()
			{
				UDKCompiler.saveAndWaitForCompiles( project );
				UDKLaunchLogConsole.clear();
				int response = UnrealScriptEditor.runUDK( project, server, UDKLaunchLogConsole.getFilteringOutputStream(), UDKLaunchLogConsole.getFilteringOutputStream(), params );
				UDKLaunchLogConsole.getPrintStream().println( "Exit Value: "+response );
			}
		}.start();
	}
}
