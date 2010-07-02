package com.babel17.netbeans;

import java.util.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.modules.parsing.spi.Parser.Result;
import com.babel17.interpreter.parser.ErrorMessage;
import com.babel17.syntaxtree.Location;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import org.netbeans.spi.editor.hints.*;
import org.openide.text.NbDocument;
import org.netbeans.spi.editor.errorstripe.*;


class SyntaxErrorsHighlightingTask extends ParserResultTask {

  public SyntaxErrorsHighlightingTask() {
  }

  @Override
  public void run(Result result, SchedulerEvent event) {
    try {
      Babel17Parser.Babel17ParserResult babel17Result =
              (Babel17Parser.Babel17ParserResult) result;
      Collection<ErrorMessage> syntaxErrors = babel17Result.getErrors();
      Document document = result.getSnapshot().getSource().getDocument(false);
      List<ErrorDescription> errors = new ArrayList<ErrorDescription>();
      for (ErrorMessage error : syntaxErrors) {
        Location loc = error.location().normalize();
        int start = NbDocument.findLineOffset((StyledDocument) document,
                loc.startLine() - 1) + loc.startColumn() - 1;
        int end = NbDocument.findLineOffset((StyledDocument) document,
                loc.endLine() - 1) + loc.endColumn();
        ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                Severity.ERROR,
                error.message(),
                document,
                document.createPosition(start),
                document.createPosition(end));
        errors.add(errorDescription);
      }
      HintsController.setErrors(document, "Babel-17", errors);
      Babel17EditorStatusProvider p = (Babel17EditorStatusProvider)
            document.getProperty(Babel17EditorStatusProviderFactory.PROP);
      if (p != null)
        p.setStatus(UpToDateStatus.UP_TO_DATE_OK);

    } catch (BadLocationException ex1) {
      //Exceptions.printStackTrace (ex1);
   // } catch (org.netbeans.modules.parsing.spi.ParseException ex1) {
      //Exceptions.printStackTrace (ex1);
    }
  }

  @Override
  public int getPriority() {
    return 100;
  }

  @Override
  public Class<? extends Scheduler> getSchedulerClass() {
    return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
  }

  @Override
  public void cancel() {
  }
}
