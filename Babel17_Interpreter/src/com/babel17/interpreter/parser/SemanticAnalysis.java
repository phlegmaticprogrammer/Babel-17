package com.babel17.interpreter.parser;

import com.babel17.syntaxtree.*;
import com.babel17.syntaxtree.patterns.*;
import java.util.*;
import org.antlr.runtime.*;

public final class SemanticAnalysis {

  private ParseException ae;

  private void error(Location loc, String message) {
    ae.addMessage(loc, message);
  }

  private void errorexpr(Node node) {
    Location loc = node.location();
    loc = new Location(loc.startLine(), loc.startColumn());
    error(loc, "statement expected, expression found");
  }

  private void errorstatement(Node node) {
    error(node.location(), "expression expected, statement found");
  }

  public final static class StaticEnv {

    private boolean allow_this;
    private boolean expr;
    private boolean statement;
    private SymbolTable symbols;

    /*public void debug(String section) {
      System.out.println(section);
      symbols.debug("  ");
    }*/

    public boolean expr() {
      return expr;
    }

    public StaticEnv setExpr() {
      StaticEnv env = new StaticEnv(this);
      env.expr = true;
      env.statement = false;
      env.symbols = symbols.clearLinearScope();
      return env;
    }

    public StaticEnv setLinearExpr() {
      StaticEnv env = new StaticEnv(this);
      env.expr = true;
      env.statement = false;
      return env;
    }

    public boolean statement() {
      return statement;
    }

    public StaticEnv setStatement() {
      StaticEnv env = new StaticEnv(this);
      env.expr = false;
      env.statement = true;
      return env;
    }

    public SymbolTable symbols() {
      return symbols;
    }

    public StaticEnv setSymbols(SymbolTable symbols) {
      StaticEnv env = new StaticEnv(this);
      env.symbols = symbols;
      return env;
    }

    private StaticEnv(StaticEnv env) {
      if (env != null) {
        this.expr = env.expr;
        this.statement = env.statement;
        this.allow_this = env.allow_this;
        this.symbols = env.symbols;
      } else {
      }
    }

    public boolean thisIsAllowed() {
      return allow_this;
    }

    public StaticEnv allowThis(boolean allow) {
      StaticEnv env = new StaticEnv(this);
      env.allow_this = allow;
      return env;
    }

    private static StaticEnv initEnv() {
      StaticEnv env = new StaticEnv(null);
      env.symbols = new SymbolTable();
      env.allow_this = false;
      env.expr = false;
      env.statement = false;
      return env;
    }

    public StaticEnv addPatternVals(PatternIds ids) {
      return setSymbols(symbols().addPatternVals(ids));
    }

    public StaticEnv addLinearPatternVals(PatternIds ids) {
      return setSymbols(symbols().addLinearPatternVals(ids));
    }

    public StaticEnv addNonLinear(SymbolTable s) {
      return setSymbols(symbols().addNonLinear(s));
    }

    public StaticEnv clearLinearScope() {
      return setSymbols(symbols().clearLinearScope());
    }
  }

  public final static class PatternIds {

    private TreeSet<IdentifierPattern> set;
    private boolean is_delta;

    public PatternIds() {
      set = new TreeSet<IdentifierPattern>();
      is_delta = false;
    }

    private PatternIds(TreeSet<IdentifierPattern> set, boolean d) {
      this.set = set;
      is_delta = d;
    }

    public boolean delta() {
      return is_delta;
    }

    public void clearDelta() {
      is_delta = false;
    }

    public void setDelta() {
      is_delta = true;
    }

    public boolean contains(IdentifierPattern p) {
      return set.contains(p);
    }

    public void add(IdentifierPattern p) {
      set.add(p);
    }

    public void add(PatternIds ids) {
      for (IdentifierPattern id : ids.collect()) {
        add(id);
      }
    }

    public void intersect(PatternIds ids) {
      Iterator<IdentifierPattern> it = set.iterator();
      while (it.hasNext()) {
        if (!ids.contains(it.next())) {
          it.remove();
        }
      }
    }

