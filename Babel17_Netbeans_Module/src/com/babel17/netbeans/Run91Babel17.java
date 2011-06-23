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

import com.babel17.naive.Interpreter;
import javax.swing.ImageIcon;
import org.openide.LifecycleManager;
import org.openide.filesystems.FileObject;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import org.openide.filesystems.FileUtil;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;
import org.openide.util.Utilities;
import org.openide.util.actions.Presenter;

public final class Run91Babel17 extends ContextAction<Babel17DataObject> 
        implements Presenter.Menu, Presenter.Toolbar
{

/* public @Override Action createContextAwareInstance(Lookup context) {
        return this;
 }*/

  //private final Babel17DataObject context;

  JButton button = null;
  JMenuItem menuitem = null, popupitem = null;

  public Run91Babel17() {
    this(Utilities.actionsGlobalContext());
  }


  public Run91Babel17(Lookup context) {
    super(context);
    putValue(NAME, "Run Babel-17 program");
    String iconfile = "com/babel17/netbeans/Babel17RunIcon.png";
    putValue(SMALL_ICON, new ImageIcon(ImageUtilities.loadImage(iconfile, true)));
    //this.context = context;
    //putValue(DynamicMenuContent.HIDE_WHEN_DISABLED, true);
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



  public void performAction(Babel17DataObject context) {
    LifecycleManager.getDefault().saveAll();
    final FileObject f = context.getPrimaryFile();
    final String filename = FileUtil.getFileDisplayName(f);
    final WriteNetbeansOutput o = new WriteNetbeansOutput("Babel-17", context, filename);
    final Runnable runnable = new Runnable() {
      public void run() {
        try {
          Interpreter.run(0, new String[]{filename}, o);
        } finally {
          o.done();
        }        
      }
    };
    RequestProcessor.getDefault().post(runnable);
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

  public Class<Babel17DataObject> contextClass() {
    return Babel17DataObject.class;
  }

  public Action createContextAwareInstance(Lookup context) {
    return new Run91Babel17(context);
  }
}
