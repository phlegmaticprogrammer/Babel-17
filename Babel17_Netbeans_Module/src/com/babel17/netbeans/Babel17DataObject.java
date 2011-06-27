package com.babel17.netbeans;


import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;
import org.openide.util.lookup.*;

public class Babel17DataObject extends MultiDataObject {

  public Babel17DataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
    super(pf, loader);
    CookieSet cookies = getCookieSet();
    cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
  }

  @Override
  protected Node createNodeDelegate() {
    return new DataNode(this, Children.LEAF,getLookup());
  }

  @Override
  public Lookup getLookup() {
      Lookup cookies = getCookieSet().getLookup();
      Lookup feq = Lookups.singleton(new UTF8FEQImpl());
      return new ProxyLookup(new Lookup[]{cookies,feq});
  }
}
