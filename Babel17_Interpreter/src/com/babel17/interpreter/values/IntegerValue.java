package com.babel17.interpreter.values;

import java.math.*;

public final class IntegerValue extends Value {

  public static IntegerValue fromBigInteger(BigInteger b) {
    return new IntegerValue(b);
  }

  private IntegerValue(BigInteger b) {
    this.value = b;
  }

  private BigInteger value;

}
