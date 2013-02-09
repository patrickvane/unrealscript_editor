package patrick_vanes_unrealscript_editor.editors;

import org.eclipse.ui.editors.text.TextEditor;
import patrick_vanes_unrealscript_editor.editors.default_classes.ColorManager;
import patrick_vanes_unrealscript_editor.editors.default_classes.DocumentProvider;


public class UnrealScriptEditor extends TextEditor
{
	public UnrealScriptEditor()
	{
		super();
		setSourceViewerConfiguration( new Configuration() );
		setDocumentProvider( new DocumentProvider() );
	}
	
	@Override
	public void dispose()
	{
		ColorManager.dispose();
		super.dispose();
	}
}
