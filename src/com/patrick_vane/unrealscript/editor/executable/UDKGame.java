package com.patrick_vane.unrealscript.editor.executable;

import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.console.UDKLaunchLogConsole;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.default_classes.MyUrlChecker;
import com.patrick_vane.unrealscript.editor.default_classes.StringSplitter;


public class UDKGame
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( "-useunpublished" );
		params.add( "-log" );
		params.add( "-forcelogflush" );
	}
	
	
	public static void run( final IProject project )
	{
		run( project, new ArrayList<String>(params) );
	}
	public static void run( final IProject project, final String... extraParams )
	{
		ArrayList<String> newParams = new ArrayList<String>(params);
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		run( project, newParams );
	}
	
	public static void run( final IProject project, final Profile profile )
	{
		run( project, profile, new ArrayList<String>(params));
	}
	public static void run( final IProject project, final Profile profile, final String... extraParams )
	{
		ArrayList<String> newParams = new ArrayList<String>(params);
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		run( project, profile, newParams );
	}
	
	public static void run( final IProject project, String map, String mode, String extraArgs, boolean disableSound, boolean disableStartupVideos )
	{
		run( project, map, mode, extraArgs, disableSound, disableStartupVideos, new ArrayList<String>(params));
	}
	public static void run( final IProject project, String map, String mode, String extraArgs, boolean disableSound, boolean disableStartupVideos, final String... extraParams )
	{
		ArrayList<String> newParams = new ArrayList<String>(params);
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
	
	private static void run( final IProject project, String map, String mode, String extraArgs, boolean disableSound, boolean disableStartupVideos, ArrayList<String> parameters )
	{
		if( project == null )
			return;
		
		final ArrayList<String> params = new ArrayList<String>(parameters);
		
		// add params >>
			if( map == null )
				map = Profile.DEFAULT_MAP;
			while( (map != null) && map.endsWith(".udk") )
				map = map.substring( 0, map.length()-4 );
			if( (map != null) && map.contains(".") )
				map = map.substring( map.lastIndexOf(".")+1 );
			if( map == null )
				map = Profile.DEFAULT_MAP;
			map += ".udk";
			
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
			boolean ip = false;
			if( extraArgs.length() > 0 )
			{
				String[] extraArgsArray = StringSplitter.splitCommandlineLike( extraArgs );
				for( String extraArg : extraArgsArray )
				{
					if( !serverTmp && !ip )
					{
						if( extraArg.equalsIgnoreCase("server") )
						{
							params.add( 0, extraArg );
							serverTmp = true;
							continue;
						}
						
						if( MyUrlChecker.isURL(extraArg) )
						{
							params.add( 0, extraArg );
							ip = true;
							continue;
						}
					}
					params.add( extraArg );
				}
			}
			final boolean server = serverTmp;
			
			if( !server )
			{
				params.add( "-windowed" );
				params.add( "-resx=1024 resy=768" );
			}
		// add params <<
		
		new Thread()
		{
			@Override
			public void run()
			{
				UDKCompiler.saveAndWaitForCompiles( project );
				UDKLaunchLogConsole.clear();
				UnrealScriptEditor.runUDK( project, server, UDKLaunchLogConsole.getFilteringOutputStream(), UDKLaunchLogConsole.getFilteringOutputStream(), params );
			}
		}.start();
	}
}
