package com.patrick_vane.unrealscript.editor.constants;

import java.util.HashSet;


public class WordConstant
{
	public static final String[] KEYWORDS = new String[]
	{
		"abstract", "always", "array", "arraycount", "assert", "auto", 
		"automated", "bool", "break", "button", "byte", "case", "class", 
		"coerce", "collapsecategories", "config", "const", "continue", 
		"default", "defaultproperties", "delegate", "dependson", 
		"deprecated", "do", "dontcollapsecategories", "edfindable", 
		"editconst", "editconstarray", "editinline", "editinlinenew", 
		"editinlinenotify", "editinlineuse", "else", "enum", "enumcount", 
		"event", "exec", "expands", "export", "exportstructs", "extends", 
		"false", "final", "float", "for", "foreach", "function", "global", 
		"globalconfig", "goto", "guid", "hidecategories", "if", "ignores", 
		"implements", "import", "init", "input", "insert", "instanced", "int", 
		"intrinsic", "invariant", "iterator", "latent", "length", "local", 
		"localized", "name", "native", "nativereplication", "new", "noexport", 
		"none", "noteditinlinenew", "notplaceable", "nousercreate", "operator", 
		"optional", "out", "perobjectconfig", "placeable", "pointer", 
		"postoperator", "preoperator", "private", "protected", "reliable", 
		"remove", "replication", "return", "rng", "rot", "safereplace", 
		"self", "showcategories", "simulated", "singular", "skip", "state", 
		"static", "stop", "string", "struct", "super", "switch", "transient", 
		"travel", "true", "unreliable", "until", "var", "vect", "while", 
		"within" 
	};
	
	public static final HashSet<String> KEYWORDS_HASHSET = new HashSet<String>();
	static
	{
		for( String keyword : KEYWORDS )
		{
			KEYWORDS_HASHSET.add( keyword );
		}
	}
}
