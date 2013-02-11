package patrick_vane_unrealscript_editor.editors;

import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import patrick_vane_unrealscript_editor.editors.constants.TagConstant;
import patrick_vane_unrealscript_editor.editors.default_classes.DoubleClickStrategy;
import patrick_vane_unrealscript_editor.editors.syntaxcolor.UnrealScriptSyntaxColor;


public class Configuration extends SourceViewerConfiguration
{
	private DoubleClickStrategy	doubleClickStrategy;
	
	
	public Configuration()
	{
		doubleClickStrategy = new DoubleClickStrategy();
	}
	
	
	@Override
	public IPresentationReconciler getPresentationReconciler( ISourceViewer sourceViewer )
	{
		return UnrealScriptSyntaxColor.createPresentationReconciler( sourceViewer );
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
	
	@Override
	public IAnnotationHover getAnnotationHover( ISourceViewer sourceViewer )
	{
		return new DefaultAnnotationHover();
	}
	@Override
	public ITextHover getTextHover( ISourceViewer sourceViewer, String contentType )
	{
		return new DefaultTextHover( sourceViewer );
	}
	@Override
	public ITextHover getTextHover( ISourceViewer sourceViewer, String contentType, int stateMask )
	{
		return new DefaultTextHover( sourceViewer );
	}
}