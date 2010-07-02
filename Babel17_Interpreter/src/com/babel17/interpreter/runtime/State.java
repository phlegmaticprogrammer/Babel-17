package com.babel17.interpreter.runtime;

import com.babel17.interpreter.values.Value;

public final class State {

  public State(Environment env, Value collector) {
    this.env = env;
    this.collector = collector;
  }

  public Environment environment() {
    return env;
  }

  public Value collector() {
    return collector;
  }

  private Environment env;
  private Value collector;

}
