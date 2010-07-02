package com.babel17.interpreter.values;

public final class SpecialNumber extends Value {

  private static final int POSITIVE_INFINITY_TAG = 0;
  private static final int NEGATIVE_INFINITY_TAG = 1;

  public final static SpecialNumber POSITIVE_INFINITY =
          new SpecialNumber(POSITIVE_INFINITY_TAG);

  public final static SpecialNumber NEGATIVE_INFINITY =
          new SpecialNumber(NEGATIVE_INFINITY_TAG);

  private SpecialNumber(int tag) {
    value = tag;
  }

  private int value;

}
