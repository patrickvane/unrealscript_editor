package patrick_vane_unrealscript_editor.editors.default_classes;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import patrick_vane_unrealscript_editor.editors.constants.TagConstant;
import patrick_vane_unrealscript_editor.editors.syntaxcolor.PartitionScanner;


public class DocumentProvider extends FileDocumentProvider
{
	@Override
	protected IDocument createDocument( Object element ) throws CoreException
	{
		IDocument document = super.createDocument( element );
		if( document != null )
		{
			IDocumentPartitioner partitioner = new FastPartitioner( new PartitionScanner(), TagConstant.TAGS );
			partitioner.connect( document );
			document.setDocumentPartitioner( partitioner );
		}
		return document;
	}
}