package com.babel17.syntaxtree;

import com.babel17.interpreter.parser.ModulePath;

public final class ModuleNode extends Node {

  public static final class Path extends Node {

    public Path(NodeList ids) {
      this.ids = ids;
    }

    public NodeList ids() {
      return ids;
    }

    public NodeList children() {
      return ids;
    }

    private NodeList ids;

    public ModulePath toModulePath() {
        ModulePath p = new ModulePath();
        for (Node n : ids) {
            p = p.add(((IdentifierNode) n).name());
        }
        return p;
    }

  }

  public ModuleNode(AttributeNode attr, ModuleNode.Path path, BlockNode block) {
    this.attr = attr;
    this.path = path;
    this.block = block;
  }

  public NodeList children() {
    NodeList l = new NodeList();
    if (block != null) l = l.cons(block);
    l = l.cons(path);
    if (attr != null)
      l = l.cons(attr);
    return l;
  }

  public boolean external() {
    return block == null;
  }

  public boolean isPackage() {
    return attr == null;
  }

  public BlockNode block() {
    return block;
  }

  public ModuleNode.Path path() {
    return path;
  }

  public AttributeNode attribute() {
    return attr;
  }

  private AttributeNode attr;
  private ModuleNode.Path path;
  private BlockNode block;

}
