/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.babel17.netbeans;

// org.openide.loaders.DataObject
//    <attr name="instanceCreate" methodvalue="org.openide.awt.Actions.context"/>

/*
                <attr name="delegate" methodvalue="org.openide.awt.Actions.inject"/>
                <attr name="displayName" bundlevalue="com.babel17.netbeans.Bundle#CTL_Run91Babel17"/>
                <attr name="iconBase" stringvalue="com/babel17/netbeans/Babel17RunIcon.png"/>
                <attr name="injectable" stringvalue="com.babel17.netbeans.Run91Babel17"/>
                <attr name="instanceCreate" methodvalue="org.openide.awt.Actions.context"/>
                <attr name="noIconInMenu" boolvalue="false"/>
                <attr name="selectionType" stringvalue="EXACTLY_ONE"/>
                <attr name="type" stringvalue="com.babel17.netbeans.Babel17DataObject"/>
            </file>
 * 
 */

import com.babel17.naive.*;
import javax.swing.ImageIcon;
import org.openide.LifecycleManager;
import org.openide.filesystems.FileObject;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;


import org.openide.filesystems.FileUtil;
import org.openide.util.*;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;

import org.openide.util.actions.Presenter;

public final class UnittestBabel17 extends AbstractAction 
        implements ContextAwareAction, Presenter.Menu, Presenter.Toolbar, LookupListener
{

/* public @Override Action createContextAwareInstance(Lookup context) {
        return this;
 }*/

  //private final Babel17DataObject context;

 
  JButton button = null;
  JMenuItem menuitem = null;
  private Lookup.Result<FileObject> result;  
  
  public UnittestBabel17() {
    this(Utilities.actionsGlobalContext());
  }


  public UnittestBabel17(Lookup context) {
    super("Run Babel-17 unit test(s)");
    //putValue(NAME, "Run Babel-17 unit test(s)");
    String iconfile = "com/babel17/netbeans/Babel17UnittestIcon.png";
    putValue(SMALL_ICON, new ImageIcon(ImageUtilities.loadImage(iconfile, true)));
    //this.context = context;
    //putValue(DynamicMenuContent.HIDE_WHEN_DISABLED, true);
    result = context.lookupResult(FileObject.class);
    result.addLookupListener(this);
  }

  @Override
  public void setEnabled(boolean enabled) {
    super.setEnabled(enabled);
    if (button != null) {
      button.setEnabled(enabled);
      button.setVisible(enabled);
    }
    if (menuitem != null) {
      menuitem.setEnabled(enabled);
      menuitem.setVisible(enabled);
    }
  }

  public void actionPerformed(ActionEvent e) {
    LifecycleManager.getDefault().saveAll();
    final ArrayList<FileObject> fs = getSelectedFileObjects();
    if (fs.isEmpty()) return;
    final WriteNetbeansOutput o = WriteNetbeansOutput.get();
    final Runnable runnable = new Runnable() {
      public void run() {
        try {
          Project project = FileOwnerQuery.getOwner(fs.get(0));
          if (project instanceof Babel17Project) {
            Babel17Project p = (Babel17Project) project;
            String[] sources = p.getSourceFiles();
            FileCentral fc = new FileCentral();
            for (FileObject fo : fs) {
                Babel17Project.collectFiles(fc, fo);
            }
            EvaluationOptions options = new EvaluationOptions(true, p.getPreferences().get("JAVALIBS", ""));            
            Interpreter.runUnittests(options, fc.getFileNames(), sources, o);
          }
        } finally {
          o.done();
        }        
      }
    };
    RequestProcessor.getDefault().post(runnable);
  }
  
  public ArrayList<FileObject> getSelectedFileObjects() {
      java.util.Collection<? extends FileObject> coll = result.allInstances();
      ArrayList<FileObject> fos = new ArrayList<FileObject>();
      Project P = null;
      boolean P_clash = false;
      for (FileObject f : coll) {
          Project project = FileOwnerQuery.getOwner(f);
          if (project instanceof Babel17Project) {
              if (Babel17Project.isBabel17File(f) || f.isFolder()) {
                  if (P == null || P == project) {
                      P = project;
                  } else {
                      P_clash = true;
                      break;
                  }
                  fos.add(f);
                  break;
              }
          }
      }
      if (P_clash) {
          return new ArrayList<FileObject>();
      }
      return fos;
  }
  
  public void resultChanged(LookupEvent e) {
      this.setEnabled(!getSelectedFileObjects().isEmpty());
  }

  public JMenuItem getMenuPresenter() {
    menuitem = new JMenuItem(this);
    menuitem.setEnabled(false);
    menuitem.setVisible(false);
    return menuitem;
  }

  public JButton getToolbarPresenter() {
    button = new JButton(this);
    button.setText("");
    button.setEnabled(false);
    button.setVisible(false);
    return button;
  }

  public Action createContextAwareInstance(Lookup context) {
    return new UnittestBabel17(context);
  }
}
