package com.babel17.syntaxtree;

public final class MemoizeNode extends Node {

  public final static class MemoId extends Node {
    public MemoId(boolean strong, IdentifierNode id) {
      this.strong = strong;
      this.id = id;
    }
    public boolean strong() { return strong; }
    public IdentifierNode id() { return id; }
    public NodeList children() { return new NodeList().cons(id); }
    public String description() {
      if (strong) return "strong memo"; else return "weak memo";
    }
    private boolean strong;
    private IdentifierNode id;
  }

  public MemoizeNode(NodeList memoIds) {
    this.memoIds = memoIds;
  }

  public NodeList memoIds() { return memoIds; }

  public NodeList children() { return memoIds; }

  private NodeList memoIds;

}
