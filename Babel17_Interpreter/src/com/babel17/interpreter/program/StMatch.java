package com.babel17.interpreter.program;

import java.util.*;

public final class StMatch extends ControlStatement {

  public StMatch(Expr value, List<CaseStatement> cases, Statement next) {
    super(next);
    this.value = value;
    this.cases = new ArrayList(cases.size());
    Collections.copy(this.cases, cases);
  }

  public Expr value() {
    return value;
  }

  public int kind() {
    return Program.KIND_MATCH;
  }

  public int numCases() {
    return cases.size();
  }

  public CaseStatement getCase(int i) {
    return cases.get(i);
  }

  private List<CaseStatement> cases;
  private Expr value;

}
