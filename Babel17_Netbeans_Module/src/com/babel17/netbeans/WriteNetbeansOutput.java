package com.babel17.netbeans;

import com.babel17.naive.WriteOutput;
import com.babel17.syntaxtree.Location;
import java.awt.Color;
import java.io.IOException;
import org.openide.windows.IOColors;
import org.openide.windows.IOColors.OutputType;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputEvent;
import org.openide.windows.OutputListener;
import org.openide.windows.OutputWriter;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import org.netbeans.modules.editor.NbEditorUtilities;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.URLMapper;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;

public class WriteNetbeansOutput extends WriteOutput {

  InputOutput io;
  OutputWriter writer;
  Babel17DataObject dobj;

  void setColor(Color color) {
    IOColors.setColor(io, OutputType.OUTPUT, color);
  }

  void print(String s) {
    //try {
    writer.print(s);
    /*} catch (IOException e) {

    }*/
  }

  void println(String s, boolean important) {
    try {
      writer.println(s, null, important);
    } catch (IOException e) {
    }
  }

  WriteNetbeansOutput(String title, Babel17DataObject dobj) {
    this.dobj = dobj;
    InputOutput io = IOProvider.getDefault().getIO(title, false);
    writer = io.getOut();
    //IOColors.setColor(io, OutputType.OUTPUT, Color.blue);
    io.select();
    /*writer.println("IOColorPrint supported: "+IOColorPrint.isSupported(io));
    writer.println("IOColorLines supported: "+IOColorLines.isSupported(io));*/
    writer.println("----------------------------------------------------------");
  }

  public void writeLineCommentary(String s) {
    setColor(Color.GRAY);
    println(s, false);
  }

  public void writeLineSuccess(String s) {
    setColor(Color.green);
    println(s, true);
  }

  public void writeLineError(String s) {
    setColor(Color.red);
    println(s, true);
  }

  public class L implements OutputListener {

    Location loc;

    public L(Location loc) {
      this.loc = loc;
    }

    public void outputLineCleared(OutputEvent ev) {
    }

    public void outputLineAction(OutputEvent ev) {
      openAt(loc);

    }

    public void outputLineSelected(OutputEvent ev) {
    }
  }

  public void writeLocMsg(String prefix, Location loc, String message) {
    try {
      setColor(Color.gray);
      String tab = "    ";

      if (prefix != null) {
        print(prefix + " ");
        tab = "";
        while (tab.length() <= prefix.length()) tab = tab+" ";
      }
      writer.println("at "+loc, new L(loc), false);
      setColor(Color.black);
      writer.println(tab+message, null, false);
    } catch (IOException e) {
    }

  }

  public void writeLine(String s) {
    setColor(Color.black);
    println(s, false);
  }

  public void done() {
    writer.close();
    io.closeInputOutput();
  }

  public void openAt(final Location loc) {
    final EditorCookie.Observable ec = (EditorCookie.Observable) dobj.getCookie(EditorCookie.Observable.class);
    if (ec != null) {

      org.netbeans.editor.Utilities.runInEventDispatchThread(new Runnable() {

        public void run() {
          final JEditorPane[] panes = ec.getOpenedPanes();

          //Here we're positioning the cursor,
          //if the document isn't open, we need to open it first:

          if ((panes != null) && (panes.length > 0)) {
            setPosition(panes[0], loc);
          } else {
            ec.addPropertyChangeListener(new PropertyChangeListener() {

              public void propertyChange(PropertyChangeEvent evt) {
                  final JEditorPane[] panes = ec.getOpenedPanes();
                  if ((panes != null) && (panes.length > 0)) {
                    setPosition(panes[0], loc);
                    ec.removePropertyChangeListener(this);
                  }
              }
            });
            ec.open();
          }
        }

        //Here we specify where the cursor will land:
        private void setPosition(JEditorPane pane, Location loc) {
          try {
            int col = loc.startColumn();
            int line = loc.startLine();
            //The whole text:
            String text = pane.getDocument().getText(0, pane.getDocument().getLength() - 1);
            //The place where we want the cursor to be:
            int index = 0;
            int c = 1;
            int l = 1;
            int len = text.length();
            while (index < len) {
              if (l > line || l == line && c >= col) {
                pane.setCaretPosition(index);
                pane.requestFocus();
                return;
              }
              char ch = text.charAt(index);
              if (ch == '\n') {
                c = 1;
                l++;
                index++;
              } else {
                c++;
                index++;
              }
            }
            pane.setCaretPosition(len-1);
            pane.requestFocus();
          } catch (BadLocationException ex) {
          }
        }
      });
    } else {
    }
  }
}
