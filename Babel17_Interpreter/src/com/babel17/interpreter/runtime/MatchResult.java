package com.babel17.interpreter.runtime;

import com.babel17.interpreter.values.DynamicException;

public final class MatchResult {

  public final static int STATUS_SUCCESS = 0;
  public final static int STATUS_FAIL = 1;
  public final static int STATUS_EXCEPTION = 2;

  public static MatchResult success() {
    return new MatchResult(STATUS_SUCCESS);
  }

  public static MatchResult fail() {
    return new MatchResult(STATUS_FAIL);
  }

  public static MatchResult exception(DynamicException e) {
    return new MatchResult(e);
  }

  private MatchResult(int status) {
    this.status = status;
    this.exception = null;
  }

  private MatchResult(DynamicException exception) {
    this.status = STATUS_EXCEPTION;
    this.exception = exception;
  }

  public DynamicException exceptionDuringMatch() {
    return exception;
  }

  public int status() {
    return status;
  }

  private int status;
  private DynamicException exception;

}
