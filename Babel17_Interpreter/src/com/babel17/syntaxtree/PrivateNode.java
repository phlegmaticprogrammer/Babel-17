package com.babel17.syntaxtree;

public final class PrivateNode extends Node {

  public final static class PrivateId extends Node {
    public PrivateId(IdentifierNode id) {
      this.id = id;
    }
    public IdentifierNode id() { return id; }
    public NodeList children() { return new NodeList().cons(id); }
    public String description() {
        return "private "+id;
    }
    private IdentifierNode id;
  }

  public PrivateNode(NodeList memoIds) {
    this.memoIds = memoIds;
  }

  public NodeList privateIds() { return memoIds; }

  public NodeList children() { return memoIds; }

  private NodeList memoIds;

}
