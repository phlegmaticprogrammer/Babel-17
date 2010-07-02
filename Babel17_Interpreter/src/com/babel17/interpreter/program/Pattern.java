package com.babel17.interpreter.program;

public abstract class Pattern {

  public final static int KIND_ANY = 1;
  public final static int KIND_AS = 2;
  public final static int KIND_CONSTR = 3;
  public final static int KIND_IF = 4;
  public final static int KIND_PREDICATE = 5;
  public final static int KIND_SPLIT = 6;
  public final static int KIND_VALUE = 7;
  public final static int KIND_VAR = 8;
  public final static int KIND_EXCEPTION = 9;

  public abstract int kind();

}
