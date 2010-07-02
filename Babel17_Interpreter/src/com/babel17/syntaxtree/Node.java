package com.babel17.syntaxtree;

public abstract class Node {

  /**
   * @return the list of children if this node has children, otherwise null
   */
  public abstract NodeList children();

  public Location location() {
    return location;
  }

  public BlockNode toBlock() {
    if (this instanceof BlockNode) return (BlockNode) this;
    else return BlockNode.empty();
  }

  public Node mergeLocation(Location loc) {
    location = Location.merge(location, loc);
    return this;
  }

  public void distributeLocation() {
    NodeList c = children();
    if (c == null) return;
    for (Node n : c) {
      if (n.location() == null) n.mergeLocation(location);
      n.distributeLocation();
    }
  }

  public boolean hasLocation() {
    return location != null;
  }

  public Node mergeLocation() {
    for (Node n : children()) {
      mergeLocation(n.location);
    }
    return this;
  }

  public String toString() {
    Location loc = location();
    return this.description()+(loc != null ? " ("+loc.toString() +")" : " (?)");
  }

  public String description() {
       return this.getClass().getName();
  }

  private Location location = null;

  private static void printIndent(int depth) {
    for (int i = 0; i < depth; i++) {
      System.out.print(" ");
    }
  }

  public void print(int depth) {
    printIndent(depth);
    System.out.println("" + this);
    NodeList children = children();
    if (children != null) {
      for (Node n : children) {
        n.print(depth + 2);
      }
    }
  }
}
