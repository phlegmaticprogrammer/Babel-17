package com.babel17.interpreter.program;

import java.util.*;

public abstract class Program {

  public final static int KIND_VAR = 0;
  public final static int KIND_SEND_MESSAGE = 1;
  public final static int KIND_VALUE = 2;
  public final static int KIND_CONSTR = 3;
  public final static int KIND_APPLY = 4;
  public final static int KIND_VAL = 5;
  public final static int KIND_VAL_WITH = 6;
  public final static int KIND_BEGIN = 7;
  public final static int KIND_FOR = 8;
  public final static int KIND_MATCH = 9;
  public final static int KIND_WHILE = 10;
  public final static int KIND_OBJECT = 11;
  public final static int KIND_LETREC = 12;
  public final static int KIND_YIELD = 13;
  public final static int KIND_WITH = 14;
  public final static int KIND_IF = 15;
  public final static int KIND_LAMBDA = 16;
  public final static int KIND_COMPARE = 17;
  
  public abstract int kind();

  /*private SortedSet<Integer> freeVars = null;

  public SortedSet<Integer> freeVars() {
    if (freeVars == null)
      freeVars = Collections.unmodifiableSortedSet(calcFreeVars());
    return freeVars;
  }

  protected abstract SortedSet<Integer> calcFreeVars();*/

}
