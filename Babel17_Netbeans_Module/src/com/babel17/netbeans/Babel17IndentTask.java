package com.babel17.netbeans;

import org.netbeans.modules.editor.indent.spi.*;
import javax.swing.text.*;

public class Babel17IndentTask implements IndentTask, IndentTask.Factory {

    private Context context;

    Babel17IndentTask(Context context) {
        this.context = context;
    }

    public Babel17IndentTask() {
      context = null;
    }

    public void reindent() throws BadLocationException {
        int offset = context.lineStartOffset(context.caretOffset());
        int prioroffset = context.lineStartOffset(offset-1);
        int indent = context.lineIndent(prioroffset);
        context.modifyIndent(offset, indent);
    }

    public ExtraLock indentLock() {
        return null;
    }

    public Babel17IndentTask createTask(Context c) {
      return new Babel17IndentTask(c);
    }
}