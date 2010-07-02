package com.babel17.interpreter.program;

import java.util.*;

public class StLetRec extends Statement {

  // how to deal with modules
  // module x
  //    ...
  // end
  //
  // is same as
  // def x = object ... end      ??
  //
  //

  public StLetRec(List<Definition> defs, List<Module> mods, Statement next) {
    super(next);
    this.definitions = new ArrayList(defs.size());
    Collections.copy(this.definitions, defs);
    this.modules = new ArrayList(mods.size());
    Collections.copy(this.modules, mods);
  }
  
  public Definition definition(int i) {
    return definitions.get(i);
  }

  public int numDefinitions() {
    return definitions.size();
  }

  public int numModules() {
    return modules.size();
  }

  public Module module(int i) {
    return modules.get(i);
  }

  public int kind() {
    return KIND_LETREC;
  }
  
  private List<Definition> definitions;
  private List<Module> modules;

}
