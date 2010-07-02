package com.babel17.interpreter.parser;

import java.util.*;
import com.babel17.syntaxtree.Location;

public class Modules {

  public TreeMap<ModulePath, Location> externalModuleDecls = emptyMap();
  public TreeMap<ModulePath, Location> externalModuleDefs = emptyMap();
  public TreeMap<ModulePath, Location> internalModuleDefs = emptyMap();
  public TreeMap<ModulePath, Location> packageDefs = emptyMap();

  public static interface ErrorReporter {
    public void reportError(Location loc, String error);
  }
  
  private static TreeMap<ModulePath, Location> emptyMap() {
    return new TreeMap<ModulePath, Location>();
  }
  
  public Modules() {
  }

  public void searchPackagePrefixErrors(ErrorReporter reporter) {
    for (Map.Entry<ModulePath, Location> p : packageDefs.entrySet()) {
      ModulePath packagePath = p.getKey();
      for (Map.Entry<ModulePath, Location> q : packageDefs.entrySet()) {
        int c = packagePath.prefixCompare(q.getKey());
        if (c == -1) {
          reporter.reportError(p.getValue(), "package '"+packagePath+"' cannot be a prefix of package '"+
                  q.getKey()+"'");
          reporter.reportError(q.getValue(), "package '"+packagePath+"' cannot be a prefix of package '"+
                  q.getKey()+"'");
        } else if (c == 1) {
          reporter.reportError(p.getValue(), "package '"+q.getKey()+"' cannot be a prefix of package '"+
                  packagePath+"'");
          reporter.reportError(q.getValue(), "package '"+q.getKey()+"' cannot be a prefix of package '"+
                  packagePath+"'");
          
        }        
      }
      for (Map.Entry<ModulePath, Location> q : externalModuleDefs.entrySet()) {
        int c = packagePath.prefixCompare(q.getKey());
        if (c == 1 || c == 0) {
          reporter.reportError(p.getValue(), "module '"+q.getKey()+"' cannot be a prefix of package '"+
                  packagePath+"'");
          reporter.reportError(q.getValue(), "module '"+q.getKey()+"' cannot be a prefix of package '"+
                  packagePath+"'");

        }
      }
    }
  }

  public void searchMissingDeclarations(ErrorReporter reporter) {
    for (Map.Entry<ModulePath, Location> p : externalModuleDefs.entrySet()) {
      if (!externalModuleDecls.containsKey(p.getKey())) {
        reporter.reportError(p.getValue(), "the module '"+p.getKey()+"' is unreachable;"+ 
                " to be reachable, it needs to be referenced via 'external' from another package/module");
      }
    }
  }

  public void searchMissingDefinitions(ErrorReporter reporter) {
    for (Map.Entry<ModulePath, Location> p : externalModuleDecls.entrySet()) {
      if (!externalModuleDefs.containsKey(p.getKey())) {
        reporter.reportError(p.getValue(), "external module '"+p.getKey()+"' not found");
      }
    }
  }
  
  public void searchErrors(ErrorReporter reporter) {
    searchPackagePrefixErrors(reporter);
    searchMissingDeclarations(reporter);
    searchMissingDefinitions(reporter);
  }

}
