package com.babel17.syntaxtree;

public final class PrivateNode extends Node {

  public final static class PrivateId extends Node {
    public PrivateId(boolean strong, IdentifierNode id) {
      this.strong = strong;
      this.id = id;
    }
    public boolean strong() { return strong; }
    public IdentifierNode id() { return id; }
    public NodeList children() { return new NodeList().cons(id); }
    public String description() {
      if (strong) return "strong private"; else return "weak private";
    }
    private boolean strong;
    private IdentifierNode id;
  }

  public PrivateNode(NodeList memoIds) {
    this.memoIds = memoIds;
  }

  public NodeList privateIds() { return memoIds; }

  public NodeList children() { return memoIds; }

  private NodeList memoIds;

}
