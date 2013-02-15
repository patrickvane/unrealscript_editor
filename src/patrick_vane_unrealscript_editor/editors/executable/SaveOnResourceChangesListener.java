package patrick_vane_unrealscript_editor.editors.executable;

import java.io.File;
import patrick_vane_unrealscript_editor.editors.default_classes.AbstractResourcesChangedListener;


public class SaveOnResourceChangesListener extends AbstractResourcesChangedListener
{
	public SaveOnResourceChangesListener( File root )
	{
		super( root );
	}
	
	@Override
	public void fileChanged( String name )
	{
		System.out.println( getRoot().toURI().getPath()+name+" changed" );
		if( name.endsWith(".uc") )
			System.out.println( "recompile!" );
	}
}
