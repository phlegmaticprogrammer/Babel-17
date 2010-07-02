package com.babel17.syntaxtree;

import java.util.*;

public class NodeList implements Iterable<Node> {
  
  private NodeList next;
  private Node node;

  private static class Iter implements Iterator<Node> {
    NodeList list;
    Iter(NodeList list) {
      this.list = list;
    }
    public boolean hasNext() {
      return !list.empty();
    }
    public Node next() {
      if (list.empty()) throw new NoSuchElementException();
      Node n = list.head();
      list = list.tail();
      return n;
    }
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  public NodeList() {
    next = null;
    node = null;
  }

  public Node head() {
    if (node == null) throw new RuntimeException("empty list has no head");
    return node;
  }

  public int length() {
    if (next == null) return 0;
    else return next.length()+1;
  }

  public Node get(int index) {
    if (index <= 0) {
      if (node != null) return node;
      else throw new RuntimeException("index is out of bounds");
    } else
      return next.get(index-1);
  }

  public NodeList tail() {
    if (node == null) throw new RuntimeException("empty list has no tail");
    return next;
  }

  public boolean empty() {
    return node == null;
  }

  public NodeList cons(Node node) {
    if (node == null) throw new IllegalArgumentException();
    NodeList l = new NodeList();
    l.node = node;
    l.next = this;
    return l;
  }

  public NodeList append(NodeList l) {
    for (Node n : this.reverse()) {
      l = l.cons(n);
    }
    return l;
  }

  public NodeList reverse() {
    NodeList l = new NodeList();
    for (Node n : this) l = l.cons(n);
    return l;
  }

  public Iterator<Node> iterator() {
    return new Iter(this);
  }

  public Location location() {
    if (empty()) return null;
    Location l = head().location();
    for (Node n : this) {
      l = Location.merge(l, n.location());
    }
    return l;
  }

  public boolean hasErrors() {
    for (Node i : this)
      if (i instanceof ParseErrorNode) return true;
    return false;
  }

  public NodeList suppressErrors() {
    if (hasErrors())
      return new NodeList();
    else
      return this;
  }

}
