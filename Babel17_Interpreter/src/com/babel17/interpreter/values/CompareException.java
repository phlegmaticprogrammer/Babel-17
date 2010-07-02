package com.babel17.interpreter.values;

public final class CompareException extends Exception {

  public CompareException(DynamicException e) {
    this.e = e;
  }

  public DynamicException exception() {
    return e;
  }

  private DynamicException e;
  
}
