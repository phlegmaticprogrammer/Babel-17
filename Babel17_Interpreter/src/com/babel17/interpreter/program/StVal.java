package com.babel17.interpreter.program;

public final class StVal extends Statement {
  
  public StVal(int[] assignments, Pattern pattern, Expr body, Statement next) {
    super(next);
    this.assignments = new int[assignments.length];
    for (int i=0; i<assignments.length; i++)
      this.assignments[i] = assignments[i];
    this.pattern = pattern;
    this.body = body;
  }

  public boolean assign() {
    return assignments != null;
  }

  public int countAssignments() {
    return assignments.length;
  }

  public int assignment(int i) {
    return assignments[i];
  }

  public int kind() {
    if (body instanceof ExprWith)
      return KIND_VAL_WITH;
    else
      return KIND_VAL;
  }

  public Pattern pattern() {
    return pattern;
  }

  public Expr body() {
    return body;
  }

  private int[] assignments;
  private Pattern pattern;
  private Expr body;

}
