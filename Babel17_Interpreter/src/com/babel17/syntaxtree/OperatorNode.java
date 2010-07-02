package com.babel17.syntaxtree;

public final class OperatorNode extends Node {

  public final static int OR = 1;
  public final static int AND = 2;
  public final static int NOT = 3;

  public final static int EQUAL = 4;
  public final static int UNEQUAL = 5;
  public final static int UNRELATED = 6;
  public final static int GREATER = 7;
  public final static int GREATER_EQ = 8;
  public final static int LESS = 9;
  public final static int LESS_EQ = 10;

  public final static int PLUSPLUS = 11;
  public final static int MINUSMINUS = 12;
  public final static int TIMESTIMES = 13;

  public final static int CONS = 14;

  public final static int TO = 15;
  public final static int DOWNTO = 16;

  public final static int PLUS = 17;
  public final static int MINUS = 18;
  public final static int UMINUS = 19;
  public final static int TIMES = 20;
  public final static int DIV = 21;
  public final static int MOD = 22;
  public final static int POW = 23;

  public final static int RANDOM = 24;
  public final static int AWAIT = 25;

  public final static int THIS = 26;
  public final static int HERE = 27;
  public final static int ROOT = 28;

  public final static int APPLY = 29;
  public final static int MESSAGE_SEND = 30;

  public final static int TRUE = 31;
  public final static int FALSE = 32;

  public final static int EXCEPTION = 33;
  public final static int LAZY = 34;
  public final static int CONCURRENT = 35;

  public final static int INFINITY = 36;

  public final static int MODULE_KEY = 37;

  public OperatorNode(int operator) {
    this.operator = operator;
  }

  public int operator() {
    return operator;
  }

  public NodeList children() { return null; }

  public String description() {
    return "operator (opcode="+operator+")";
  }

  private int operator;

}