    public PatternIds copy() {
      return new PatternIds(
              (TreeSet<IdentifierPattern>) set.clone(), is_delta);
    }

    public Collection<IdentifierPattern> collect() {
      return java.util.Collections.unmodifiableCollection(set);
    }
  }

  public static class AnalysisResult {

    private SymbolTable usedSymbols;

    public AnalysisResult(SymbolTable s) {
      usedSymbols = s;
    }

    public AnalysisResult() {
      this(SymbolTable.EMPTY);
    }

    public SymbolTable usedSymbols() {
      return usedSymbols;
    }
  }

  public static class PatternAnalysisResult extends AnalysisResult {

    private PatternIds pids;

    public PatternAnalysisResult(SymbolTable usedSymbols, PatternIds pids) {
      super(usedSymbols);
      this.pids = pids;
    }

    public PatternAnalysisResult(PatternIds ids) {
      this(SymbolTable.EMPTY, ids);
    }

    public PatternAnalysisResult() {
      this(new PatternIds());
    }

    public PatternIds patternIds() {
      return pids;
    }
  }

  public void errorLinearPattern(PatternIds ids) {
    for (IdentifierPattern id : ids.collect()) {
      error(id.location(), "pattern must be linear, but identifier '"
              + id.name() + "' is bound more than once");
    }
  }

  public void errorDeltaPattern(PatternNode pattern) {
    error(pattern.location(), "δ-pattern is not allowed here");
  }

  public PatternAnalysisResult analyzePatternList(StaticEnv env, NodeList patterns,
          boolean lastElementDelta) {
    PatternIds ids = new PatternIds();
    SymbolTable used = SymbolTable.EMPTY;
    int len = patterns.length();
    for (int i = 0; i < len; i++) {
      PatternNode e = (PatternNode) patterns.get(i);
      PatternAnalysisResult r = analyzePattern(env, e);
      used = used.merge(r.usedSymbols());
      PatternIds e_ids = r.patternIds();
      if ((!lastElementDelta || i != len - 1) && e_ids.delta()) {
        errorDeltaPattern(e);
      }
      PatternIds intersect = e_ids.copy();
      intersect.intersect(ids);
      errorLinearPattern(intersect);
      ids.add(e_ids);
    }
    return new PatternAnalysisResult(used, ids);
  }

