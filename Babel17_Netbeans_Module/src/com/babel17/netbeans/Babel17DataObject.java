/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.babel17.netbeans;

/*
 *       <class-path-extension>
        <runtime-relative-path>ext/babel17-antlr-parser-0.2.jar</runtime-relative-path>
        <binary-origin>/Users/stevenobua/NetBeansProjects/Babel17 Antlr Parser/Babel17_Antlr_Parser.jar</binary-origin>
      </class-path-extension>
      <class-path-extension>
        <runtime-relative-path>ext/functionaljava.jar</runtime-relative-path>
        <binary-origin>/Users/stevenobua/NetBeansProjects/functionaljava/functionaljava.jar</binary-origin>
      </class-path-extension>
*/

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

public class Babel17DataObject extends MultiDataObject {

  public Babel17DataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
    super(pf, loader);
    CookieSet cookies = getCookieSet();
    cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
  }

  @Override
  protected Node createNodeDelegate() {
    return new DataNode(this, Children.LEAF, getLookup());
  }

  @Override
  public Lookup getLookup() {
    return getCookieSet().getLookup();
  }
}
