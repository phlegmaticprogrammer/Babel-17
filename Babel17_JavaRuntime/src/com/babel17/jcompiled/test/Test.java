package com.babel17.jcompiled.test;

import com.babel17.jruntime.*;

final class Test {
  private static B17Value _internal__even(B17Value _n, Continuation _c)
  { return null; }
  final static B17Function _even = new B17Function() {
    public B17Value apply(B17Value x, Continuation c) {
      return _internal__even(x, c);
    }
  };

  private static B17Value _internal__odd(B17Value _n, Continuation _c)
  { return null; }
  final static B17Function _odd = new B17Function() {
    public B17Value apply(B17Value x, Continuation c) {
      return _internal__odd(x, c);
    }
  };

  private static B17Value _internal__f(Continuation _c)
  { return null; }
  final static B17Suspension _f = new B17Suspension() {
    public B17Value apply(Continuation c) {
      return _internal__f(c);
    }
  };


}