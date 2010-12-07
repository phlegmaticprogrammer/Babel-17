package com.babel17.netbeans;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.util.ContextAwareAction;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.actions.Presenter;

public abstract class ContextAction<T> extends AbstractAction
        implements LookupListener, ContextAwareAction {

  private Lookup context = null;
  private Lookup.Result<T> result = null;

  public ContextAction(Lookup context) {
    init(context);

  }

  private void init(Lookup context) {
    this.context = context;
    result = context.lookupResult(contextClass());
    result.addLookupListener(this);
    resultChanged(
            null);


  }

  public void resultChanged(LookupEvent ev) {
    setEnabled(result.allItems().size() != 0);



  }

  public void actionPerformed(ActionEvent e) {
    performAction(result.allInstances().iterator().next());


  }

  public abstract Class<T> contextClass();

  public abstract void performAction(T context);

}