  public PatternAnalysisResult analyzePattern(StaticEnv env,
          PatternNode pattern) {
    if (pattern instanceof AsPattern) {
      AsPattern p = (AsPattern) pattern;
      PatternAnalysisResult r = analyzePattern(env, p);
      PatternIds ids = r.patternIds();
      if (ids.contains(p.identifier())) {
        error(p.identifier().location(),
                "in pattern 'id as p', identifier id='"
                + p.identifier().name() + "' is already bound in p");
      }
      ids.add(p.identifier());
      return r;
    } else if (pattern instanceof IdentifierPattern) {
      PatternIds ids = new PatternIds();
      ids.add((IdentifierPattern) pattern);
      return new PatternAnalysisResult(ids);
    } else if (pattern instanceof ConsPattern) {
      ConsPattern p = (ConsPattern) pattern;
      return analyzePatternList(env, p.children(), false);
    } else if (pattern instanceof ConstrPattern) {
      ConstrPattern p = (ConstrPattern) pattern;
      if (p.pattern() == null) {
        return new PatternAnalysisResult();
      }
      PatternAnalysisResult r = analyzePattern(env, p.pattern());
      PatternIds ids = r.patternIds();
      if (ids.delta()) {
        errorDeltaPattern(p.pattern());
      }
      ids.clearDelta();
      return r;
    } else if (pattern instanceof ExceptionPattern) {
      ExceptionPattern p = (ExceptionPattern) pattern;
      PatternAnalysisResult r = analyzePattern(env, p.param());
      PatternIds ids = r.patternIds();
      if (ids.delta()) {
        errorDeltaPattern(p.param());
      }
      ids.clearDelta();
      return r;
    } else if (pattern instanceof IfPattern) {
      IfPattern p = (IfPattern) pattern;
      PatternAnalysisResult r = analyzePattern(env, p.pattern());
      PatternIds ids = r.patternIds();
      env = env.setExpr().addPatternVals(ids);
      AnalysisResult u = analyze(env, p.condition());
      // used(p if c) = used(p) + (used(c)-ids(p))
      SymbolTable s = r.usedSymbols().
              merge(u.usedSymbols().remove(ids.collect()));
      return new PatternAnalysisResult(s, ids);
    } else if (pattern instanceof IntegerPattern) {
      return new PatternAnalysisResult();
    } else if (pattern instanceof StringPattern) {
      return new PatternAnalysisResult();
    } else if (pattern instanceof ListPattern) {
      ListPattern p = (ListPattern) pattern;
      return analyzePatternList(env, p.elements(), true);
    } else if (pattern instanceof SetPattern) {
      SetPattern p = (SetPattern) pattern;
      error (pattern.location(), "set patterns are not supported yet");
      return analyzePatternList(env, p.elements(), true);
    } else if (pattern instanceof MapPattern) {
      MapPattern p = (MapPattern) pattern;
      error (pattern.location(), "map patterns are not supported yet");
      return analyzePatternList(env, p.elements(), true);
    } else if (pattern instanceof MapPattern.KeyValue) {
      MapPattern.KeyValue p = (MapPattern.KeyValue) pattern;
      return analyzePatternList(env, p.children(), false);
    } else if (pattern instanceof RecordPattern) {
      error (pattern.location(), "record patterns are not supported yet");
      return new PatternAnalysisResult();
    } else if (pattern instanceof ValPattern) {
      ValPattern p = (ValPattern) pattern;
      return new PatternAnalysisResult(
              analyze(env.setExpr(), p.value()).usedSymbols(),
              new PatternIds());
    } else if (pattern instanceof PredicatePattern) {
      PredicatePattern p = (PredicatePattern) pattern;
      AnalysisResult u = analyze(env.setExpr(), p.predicate());
      if (p.pattern() != null) {
        PatternAnalysisResult r = analyzePattern(env, p.pattern());
        return new PatternAnalysisResult(u.usedSymbols().
                merge(r.usedSymbols()), r.patternIds());
      } else {
        return new PatternAnalysisResult(u.usedSymbols(),
                new PatternIds());
      }
    } else if (pattern instanceof NullaryPattern) {
      NullaryPattern p = (NullaryPattern) pattern;
      switch (p.kind()) {
        case NullaryPattern.ANY:
        case NullaryPattern.FALSE:
        case NullaryPattern.TRUE:
        case NullaryPattern.INFINITY:
        case NullaryPattern.NEGATIVE_INFINITY:
          return new PatternAnalysisResult();
        case NullaryPattern.ELLIPSIS: {
          PatternIds ids = new PatternIds();
          ids.setDelta();
          return new PatternAnalysisResult(ids);
        }
        default:
          throw new RuntimeException("cannot analyze NullaryPattern of kind " + p.kind());
      }
    } else if (pattern instanceof ParseErrorNode) {
      error(pattern.location(), "invalid pattern");
      return new PatternAnalysisResult();
    } else {
      error(pattern.location(), "cannot analyze pattern '" + pattern + "'");
      return new PatternAnalysisResult();
    }
  }

  public AnalysisResult analyzeBlock(StaticEnv env, BlockNode node) {
    return analyzeBlock(env, node, false);
  }

