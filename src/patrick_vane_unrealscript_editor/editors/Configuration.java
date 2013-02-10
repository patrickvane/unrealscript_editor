package patrick_vane_unrealscript_editor.editors;

import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import patrick_vane_unrealscript_editor.editors.default_classes.DoubleClickStrategy;
import patrick_vane_unrealscript_editor.editors.default_classes.NonRuleBasedDamagerRepairer;
import patrick_vane_unrealscript_editor.editors.default_classes.TagAndTextAttribute;
import patrick_vane_unrealscript_editor.editors.scanners.LineScanner;
import patrick_vane_unrealscript_editor.editors.settings.TagConstant;


public class Configuration extends SourceViewerConfiguration
{
	private DoubleClickStrategy	doubleClickStrategy;
	private LineScanner			lineScanner;
	
	
	public Configuration()
	{
		doubleClickStrategy = new DoubleClickStrategy();
		lineScanner 		= new LineScanner();
	}
	
	
	@Override
	public IPresentationReconciler getPresentationReconciler( ISourceViewer sourceViewer )
	{
		PresentationReconciler reconciler = new PresentationReconciler();
		DefaultDamagerRepairer dr;
		NonRuleBasedDamagerRepairer ndr;
		
		for( String tag : TagConstant.TAGS )
		{
			dr = new DefaultDamagerRepairer( lineScanner );
			reconciler.setDamager( dr, tag );
			reconciler.setRepairer( dr, tag );
		}
		
		for( TagAndTextAttribute tag : TagConstant.MULTILINE_TAGS )
		{
			ndr = new NonRuleBasedDamagerRepairer( tag.getTextAttribute() );
			reconciler.setDamager( ndr, tag.getTag() );
			reconciler.setRepairer( ndr, tag.getTag() );
		}
		
		return reconciler;
	}
	
	
	@Override
	public String[] getConfiguredContentTypes( ISourceViewer sourceViewer )
	{
		return TagConstant.TAGS;
	}
	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy( ISourceViewer sourceViewer, String contentType )
	{
		return doubleClickStrategy;
	}
}