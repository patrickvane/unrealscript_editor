package patrick_vane_unrealscript_editor.editors.settings;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import patrick_vane_unrealscript_editor.editors.default_classes.ColorManager;


public interface TextAttributeConstant
{
	TextAttribute DEFAULT	= new TextAttribute( ColorManager.getColor(0, 0, 0), 		null, SWT.NONE );
	TextAttribute KEYWORD	= new TextAttribute( ColorManager.getColor(128, 0, 84), 	null, SWT.BOLD );
	TextAttribute COMMENT	= new TextAttribute( ColorManager.getColor(64, 128, 96), 	null, SWT.NONE );
	TextAttribute DOCS		= new TextAttribute( ColorManager.getColor(64, 64, 255), 	null, SWT.NONE );
	TextAttribute STRING	= new TextAttribute( ColorManager.getColor(0, 0, 255), 		null, SWT.NONE );
}
