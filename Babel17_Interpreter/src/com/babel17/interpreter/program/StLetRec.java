package com.babel17.interpreter.program;

import java.util.*;

public class StLetRec extends Statement {

  public StLetRec(List<Definition> defs, Statement next) {
    super(next);
    this.definitions = new ArrayList(defs.size());
    Collections.copy(this.definitions, defs);
  }
  
  public Definition definition(int i) {
    return definitions.get(i);
  }

  public int numDefinitions() {
    return definitions.size();
  }

  public int kind() {
    return KIND_LETREC;
  }
  
  private List<Definition> definitions;

}
