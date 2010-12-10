package com.babel17.interpreter.parser;

import com.babel17.syntaxtree.*;
import com.babel17.syntaxtree.patterns.*;
import fj.data.*;
import fj.P2;
import fj.pre.Ord;


public final class SymbolTable {

    public final static SymbolTable EMPTY = new SymbolTable();

    public static class Id  {
      IdentifierNode id = null;

      public int compareTo(Object that) {
        return id.compareTo(((Id)that).id);
      }
    }

    public static class DepId extends Id {
      int valindex = -1; // the highest index where a val is introduced that this def depends on
      java.util.TreeSet defdeps = null; // what other defs of this block does this def depend on?
      void addDefDep(DefId defdep) {
        if (defdeps == null) defdeps = new java.util.TreeSet();
        defdeps.add(defdep);
      }
      void mergeValIndex(int index) {
        if (index > valindex) valindex = index;
      }
    }
    
    public static class DefId extends DepId {
      int position;
      MemoizeNode.MemoId memo = null;
      boolean uses_this = false; // does this definition depend on this ?
    }

    public final static class DefNoArgId extends DefId {
      Node body = null;
    }

    public final static class DefWithArgId extends DefId {
      NodeList patterns = null;
      NodeList bodies = null;
    }

    public final static class ValId extends Id {
    }

    private TreeMap<String, Id> table;
    private TreeMap<String, ValId> linearscope;

    public void debug(String prefix) {
      System.out.print(prefix+"nonlinear:");
      for (String x : table.keys()) {
        System.out.print(" "+x);
      }
      System.out.print(prefix+" linear:");
      for (String x : linearscope.keys()) {
        System.out.print(" "+x);
      }
      System.out.println("");
    }

    public SymbolTable() {
      table = TreeMap.empty(Ord.stringOrd);
      linearscope = TreeMap.empty(Ord.stringOrd);
    }

    public List<String> collect() {
      return table.keys().append(linearscope.keys());
    }

    private SymbolTable(TreeMap<String, Id> table, 
            TreeMap<String, ValId> linearscope)
    {
      this.table = table;
      this.linearscope = linearscope;
    }

    public Id get(String name) {
      name = name.toLowerCase();
      Option<Id> opid = table.get(name);
      if (opid.isNone()) {
        Option<ValId> opvalid = linearscope.get(name);
        if (opvalid.isNone()) return null; else return opvalid.some();
      } else return opid.some();
    }

    public boolean isLinear(String name) {
      return linearscope.get(name.toLowerCase()).isSome();
    }
    
    public SymbolTable set(String name, Id id) {
      name = name.toLowerCase();
      return new SymbolTable(table.set(name, id), linearscope.delete(name));
    }

   /* public SymbolTable addLinearPatternVals(SemanticAnalysis.PatternIds ids) {
      TreeMap<String, ValId> lin = linearscope;
      TreeMap<String, Id> t = table;
      for (IdentifierPattern id : ids.collect()) {
        ValId vid = new ValId();
        vid.id = id.toNode();
        String name = id.name().toLowerCase();
        lin = lin.set(name, vid);
        t = t.delete(name);
      }
      return new SymbolTable(t, lin);
    }

    public SymbolTable addPatternVals(SemanticAnalysis.PatternIds ids) {
      if (!linearscope.isEmpty())
        throw new RuntimeException("linearscope must be empty");
      TreeMap<String, Id> t = table;
      for (IdentifierPattern id : ids.collect()) {
        ValId vid = new ValId();
        vid.id = id.toNode();
        t = t.set(id.name().toLowerCase(), vid);
      }
      return new SymbolTable(t, linearscope);
    }      */

    public SymbolTable clearLinearScope() {
      if (linearscope.isEmpty()) return this;
      TreeMap<String, Id> t = table;
      for (P2<String,ValId> kv : linearscope) {
        t = t.set(kv._1(), kv._2());
      }
      TreeMap<String, ValId> empty = TreeMap.empty(Ord.stringOrd);
      return new SymbolTable(t, empty);
    }
    
    public SymbolTable addNonLinear(SymbolTable s) {
      TreeMap<String, ValId> lin = linearscope;
      TreeMap<String, Id> t = table;
      for (P2<String,Id> kv : s.table) {
        String name = kv._1();
        Id id = kv._2();
        lin = lin.delete(name);
        t = t.set(name, id);
      }
      return new SymbolTable(t, lin);
    }

    public SymbolTable merge(SymbolTable s) {
      TreeMap<String, Id> t = table;
      for (P2<String,Id> kv : s.table) {
        String name = kv._1();
        Id id = kv._2();
        t = t.set(name, id);
      }
      return new SymbolTable(t, linearscope);
    }

    public SymbolTable remove(java.util.Collection<IdentifierPattern> p) {
      TreeMap<String, Id> t = table;
      for (IdentifierPattern id : p) {
        t = t.delete(id.name().toLowerCase());
      }
      return new SymbolTable(t, linearscope);
    }

    public SymbolTable remove(String name) {
      return new SymbolTable(table.delete(name.toLowerCase()), linearscope);
    }

    public SymbolTable remove(SymbolTable symbolTable) {
      TreeMap<String, Id> t = table;
      for (String id : symbolTable.table.keys()) {
        t = t.delete(id);
      }
      return new SymbolTable(t, linearscope);
    }

    public List<Id> collectNonLinearIds() {
      return table.values();
    }

}
