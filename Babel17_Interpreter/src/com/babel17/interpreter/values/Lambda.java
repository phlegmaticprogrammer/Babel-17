package com.babel17.interpreter.values;

import com.babel17.interpreter.runtime.Environment;
import com.babel17.interpreter.program.Definition;

public abstract class Lambda extends Value {

  protected Lambda(Environment env, Definition definition) {
    this.env = env;
    this.definition = definition;
  }

  public final void setEnv(Environment env) {
    if (this.env != null) throw new RuntimeException("environment has been set already");
    this.env = env;
  }

  public final Definition definition() {
    return definition;
  }

  public final Environment environment() {
    return env;
  }

  private final Definition definition;
  private Environment env;

}
