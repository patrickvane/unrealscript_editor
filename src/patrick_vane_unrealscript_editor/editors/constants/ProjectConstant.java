package patrick_vane_unrealscript_editor.editors.constants;

import java.util.HashMap;


public class ProjectConstant
{
	public static final HashMap<String,String>		subfolders			= new HashMap<String,String>();
	public static final HashMap<String,String[]>	hiddensubfolders	= new HashMap<String,String[]>();
	
	static
	{
		addFolder( "UnrealScript", "Development/Src" );
		addFolder( "Logs", "UDKGame/Logs" );
		addFolder( "Config", "UDKGame/Config" );
		addFolder( "Content", "UDKGame/Content", new String[]{"Maps"} );
		addFolder( "Maps", "UDKGame/Content/Maps" );
	}
	
	private static void addFolder( String name, String path )
	{
		subfolders.put( name, path );
	}
	private static void addFolder( String name, String path, String[] hide )
	{
		subfolders.put( name, path );
		hiddensubfolders.put( path, hide );
	}
}
