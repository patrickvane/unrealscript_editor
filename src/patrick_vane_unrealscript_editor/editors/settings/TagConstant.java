package patrick_vane_unrealscript_editor.editors.settings;

import org.eclipse.jface.text.IDocument;
import patrick_vane_unrealscript_editor.editors.default_classes.Constants;
import patrick_vane_unrealscript_editor.editors.default_classes.TagAndTextAttribute;


public class TagConstant
{
	public static final String DEFAULT			= IDocument.DEFAULT_CONTENT_TYPE;
	public static final String STRING			= "__string";
	public static final String DOCS				= "__docs";
	public static final String COMMENT_LINE		= "__comment_line";
	public static final String COMMENT_BLOCK	= "__comment_block";
	
	public static final String[] TAGS = Constants.get( TagConstant.class );
	
	public static final TagAndTextAttribute[] createMultilineTags()
	{
		return new TagAndTextAttribute[]
		{ 
			new TagAndTextAttribute( DOCS, TextAttributeConstant.createDocs() ), 
			new TagAndTextAttribute( COMMENT_BLOCK, TextAttributeConstant.createComment() ) 
		};
	}
}
