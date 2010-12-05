package com.babel17.netbeans;

import org.netbeans.modules.parsing.spi.*;
import org.netbeans.modules.parsing.api.*;
import com.babel17.interpreter.parser.ErrorMessage;
import com.babel17.naive.Interpreter;
import java.util.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.event.ChangeListener;

//import org.netbeans.modules.csl.spi.ParserResult;
//import org.netbeans.modules.csl.spi.DefaultError;


import com.babel17.interpreter.parser.ErrorMessage;
import com.babel17.syntaxtree.Location;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
//import org.netbeans.spi.editor.hints.*;
import org.netbeans.spi.editor.errorstripe.UpToDateStatus;
import org.openide.text.NbDocument;

public class Babel17Parser extends Parser {

  private Snapshot snapshot;
  private Collection<ErrorMessage> errors;

  @Override
  public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) {
    Document document = snapshot.getSource().getDocument(false);
    Babel17EditorStatusProvider p = (Babel17EditorStatusProvider)
            document.getProperty(Babel17EditorStatusProviderFactory.PROP);
    if (p != null)
      p.setStatus(UpToDateStatus.UP_TO_DATE_PROCESSING);
    this.snapshot = snapshot;
    Reader reader = new StringReader(snapshot.getText().toString());
    try {
      errors = Interpreter.parseAndAnalyze(reader);
    } catch (IOException ex) {
      Logger.getLogger(Babel17Parser.class.getName()).log(Level.WARNING, null, ex);
    }
  }

  @Override
  public Result getResult(Task task) {
    return new Babel17ParserResult(snapshot, errors);
  }

  @Override
  public void cancel() {
  }

  @Override
  public void addChangeListener(ChangeListener changeListener) {
  }

  @Override
  public void removeChangeListener(ChangeListener changeListener) {
  }

  public static class Babel17ParserResult extends Result {

    private Collection<ErrorMessage> errors;
    private boolean valid = true;

    Babel17ParserResult(Snapshot snapshot, Collection<ErrorMessage> errors) {
      super(snapshot);
      this.errors = errors;
    }

   /* @Override
    public List<org.netbeans.modules.csl.api.Error> getDiagnostics() {
      return generateDefaultErrors();
    }*/

    
    public Collection<ErrorMessage> getErrors() {
      if (!valid) {
        return java.util.Collections.emptyList();
      } else {
        return errors;
      }
    }

   /* public List<org.netbeans.modules.csl.api.Error> generateDefaultErrors() {
       

        Collection<ErrorMessage> syntaxErrors = getErrors();
        Document document = getSnapshot().getSource().getDocument(false);
        List<org.netbeans.modules.csl.api.Error> errors = new ArrayList<org.netbeans.modules.csl.api.Error>();
        org.openide.filesystems.FileObject fo = getSnapshot().getSource().getFileObject();
        for (ErrorMessage error : syntaxErrors) {
          Location loc = error.location().normalize();
          int start = NbDocument.findLineOffset((StyledDocument) document,
                  loc.startLine() - 1) + loc.startColumn() - 1;
          int end = NbDocument.findLineOffset((StyledDocument) document,
                  loc.endLine() - 1) + loc.endColumn();
          String msg = error.message();
          org.netbeans.modules.csl.api.Error e = DefaultError.createDefaultError("SYNTAX_ERROR", 
                  msg, 
                  msg, 
                  fo, 
                  start,
                  end,
                  false, 
                  org.netbeans.modules.csl.api.Severity.ERROR);


          errors.add(e);
        }
        return errors;
    }*/

    @Override
    protected void invalidate() {
      valid = false;
    }
  }
}
