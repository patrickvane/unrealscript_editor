package patrick_vane_unrealscript_editor.editors.scanners;

import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import patrick_vane_unrealscript_editor.editors.default_classes.NonRuleBasedDamagerRepairer;
import patrick_vane_unrealscript_editor.editors.default_classes.TagAndTextAttribute;
import patrick_vane_unrealscript_editor.editors.settings.TagConstant;


public class UnrealScriptSyntaxColor
{
	public static IPresentationReconciler createPresentationReconciler( ISourceViewer sourceViewer )
	{
		PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr;
		NonRuleBasedDamagerRepairer ndr;
		
		for( String tag : TagConstant.TAGS )
		{
			dr = new DefaultDamagerRepairer( new LineScanner() );
			reconciler.setDamager( dr, tag );
			reconciler.setRepairer( dr, tag );
		}
		
		for( TagAndTextAttribute tag : TagConstant.createMultilineTags() )
		{
			ndr = new NonRuleBasedDamagerRepairer( tag.getTextAttribute() );
			reconciler.setDamager( ndr, tag.getTag() );
			reconciler.setRepairer( ndr, tag.getTag() );
		}
		
		return reconciler;
	}
}
