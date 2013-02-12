package patrick_vane_unrealscript_editor.editors.perspective;

import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;
import patrick_vane_unrealscript_editor.editors.UnrealScriptID;


public class UnrealScriptPerspective implements IPerspectiveFactory
{
	@Override
	public void createInitialLayout( IPageLayout layout )
	{
		layout.addView( JavaUI.ID_PACKAGES, IPageLayout.LEFT, 0.20f, layout.getEditorArea() );
		
		IFolderLayout bottom = layout.createFolder( "bottom", IPageLayout.BOTTOM, 0.70f, layout.getEditorArea() );
		bottom.addView( IPageLayout.ID_PROBLEM_VIEW );
		bottom.addView( IConsoleConstants.ID_CONSOLE_VIEW );
		bottom.addView( IPageLayout.ID_PROGRESS_VIEW );
		
		layout.addActionSet( UnrealScriptID.BUTTON_IMPORT_PROJECT );
		layout.addActionSet( UnrealScriptID.BUTTON_COMPILER_SETTINGS );
		layout.addActionSet( UnrealScriptID.BUTTON_RUN_EDITOR );
		layout.addActionSet( UnrealScriptID.BUTTON_RUN_GAME );
	}
}