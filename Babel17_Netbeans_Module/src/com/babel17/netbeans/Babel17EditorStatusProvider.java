package com.babel17.netbeans;

import org.netbeans.spi.editor.errorstripe.*;

public class Babel17EditorStatusProvider extends UpToDateStatusProvider
{

  private UpToDateStatus status;
  
  public Babel17EditorStatusProvider() {
    status = UpToDateStatus.UP_TO_DATE_PROCESSING;
  }

  public void setStatus(UpToDateStatus s) {
    if (s == status) return;
    UpToDateStatus old = status;
    status = s;
    firePropertyChange(PROP_UP_TO_DATE, old, status);
  }


  public UpToDateStatus getUpToDate() {
    return status;
  }

}
