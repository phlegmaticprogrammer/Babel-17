package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;

public final class StringPattern extends PatternNode {
  
  public StringPattern(String s) {
    this.s = s;
  }

  public NodeList children() {
    return null;
  }

  public String description() {
    return s.toString();
  }
  
  private String s;



}
