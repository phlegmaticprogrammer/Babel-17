package com.babel17.interpreter.program;

import java.util.*;

public final class Definition {
  
  public static enum MemoizationType {
    NO_MEMOIZATION,
    WEAK_MEMOIZATION,
    STRONG_MEMOIZATION
  }

  public Definition(MemoizationType memoType, List<CaseExpr> cases) {
    this.memoType = memoType;
    this.cases = new ArrayList(cases.size());
    Collections.copy(this.cases, cases);
    body = null;
  }

  public int numCases() {
    return cases.size();
  }

  public CaseExpr getCase(int i) {
    return cases.get(i);
  }
  
  public Definition(MemoizationType memoType, Expr body) {
    this.memoType = memoType;
    this.cases = null;
    this.body = body;
  }

  public boolean takesArg() {
    return cases != null;
  }

  public MemoizationType memoType() { return memoType; }
  public Expr body() { return body; }

  private MemoizationType memoType;
  private List<CaseExpr> cases;
  private Expr body;

}
