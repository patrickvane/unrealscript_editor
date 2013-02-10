package patrick_vane_unrealscript_editor.editors.settings;

import org.eclipse.jface.text.IDocument;
import patrick_vane_unrealscript_editor.editors.default_classes.Constants;
import patrick_vane_unrealscript_editor.editors.default_classes.TagAndTextAttribute;


public interface TagConstant
{
	String DEFAULT			= IDocument.DEFAULT_CONTENT_TYPE;
	String STRING			= "__string";
	String DOCS				= "__docs";
	String COMMENT_LINE		= "__comment_line";
	String COMMENT_BLOCK	= "__comment_block";
	
	String[] TAGS = Constants.get( TagConstant.class );
	
	TagAndTextAttribute[] MULTILINE_TAGS = new TagAndTextAttribute[]
	{ 
		new TagAndTextAttribute( DOCS, TextAttributeConstant.DOCS ), 
		new TagAndTextAttribute( COMMENT_BLOCK, TextAttributeConstant.COMMENT ) 
	};
}
