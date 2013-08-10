package com.patrick_vane.unrealscript.editor.syntaxcolor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.source.ISourceViewer;
import com.patrick_vane.unrealscript.editor.constants.TagConstant;
import com.patrick_vane.unrealscript.editor.default_classes.NonRuleBasedDamagerRepairer;
import com.patrick_vane.unrealscript.editor.default_classes.TagAndTextAttribute;


public class UnrealScriptSyntaxColor
{
	public static void setupDocumentPartitioner( IDocument document )
	{
		IDocumentPartitioner partitioner = new FastPartitioner( new PartitionScanner(), TagConstant.TAGS );
		document.setDocumentPartitioner( partitioner );
		partitioner.connect( document );
	}
	
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
