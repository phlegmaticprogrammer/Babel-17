package com.babel17.netbeans;

import org.netbeans.modules.editor.NbEditorKit;

public class Babel17EditorKit extends NbEditorKit {

    public Babel17EditorKit() {
        super();
    }

    @Override
    public String getContentType() {
        return "text/x-babel17";
    }

}