  private static void propagateDepInfo(SymbolTable defids) {
    fj.data.List<SymbolTable.Id> ids = defids.collectNonLinearIds();
    boolean changed;
    do {
      changed = false;
      for (SymbolTable.Id id : ids) {
        SymbolTable.DepId did = (SymbolTable.DepId) id;
        if (did.defdeps != null) {
          for (Object o : did.defdeps) {
            SymbolTable.DefId that = (SymbolTable.DefId) o;
            if (that.valindex > did.valindex) {
              did.valindex = that.valindex;
              changed = true;
            }
            if (that.uses_this) {
              SymbolTable.DefId defid = (SymbolTable.DefId) did;
              if (!defid.uses_this) {
                defid.uses_this = true;
                changed = true;
              }
            }
          }
        }
      }
    } while (changed);
  }

  public AnalysisResult analyzeBlock(StaticEnv env, BlockNode node, boolean is_object_block) {
    SymbolTable defids = new SymbolTable();
    IdentifierNode lastdef = null;
    boolean lastdef_has_arg = false;
    int i = -1;
    for (Node statement : node.statements()) {
      i++;
      if (statement instanceof DefNode) {
        DefNode d = (DefNode) statement;
        /*if (has_methods && d.pattern() == null && d.id().name().equals(Value.APPLY))
          error(d.id().location(), "an 'apply' message always has a parameter");
        if (has_methods && d.pattern() != null && d.id().name().equals(Value.REPRESENTATIVE))
          error(d.id().location(), "a 'representative' message cannot have a parameter");*/
        if (lastdef != null && d.id().compareTo(lastdef) == 0) {
          if (lastdef_has_arg && d.pattern() == null) {
            error(d.id().location(), "function definition expected, missing argument");
          } else if (!lastdef_has_arg) {
            error(d.id().location(), "there has already been a definition for '" + lastdef + "'");
          }
        } else {
          lastdef = d.id();
          lastdef_has_arg = d.pattern() != null;
          if (defids.get(lastdef.name()) != null) {
            error(d.id().location(), "cannot have two separate definitions for '" + lastdef.name() + "' in the same block");
          } else {
            SymbolTable.DefId defid =
                    lastdef_has_arg ? new SymbolTable.DefWithArgId()
                    : new SymbolTable.DefNoArgId();
            defid.position = i;
            defid.id = d.id();
            defid.memo = null;
            defid.defdeps = null;
            defid.uses_this = false;
            defid.valindex = -1;
            defids = defids.set(lastdef.name(), defid);
          }
        }
      } else {
        lastdef = null;
      }
    }
    env = env.addNonLinear(defids);
    NodeList statements = node.statements();
    int count_statements = statements.length();

    PatternIds introduced[] = new PatternIds[count_statements];
    SymbolTable used[] = new SymbolTable[count_statements];

    // the current mapping from val-identifier to index of statement where introduced
    TreeMap<String, Integer> introducedVals = new TreeMap<String, Integer>();

    // the mapping from the index of the val-statement to the set of defs of this block it depends on
    TreeSet<IdentifierNode> valDependencies[] = new TreeSet[count_statements];

    boolean block_is_expr = env.expr();
    boolean block_is_statement = env.statement();
    i = -1;
    for (Node statement : statements) {
      i++;
      valDependencies[i] = null;
      if (statement instanceof ValNode) {
        ValNode v = (ValNode) statement;
        PatternAnalysisResult par = analyzePattern(env, v.pattern());
        PatternIds ids = par.patternIds();
        if (ids.delta()) {
          errorDeltaPattern(v.pattern());
        }
        // the ids must be different from the defids
        // also test for linear scoping
        boolean linear = v.assign();
        for (IdentifierPattern p : ids.collect()) {
          if (defids.get(p.name()) != null) {
            error(p.location(), "id '" + p.name() + "' is also introduced via def in this block");
          }
          if (linear && !env.symbols().isLinear(p.name())) {
            error(p.location(), "id '" + p.name() + "' has not been introduced in linear scope");
          }
        }
        AnalysisResult u = analyze(env.setLinearExpr(), v.rightSide());
        if (!linear) {
          env = env.addLinearPatternVals(ids);
          introduced[i] = par.patternIds();
        } else {
          introduced[i] = new PatternIds();
        }
        used[i] = u.usedSymbols().merge(par.usedSymbols());
        for (IdentifierPattern p : introduced[i].collect()) {
          introducedVals.put(p.name().toLowerCase(), i);
        }
        TreeSet<IdentifierNode> valDeps = new TreeSet<IdentifierNode>();
        for (SymbolTable.Id usedId : used[i].collectNonLinearIds()) {
          if (usedId.id != null && defids.get(usedId.id.name()) != null) {
            valDeps.add(usedId.id);
          }
        }
        valDependencies[i] = valDeps;
      } else if (statement instanceof ObjectUpdateNode) {
        valDependencies[i] = null;;
        used[i] = SymbolTable.EMPTY;
        introduced[i] = new PatternIds();
        error(statement.location(), "object updates are not supported yet");
      } else if (statement instanceof DefNode) {
        DefNode d = (DefNode) statement;
        StaticEnv subenv = is_object_block ? env.allowThis(true) : env;
        subenv = subenv.setExpr();
        if (d.pattern() != null) {
          PatternAnalysisResult par = analyzePattern(subenv, d.pattern());
          PatternIds ids = par.patternIds();
          subenv = subenv.addLinearPatternVals(ids);
          AnalysisResult u = analyze(subenv, d.rightSide());
          used[i] = u.usedSymbols().remove(ids.collect()).merge(par.usedSymbols());
          introduced[i] = new PatternIds();
        } else {
          AnalysisResult u = analyze(subenv, d.rightSide());
          used[i] = u.usedSymbols();
          introduced[i] = new PatternIds();
        }
        SymbolTable.DefId defid = (SymbolTable.DefId) defids.get(d.id().name());
        if (defid != null) {
          if (is_object_block && used[i].get("this") != null) {
            defid.uses_this = true;
          }
          for (String usedName : used[i].collect()) {
            Integer index = introducedVals.get(usedName);
            if (index != null) {
              defid.mergeValIndex(index);
            } else {
              SymbolTable.DefId id1 = (SymbolTable.DefId) defids.get(usedName);
              if (id1 != null) {
                defid.addDefDep(id1);
              }
            }
          }
        }
      } else if (statement instanceof YieldNode) {
        YieldNode y = (YieldNode) statement;
        AnalysisResult u = analyze(env.setLinearExpr(), y.expr());
        used[i] = u.usedSymbols();
        introduced[i] = new PatternIds();
      } else if (statement instanceof MemoizeNode) {
        MemoizeNode m = (MemoizeNode) statement;
        for (Node _mid : m.memoIds()) {
          MemoizeNode.MemoId mid = (MemoizeNode.MemoId) _mid;
          String name = mid.id().name();
          SymbolTable.DefId id = (SymbolTable.DefId) defids.get(name);
          if (id == null) {
            error(mid.location(), "no corresponding def found for memoizing '" + name + "'");
          } else if (id.memo != null) {
            error(mid.location(), "duplicate memoize declaration found for '" + name + "'");
          } else {
            id.memo = mid;
          }
        }
        used[i] = SymbolTable.EMPTY;
        introduced[i] = new PatternIds();
      } else {
        StaticEnv subenv = env;
        if (block_is_expr && i == count_statements - 1) {
          subenv = subenv.setLinearExpr();
        } else if (block_is_statement || i < count_statements - 1
                || is_object_block)
        {
          subenv = subenv.setStatement();
        }
        AnalysisResult u = analyze(subenv, statement);
        used[i] = u.usedSymbols();
        introduced[i] = new PatternIds();
      }
    }

    propagateDepInfo(defids);
    i = -1;
    for (Node statement : statements) {
      i++;
      if (statement instanceof ValNode) {
        for (IdentifierNode idNode : valDependencies[i]) {
          SymbolTable.DefId defid = (SymbolTable.DefId) defids.get(idNode.name());
          if (defid != null && defid.uses_this) {
            error(idNode.location(), "val-statement references def '"
                    + idNode.name() + "' which (possibly indirectly) references 'this'");
          }
          if (defid != null && defid.valindex >= i) {
            error(idNode.location(), "val-statement references def '"
                    + idNode.name() + "' which (possibly indirectly) references this or a later val-statement");
          }
        }
      }
    }

    for (SymbolTable.Id id : defids.collectNonLinearIds()) {
      if (id instanceof SymbolTable.DefId) {
        SymbolTable.DefId did = (SymbolTable.DefId) id;
        if (did.position <= did.valindex) {
          error(did.id.location(), "def-statement cannot forward reference (possibly indirectly) later val-statement");
        }
      }
    }

    SymbolTable usedSymbols = SymbolTable.EMPTY;
    for (i = count_statements - 1; i >= 0; i--) {
      usedSymbols = usedSymbols.remove(introduced[i].collect()).merge(used[i]);
    }
    usedSymbols = usedSymbols.remove(defids);
    return new AnalysisResult(usedSymbols);
  }

