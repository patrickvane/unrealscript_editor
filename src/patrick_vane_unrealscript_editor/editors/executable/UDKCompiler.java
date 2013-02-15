package patrick_vane_unrealscript_editor.editors.executable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.core.resources.IProject;
import patrick_vane_unrealscript_editor.editors.UnrealScriptEditor;
import patrick_vane_unrealscript_editor.editors.UnrealScriptID;
import patrick_vane_unrealscript_editor.editors.console.UnrealScriptCompilerConsole;


public class UDKCompiler
{
	private static final ArrayList<String> params = new ArrayList<String>();
	static
	{
		params.add( "make" );
		params.add( "-unattended" );
		params.add( "-debug" );
	}
	
	public static final HashMap<IProject,Long>	compilingProjects		= new HashMap<IProject,Long>();
	public static final HashSet<IProject>		waitForCompileProjects	= new HashSet<IProject>();
	
	
	public static void compile()
	{
		compile( false, (ArrayList<String>) params.clone() );
	}
	public static void compileForced()
	{
		compile( true, (ArrayList<String>) params.clone() );
	}
	public static void compile( final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		compile( false, newParams );
	}
	public static void compileForced( final String... extraParams )
	{
		ArrayList<String> newParams = (ArrayList<String>) params.clone();
		for( String param : extraParams )
		{
			newParams.add( param );
		}
		compile( true, newParams );
	}
	
	
	public static void waitForCompiles()
	{
		IProject activeProject = UnrealScriptEditor.getActiveProject();
		if( activeProject == null )
			return;
		while( true )
		{
			synchronized( compilingProjects )
			{
				Long time = compilingProjects.get( activeProject );
				if( time == null )
				{
					return;
				}
			}
			try
			{
				Thread.sleep( 100 );
			}
			catch( Exception e )
			{
			}
		}
	}
	
	
	private static void compile( final boolean forced, final ArrayList<String> params )
	{
		new Thread()
		{
			@Override
			public void run()
			{
				IProject activeProject = UnrealScriptEditor.getActiveProject();
				if( activeProject == null )
					return;
				while( true )
				{
					synchronized( compilingProjects )
					{
						Long time = compilingProjects.get( activeProject );
						if( time == null )
						{
							compilingProjects.put( activeProject, System.currentTimeMillis() );
							waitForCompileProjects.remove( activeProject );
							break;
						}
						else if( !forced )
						{
							if( System.currentTimeMillis()-time >= 200 )
							{
								waitForCompileProjects.add( activeProject );
								return;
							}
							else
							{
								return;
							}
						}
						else
						{
							try
							{
								Thread.sleep( 100 );
							}
							catch( Exception e )
							{
							}
						}
					}
				}
				
				synchronized( UnrealScriptCompilerConsole.getSynchronizer() )
				{
					boolean stripSources;
					try
					{
						stripSources = Boolean.parseBoolean( UnrealScriptEditor.getActiveProject().getPersistentProperty(UnrealScriptID.PROPERTY_STRIP_SOUCE) );
					}
					catch( Exception e )
					{
						stripSources = false;
						e.printStackTrace();
					}
					if( stripSources )
					{
						params.add( "-stripsource" );
					}
					
					UnrealScriptCompilerConsole.clear();
					UnrealScriptEditor.runUDK( false, UnrealScriptCompilerConsole.getPrintStream(), UnrealScriptCompilerConsole.getPrintStream(), params );
				}
				
				synchronized( compilingProjects )
				{
					compilingProjects.remove( activeProject );
					if( waitForCompileProjects.contains(activeProject) )
					{
						compile( false, params );
					}
				}
			}
		}.start();
	}
}
