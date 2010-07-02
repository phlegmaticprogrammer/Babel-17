package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class ConsPattern extends PatternNode {

  public ConsPattern(PatternNode head, PatternNode tail) {
    this.head = head;
    this.tail = tail;
  }

  private PatternNode head;
  private PatternNode tail;

  public PatternNode head() {
    return head;
  }

  public PatternNode tail() {
    return tail;
  }

  public NodeList children() {
    return new NodeList().cons(tail).cons(head);
  }

}
