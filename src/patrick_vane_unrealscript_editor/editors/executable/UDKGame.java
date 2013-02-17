package patrick_vane_unrealscript_editor.editors.executable;

import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import patrick_vane_unrealscript_editor.editors.UnrealScriptEditor;
import patrick_vane_unrealscript_editor.editors.UnrealScriptID;


public class UDKGame
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( "-useunpublished" );
		params.add( "-windowed -resx=1024 resy=768" );
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
				String mode;
				boolean disableSound;
				boolean disableStartupVideos;
				try
				{
					IProject project = UnrealScriptEditor.getActiveProject();
					map  = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP );
					mode = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MODE );
					disableSound = Boolean.parseBoolean( project.getPersistentProperty(UnrealScriptID.PROPERTY_DISABLE_SOUND) );
					disableStartupVideos = Boolean.parseBoolean( project.getPersistentProperty(UnrealScriptID.PROPERTY_DISABLE_STARTUP_VIDEOS) );
				}
				catch( Exception e )
				{
					map = null;
					mode = null;
					disableSound = false;
					disableStartupVideos = false;
					e.printStackTrace();
				}
				if( map == null )
					map = "ExampleMap";
				if( mode == null )
					mode = "UTGame.UTDeathmatch";
				if( !map.endsWith(".udk") )
					map = map+".udk";
				
				params.add( 0, map+"?game="+mode );
				if( disableSound )
				{
					params.add( "-nosound" );
				}
				if( disableStartupVideos )
				{
					params.add( "-nomoviestartup" );
				}
				
				UnrealScriptEditor.runUDK( true, null, null, params );
			}
		}.start();
	}
}
