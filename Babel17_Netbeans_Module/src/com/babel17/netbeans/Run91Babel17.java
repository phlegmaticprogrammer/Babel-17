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

public final class Run91Babel17 extends AbstractAction
        implements ContextAwareAction, LookupListener, Presenter.Menu, Presenter.Toolbar
{

/* public @Override Action createContextAwareInstance(Lookup context) {
        return this;
 }*/

  //private final Babel17DataObject context;

  JButton button = null;
  JMenuItem menuitem = null, popupitem = null;
  private Lookup.Result<Babel17DataObject> result;  

  public Run91Babel17() {
    this(Utilities.actionsGlobalContext());
  }


  public Run91Babel17(Lookup context) {
    super("Run Babel-17 script");
    //putValue(NAME, "Run Babel-17 script");
    String iconfile = "com/babel17/netbeans/Babel17RunIcon.png";
    putValue(SMALL_ICON, new ImageIcon(ImageUtilities.loadImage(iconfile, true)));
    //this.context = context;
    //putValue(DynamicMenuContent.HIDE_WHEN_DISABLED, true);
    result = context.lookupResult(Babel17DataObject.class);
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
    if (popupitem != null) {
      popupitem.setEnabled(enabled);
      popupitem.setVisible(enabled);
    }
    /*if (!enabled) {
      for (JComponent c : components) {
        c.getParent().remove(c);

      }
      components.clear();
    }*/
  }



  public void actionPerformed(ActionEvent ev) {
    LifecycleManager.getDefault().saveAll();
    Babel17DataObject context = getSelectedObject();
    if (context == null) return;
    final FileObject f = context.getPrimaryFile();
    final WriteNetbeansOutput o = WriteNetbeansOutput.get();
    final Runnable runnable = new Runnable() {
      public void run() {
        try {
          Project project = FileOwnerQuery.getOwner(f);
          if (project instanceof Babel17Project) {
            Babel17Project p = (Babel17Project) project;
            EvaluationOptions options = new EvaluationOptions(true, p.getPreferences().get("JAVALIBS", ""));
            String[] sources = p.getSourceFiles();
            String[] args = new String[sources.length+1];
            args[0] = f.getPath().toString();
            for (int i=0; i<sources.length; i++)
                args[i+1] = sources[i];
            Interpreter.run(options, 0, args, o);
          } else {
            EvaluationOptions options = new EvaluationOptions(true, "");
            Interpreter.run(options, 0, new String[]{f.getPath().toString()}, o);
          }
        } finally {
          o.done();
        }        
      }
    };
    RequestProcessor.getDefault().post(runnable);
  }
  
  public Babel17DataObject getSelectedObject() {
      java.util.Collection<? extends Babel17DataObject> coll = result.allInstances();
      if (coll.size() != 1)
          return null;
      else {
          Babel17DataObject dobj = null;
          for (Babel17DataObject f : coll) {              
              dobj = f;
          }
          return dobj;
      }
  }
  
  public void resultChanged(LookupEvent e) {
      this.setEnabled(getSelectedObject() != null);
  }  

  public JMenuItem getMenuPresenter() {
    menuitem = new JMenuItem(this);
    menuitem.setEnabled(false);
    menuitem.setVisible(false);
    //components.add(item);
    return menuitem;
  }

  /*public JMenuItem getPopupPresenter() {
    popupitem = new JMenuItem(this);
    popupitem.setEnabled(false);
    popupitem.setVisible(false);
    //components.add(item);
    return popupitem;
  }*/


  public JButton getToolbarPresenter() {
    button = new JButton(this);
    button.setText("");
    button.setEnabled(false);
    button.setVisible(false);
    //components.add(button);
    return button;
  }

  public Action createContextAwareInstance(Lookup context) {
    return new Run91Babel17(context);
  }
}