  public AnalysisResult analyzeNodeList(StaticEnv env, NodeList nl) {
    SymbolTable used = SymbolTable.EMPTY;
    for (Node node : nl) {
      AnalysisResult r = analyze(env, node);
      used = used.merge(r.usedSymbols());
    }
    return new AnalysisResult(used);
  }

  public AnalysisResult analyze(StaticEnv env, Node node) {
    if (node instanceof IdentifierNode) {
      IdentifierNode idnode = (IdentifierNode) node;
      SymbolTable.Id id = env.symbols().get(idnode.name());
      if (id == null) {
        error(idnode.location(), "unknown identifier '" + idnode.name() + "'");
      }
      if (env.statement()) {
        errorexpr(idnode);
      }
      id = new SymbolTable.Id();
      id.id = idnode;
      SymbolTable t = SymbolTable.EMPTY.set(idnode.name(), id);
      return new AnalysisResult(t);
    } else if (node instanceof ConstrNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      ConstrNode n = (ConstrNode) node;
      if (n.arg() != null) {
        return analyze(env.setExpr(), n.arg());
      } else {
        return new AnalysisResult();
      }
    } else if (node instanceof BeginNode) {
      BeginNode n = (BeginNode) node;
      return analyzeBlock(env, n.block());
    } else if (node instanceof ForNode) {
      ForNode n = (ForNode) node;
      AnalysisResult u = analyze(env.setExpr(), n.collection());
      PatternAnalysisResult pr = analyzePattern(env, n.pattern());
      PatternIds ids = pr.patternIds();
      if (ids.delta()) {
        errorDeltaPattern(n.pattern());
      }
      env = env.addLinearPatternVals(ids);
      AnalysisResult v = analyzeBlock(env.setStatement(), n.block());
      SymbolTable used = v.usedSymbols().remove(ids.collect()).merge(u.usedSymbols());
      return new AnalysisResult(used);
    } else if (node instanceof LambdaNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      LambdaNode n = (LambdaNode) node;
      int len = n.patterns().length();
      if (len != n.blocks().length()) {
        error(node.location(), "invalid lambda (unequal number of blocks and patterns)");
      }
      SymbolTable used = SymbolTable.EMPTY;
      env = env.clearLinearScope();
      for (int i = 0; i < len; i++) {
        PatternNode p = (PatternNode) n.patterns().get(i);
        BlockNode b = (BlockNode) n.blocks().get(i);
        PatternAnalysisResult r = analyzePattern(env, p);
        PatternIds ids = r.patternIds();
        if (ids.delta()) {
          errorDeltaPattern(p);
        }
        StaticEnv subenv = env.addLinearPatternVals(ids);
        AnalysisResult u = analyzeBlock(subenv.setLinearExpr(), b);
        used = used.merge(u.usedSymbols().remove(ids.collect()));
      }
      return new AnalysisResult(used);
    } else if (node instanceof BinaryNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      BinaryNode n = (BinaryNode) node;
      return analyzeNodeList(env.setExpr(), n.children());
    } else if (node instanceof BlockNode) {
      return analyzeBlock(env, (BlockNode) node);
    } else if (node instanceof DefNode) {
      throw new RuntimeException("DefNodes are not handled here");
    } else if (node instanceof IfNode) {
      IfNode n = (IfNode) node;
      AnalysisResult u = analyzeNodeList(env.setExpr(), n.conditions());
      AnalysisResult v = analyzeNodeList(env, n.blocks());
      return new AnalysisResult(u.usedSymbols().merge(v.usedSymbols()));
    } else if (node instanceof OperatorNode) {
      return new AnalysisResult();
    } else if (node instanceof CompareNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      CompareNode n = (CompareNode) node;
      return analyzeNodeList(env.setExpr(), n.comparisons());
    } else if (node instanceof IntegerNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      return new AnalysisResult();
    } else if (node instanceof StringNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      return new AnalysisResult();
    } else if (node instanceof ListNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      return analyzeNodeList(env.setExpr(), node.children());
    } else if (node instanceof SetNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      return analyzeNodeList(env.setExpr(), node.children());
    } else if (node instanceof MapNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      return analyzeNodeList(env.setExpr(), node.children());
    } else if (node instanceof MapNode.KeyValue) {
      if (env.statement()) {
        errorexpr(node);
      }
      return analyzeNodeList(env.setExpr(), node.children());
    } else if (node instanceof MatchNode) {
      MatchNode n = (MatchNode) node;
      int len = n.patterns().length();
      if (len != n.blocks().length()) {
        error(node.location(), "invalid match (unequal number of blocks and patterns)");
      }
      SymbolTable used = analyze(env.setExpr(), n.value()).usedSymbols();
      for (int i = 0; i < len; i++) {
        PatternNode p = (PatternNode) n.patterns().get(i);
        BlockNode b = (BlockNode) n.blocks().get(i);
        PatternAnalysisResult r = analyzePattern(env, p);
        PatternIds ids = r.patternIds();
        if (ids.delta()) {
          errorDeltaPattern(p);
        }
        StaticEnv subenv = env.addLinearPatternVals(ids);
        AnalysisResult v = analyzeBlock(subenv, b);
        used = used.merge(v.usedSymbols().remove(ids.collect()));
      }
      return new AnalysisResult(used);
    } else if (node instanceof MessageNode) {
      return new AnalysisResult();
    } else if (node instanceof UnaryNode) {
      UnaryNode n = (UnaryNode) node;
      if (env.statement()) {
        errorexpr(node);
      }
      return analyze(env.setExpr(), n.operand());
    } else if (node instanceof WhileNode) {
      WhileNode w = (WhileNode) node;
      AnalysisResult u = analyze(env.setExpr(), w.condition());
      AnalysisResult v = analyzeBlock(env.setStatement(), w.block());
      return new AnalysisResult(u.usedSymbols().merge(v.usedSymbols()));
    } else if (node instanceof WithNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      WithNode w = (WithNode) node;
      AnalysisResult u = analyze(env.setExpr(), w.collector());
      AnalysisResult v = analyze(env.setLinearExpr(), w.control());
      return new AnalysisResult(u.usedSymbols().merge(v.usedSymbols()));
    } else if (node instanceof NullaryNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      NullaryNode n = (NullaryNode) node;
      switch (n.operator().operator()) {
        case OperatorNode.TRUE:
        case OperatorNode.FALSE:
        case OperatorNode.INFINITY:
          break;
        case OperatorNode.THIS:
          if (!env.thisIsAllowed()) {
            error(n.location(), "'this' is only allowed within the 'def'-statements of an object definition");
          }
          SymbolTable u = SymbolTable.EMPTY.set("this",
                  new SymbolTable.Id());
          return new AnalysisResult(u);
        default:
          throw new RuntimeException("cannot analyze nullary operator '" + n.operator().operator() + "'");
      }
      return new AnalysisResult();
    } else if (node instanceof RecordNode) {
      if (env.statement())
        errorexpr(node);
      RecordNode n = (RecordNode) node;
      error(n.location(), "record notation for objects not supported yet");
      return new AnalysisResult();
    } else if (node instanceof ObjectNode) {
      if (env.statement()) {
        errorexpr(node);
      }
      ObjectNode n = (ObjectNode) node;
      if (n.parents() != null) {
        analyze(env.setExpr(), n.parents());
        error(n.parents().location(), "derived objects are not supported yet");
      }
      env = env.clearLinearScope().allowThis(false).setStatement();
      AnalysisResult r = analyzeBlock(env, n.block(), true);
      return new AnalysisResult(r.usedSymbols().remove("this"));
    } else if (node instanceof ParseErrorNode) {
      if (env.expr()) {
        error(node.location(), "invalid expression");
      } else if (env.statement()) {
        error(node.location(), "invalid statement");
      } else {
        error(node.location(), "invalid statement/expression");
      }
      return new AnalysisResult();
    } else {
      error(node.location(), "cannot analyze '" + node + "'");
      return new AnalysisResult();
    }
  }

