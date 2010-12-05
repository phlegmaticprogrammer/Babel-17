/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.babel17.netbeans;

// org.openide.loaders.DataObject

import org.openide.loaders.DataObject;

import com.babel17.naive.Interpreter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.openide.LifecycleManager;
import org.openide.filesystems.FileObject;

import org.openide.filesystems.FileUtil;

public final class Run91Babel17 implements ActionListener {

  private final Babel17DataObject context;

  public Run91Babel17(Babel17DataObject context) {
    this.context = context;
  }

  public void actionPerformed(ActionEvent ev) {
    LifecycleManager.getDefault().saveAll();
   FileObject f = context.getPrimaryFile();
   WriteNetbeansOutput o = new WriteNetbeansOutput("Babel-17", context);
   try {
    Interpreter.run(FileUtil.getFileDisplayName(f), o);
   } finally {
     o.done();
   }
  }
}
