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
				
				if( extraArgs.length() > 0 )
				{
					String[] extraArgsArray = StringSplitter.splitCommandlineLike( extraArgs );
					for( String extraArg : extraArgsArray )
						params.add( extraArg );
				}
				
				UDKLaunchLogConsole.clear();
				UnrealScriptEditor.runUDK( project, UDKLaunchLogConsole.getFilteringOutputStream(), UDKLaunchLogConsole.getFilteringOutputStream(), params );
			}
		}.start();
	}
}
