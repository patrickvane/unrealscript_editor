package patrick_vane_unrealscript_editor.editors.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;
import patrick_vane_unrealscript_editor.editors.UnrealScriptID;


public class UDKPerspective implements IPerspectiveFactory
{
	@Override
	public void createInitialLayout( IPageLayout layout )
	{
		layout.addView( UnrealScriptID.VIEW_NAVIGATOR, IPageLayout.LEFT, 0.20f, layout.getEditorArea() );
		
		IFolderLayout bottom = layout.createFolder( "bottom", IPageLayout.BOTTOM, 0.70f, layout.getEditorArea() );
		bottom.addView( IPageLayout.ID_PROBLEM_VIEW );
		bottom.addView( IConsoleConstants.ID_CONSOLE_VIEW );
		bottom.addView( IPageLayout.ID_PROGRESS_VIEW );
	}
	
	
	public static boolean isActive()
	{
		try
		{
			IPerspectiveDescriptor perspective = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective();
			String perspectiveId = perspective.getId();
			return perspectiveId.equalsIgnoreCase( UnrealScriptID.PERSPECTIVE );
		}
		catch( Exception e ) // NullPointers, RuntimeExceptions
		{
			return false;
		}
	}
}