  private SemanticAnalysis() {
    ae = new ParseException();
  }

  private static void analyze(Node node, boolean expr) throws ParseException {
    SemanticAnalysis a = new SemanticAnalysis();
    if (!expr && node instanceof BlockNode)
        a.analyzeBlock(StaticEnv.initEnv().setStatement(), (BlockNode) node);
    else
        a.analyze(StaticEnv.initEnv(), node);
    if (a.ae.countMessages() > 0) {
      throw a.ae;
    }
  }

  private static Collection<ErrorMessage> cleanErrorMessages(Collection<ErrorMessage> errors) {
    TreeMap<Location, ErrorMessage> cleaned = new TreeMap(new Location.CascadingComparator());
    for (ErrorMessage m : errors) {
      Location mloc = m.location();
      ErrorMessage cleanedm = cleaned.get(mloc);
      if (cleanedm == null) {
        cleaned.put(mloc, m);
      } else {
        Location cleanedloc = cleanedm.location();
        Location l = cleanedloc.add(mloc);
        if (!l.equals(mloc)) {
          cleaned.remove(mloc);
          while (cleaned.remove(mloc) != null) {
          }
          cleaned.put(mloc, m);
        }
      }
    }
    return cleaned.values();
  }

  public static Collection<ErrorMessage> parseAndAnalyze(java.io.Reader reader, boolean expr)
          throws java.io.IOException
  {
    ArrayList<ErrorMessage> errors = new ArrayList<ErrorMessage>();
    CharStream charstream = new ANTLRReaderStream(reader);
    Parser.ParseResult r = Parser.parse(charstream);
    if (r.hasErrors()) {
      ParseException e = r.exception();
      for (int i = 0; i < e.countMessages(); i++) {
        errors.add(e.getMessage(i));
      }
    }
    try {
      SemanticAnalysis.analyze(r.node(), expr);
    } catch (ParseException e) {
      for (int i = 0; i < e.countMessages(); i++) {
        errors.add(e.getMessage(i));
      }
    }
    return cleanErrorMessages(errors);
  }
  
  public final static class Result {
    public Collection<ErrorMessage> errors;
    public Node node;
  }

  public static Result doAnalysis(java.io.Reader reader, boolean expr)
          throws java.io.IOException
  {
    ArrayList<ErrorMessage> errors = new ArrayList<ErrorMessage>();
    CharStream charstream = new ANTLRReaderStream(reader);
    Parser.ParseResult r = Parser.parse(charstream);
    if (r.hasErrors()) {
      ParseException e = r.exception();
      for (int i = 0; i < e.countMessages(); i++) {
        errors.add(e.getMessage(i));
      }
    }
    try {
      SemanticAnalysis.analyze(r.node(), expr);
    } catch (ParseException e) {
      for (int i = 0; i < e.countMessages(); i++) {
        errors.add(e.getMessage(i));
      }
    }
    Result result = new Result();
    result.errors = cleanErrorMessages(errors);
    result.node = r.node();
    return result;
  }



}
