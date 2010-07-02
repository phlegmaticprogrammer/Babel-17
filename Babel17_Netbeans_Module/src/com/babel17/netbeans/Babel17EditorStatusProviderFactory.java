package com.babel17.netbeans;

import org.netbeans.spi.editor.errorstripe.*;
import javax.swing.text.Document;
import java.util.*;
import java.lang.ref.*;

public class Babel17EditorStatusProviderFactory implements
        UpToDateStatusProviderFactory
{
  public final static String PROP = "Babel17EditorStatusProvider";


  public Babel17EditorStatusProviderFactory() {
  }

  public UpToDateStatusProvider createUpToDateStatusProvider(Document document)
  {
    Babel17EditorStatusProvider p = new Babel17EditorStatusProvider();
    document.putProperty(PROP, p);
    return p;
  }
}
