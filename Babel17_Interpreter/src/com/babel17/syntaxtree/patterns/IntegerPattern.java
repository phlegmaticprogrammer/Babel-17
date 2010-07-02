package com.babel17.syntaxtree.patterns;

import com.babel17.syntaxtree.*;
import java.math.*;

public final class IntegerPattern extends PatternNode {
  
  public IntegerPattern(BigInteger z) {
    this.z = z;
  }

  public NodeList children() {
    return null;
  }

  public String description() {
    return z.toString();
  }

  public BigInteger value() {
    return z;
  }
  
  private BigInteger z;



}
