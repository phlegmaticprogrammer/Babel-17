package com.babel17.syntaxtree;

import java.math.*;

public final class IntegerNode extends Node {
  
  public IntegerNode(BigInteger z) {
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
