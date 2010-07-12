package com.babel17.syntaxtree;

public final class ObjectNode extends ControlNode {

  public final static int COMBINE_GLUE = 1;
  public final static int COMBINE_MERGE = 2;

  public ObjectNode(BlockNode block) {
      this(block, 0, null);
  }

  public ObjectNode(BlockNode block, int combineMethod, Node parents) {
      this.block = block;
      this.combineMethod = combineMethod;
      this.parents = parents;
  }

  public BlockNode block() {
    return block;
  }

  public Node parents() {
      return parents;
  }

  public int combineMethod() {
      return combineMethod;
  }

  public NodeList children() {
      if (parents == null)
        return new NodeList().cons(block);
      else
        return new NodeList().cons(block).cons(parents);
  }

  private BlockNode block;
  private int combineMethod;
  private Node parents;

}
