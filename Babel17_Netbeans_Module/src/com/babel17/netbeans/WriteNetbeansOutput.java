package com.babel17.netbeans;

import com.babel17.naive.WriteOutput;
import com.babel17.syntaxtree.Location;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputEvent;
import org.openide.windows.OutputListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import org.openide.cookies.EditorCookie;
import org.openide.util.ImageUtilities;
import org.openide.windows.IOColorLines;
import org.openide.windows.IOColorPrint;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.filesystems.FileUtil;
//import org.netbeans.swing.tabcontrol.TabbedContainer;

public class WriteNetbeansOutput extends WriteOutput {

  InputOutput io;
  volatile boolean pleaseCancel = false;
  AbstractAction cancelAction = null;
  String filename;

  public boolean pleaseCancel() {
    return pleaseCancel;
  }

  class CancelAction extends AbstractAction {

    JButton button = null;

    public CancelAction() {
      super();
      putValue(NAME, "Run Babel-17 program");
      String iconfile = "com/babel17/netbeans/stop.png";
      putValue(SMALL_ICON, new ImageIcon(ImageUtilities.loadImage(iconfile, true)));
    }

    public void actionPerformed(ActionEvent ev) {
      pleaseCancel = true;
    }

  }

  void println(String s, Color c) {
    println(s, c, null, false);
  }

  void println(String s, OutputListener l) {
    println(s, Color.BLUE, l, false);
  }

  void println(final String s, final Color c, final OutputListener l, final boolean important) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          IOColorLines.println(io, s, l, important, c);
        } catch (IOException e) {}
      }
    });
  }

  void print(final String s, final Color c, final OutputListener l, final boolean important) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          IOColorPrint.print(io, s, l, important, c);
        } catch (IOException e) {}
      }
    });
  }


  WriteNetbeansOutput(final String title, String filename) {
    this.filename = filename;
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        cancelAction = new CancelAction();
        AbstractAction[] actions = new AbstractAction[]{cancelAction};  
        io = IOProvider.getDefault().getIO(title, actions);
        io.select();
      }
    });

    //OutputWriter writer = io.getOut();
    //IOColors.setColor(io, OutputType.OUTPUT, Color.blue);
    //io.select();
    /*writer.println("IOColorPrint supported: "+IOColorPrint.isSupported(io));
    writer.println("IOColorLines supported: "+IOColorLines.isSupported(io));*/
    //writer.println("----------------------------------------------------------");
    //io.setOutputVisible(true);
  }

  public void writeLineCommentary(String s) {
    println(s, Color.GRAY);
  }

  Color color(int red, int green, int blue) {
    return new Color(red / 255.0f, green / 255.0f, blue / 255.0f);
  }

  public void writeLineSuccess(String s) {
    println(s, color(0x2e, 0xab, 0x37), null, true);
  }

  public void writeLineError(String s) {
    //setColor(Color.red);
    println(s, color(0xb6, 0x0a, 0x0a), null, true);
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
    //try {
      String tab = "    ";

      if (prefix != null) {
        prefix = prefix + " ";
        while (tab.length() < prefix.length()) {
          tab = tab + " ";
        }
      } else prefix = "";
      //IOColorPrint.print(io, "at "+loc, new L(loc), false, Color.black);
      print(prefix, Color.black, null, false);
      //if (loc.getSource().getFilename().equals(filename))
        print("at "+loc, Color.blue, new L(loc), false);
      //else
        //print("at "+loc, Color.black, null, false);

      println(": "+message, Color.black);
      //writer.println("at " + loc, new L(loc), false);
      //setColor(Color.black);
      //IOColorPrint.print(io, tab+message, Color.black);
      //writer.println(tab + message, null, false);
      //println(tab+message, Color.BLACK);
      //NBOut.output("Babel-17", tab + message, Color.black);
    /*} catch (IOException e) {
      display(e.toString());
      e.printStackTrace();
    }*/

  }

  public void writeLine(String s) {
    //setColor(Color.black);
    println(s, Color.black);
  }

  public void done() {
    //writer.close();
    EventQueue.invokeLater(new Runnable() {

      public void run() {
        cancelAction.setEnabled(false);
      }
    });
  }

  public void openAt(final Location loc) {
    Babel17DataObject dobj = null;
    try {
        String filename = loc.getSource().getFilename();
        FileObject fo = FileUtil.createData(new java.io.File(filename));
        dobj = (Babel17DataObject) DataObject.find(fo);      
    } catch (Exception e) {        
    }
    if (dobj == null) return;
    final EditorCookie.Observable ec = dobj.getCookie(EditorCookie.Observable.class);
    
    if (ec != null) {

      org.netbeans.editor.Utilities.runInEventDispatchThread(new Runnable() {

        public void run() {
          final JEditorPane[] panes = ec.getOpenedPanes();

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
                pane.requestFocusInWindow();
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
            pane.setCaretPosition(len - 1);
            pane.requestFocusInWindow();
          } catch (BadLocationException ex) {
          }
        }
      });
    }
  }
}
