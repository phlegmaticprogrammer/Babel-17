package com.babel17.interpreter.runtime;

import com.babel17.interpreter.values.*;
import com.babel17.interpreter.program.*;
import java.util.*;

public final class Continuations {
  
  public static Continuation defaultContinuation() {
    return new Default();
  }

  private final static class Default implements Continuation {
    public EvalResult apply(Value v) {
      return EvalResult.createFinalResult(v);
    }
  }

  public final static class SendMessage implements Continuation {

    public SendMessage(String message, Continuation c) {
      this.message = message;
      this.c = c;
    }

    public EvalResult apply(Value v) {
      return c.apply(v.sendMessage(message));
    }
    private final String message;
    private final Continuation c;

  }

  public final static class Constr implements Continuation {

    public Constr(String name, Continuation c) {
      this.name = name;
      this.c = c;
    }

    public EvalResult apply(Value v) {
      if (v instanceof DynamicException) {
        return c.apply(v);
      } else {
        return c.apply(new ConstructorValue(name, v));
      }
    }
    private final String name;
    private final Continuation c;
  }

  public final static class Apply implements Continuation {

    public Apply(Evaluator e, Environment env, Expr operand, Continuation c) {
      this.e = e;
      this.operand = operand;
      this.c = c;
      this.env = env;
      this.f = null;
    }

    public EvalResult apply(Value v) {
      if (f != null) return f.apply(e, c, v);
      if (v instanceof ExceptionValue)
        return c.apply(((ExceptionValue) v).toDynamic());
      f = v;
      return e.eval(env, this, operand);
    }

    private final Evaluator e;
    private final Environment env;
    private final Continuation c;
    private final Expr operand;
    private Value f;
    
  }

  public static abstract class NeedsOnlyClosedCollector implements StateContinuation {

    public abstract Continuation needsOnlyClosedCollector();

    public NeedsOnlyClosedCollector(Evaluator e) {
      this.evaluator = e;
    }

    public EvalResult apply(State state) {
      return needsOnlyClosedCollector().apply(
              state.collector().sendMessage(Value.COLLECTOR_CLOSE));
    }
    protected Evaluator evaluator;
  }

  public final static class Begin implements StateContinuation {

    private final int oldsize;
    private final StateContinuation c;
    private final Statement next;
    private final Evaluator e;

    public Begin(Evaluator e, int oldsize, StateContinuation c, Statement next) {
      this.oldsize = oldsize;
      this.c = c;
      this.next = next;
      this.e = e;
    }

    public EvalResult apply(State state) {
      Environment env = state.environment();
      env.pop(env.size() - oldsize);
      return e.eval(state, c, next);
    }

    public Continuation needsOnlyClosedCollector() {
      return null;
    }
  }

  public final static class Yield implements Continuation {

    private StateContinuation c;
    private State s;
    private Statement next;
    private Evaluator e;

    public Yield(Evaluator e, StateContinuation c, State s, Statement next) {
      this.e = e;
      this.c = c;
      this.s = s;
      this.next = next;
    }

    public EvalResult apply(Value v) {
      if (v instanceof DynamicException) {
        return c.apply(new State(s.environment(), v));
      }
      Expr f = new ExprValue(s.collector().sendMessage(Value.COLLECTOR_ADD));
      Expr x = new ExprValue(v);
      return e.eval(s.environment(), new Yield1(e, c, s.environment(), next),
              new ExprApply(f, x));
    }
  }

  public final static class Yield1 implements Continuation {

    private Evaluator e;
    private Statement next;
    private StateContinuation c;
    private Environment env;

    public Yield1(Evaluator e, StateContinuation c, Environment env, Statement next) {
      this.e = e;
      this.c = c;
      this.env = env;
      this.next = next;
    }

    public EvalResult apply(Value collector) {
      if (collector instanceof ExceptionValue) {
        ExceptionValue p = (ExceptionValue) collector;
        return EvalResult.createFinalResult(new State(env, p.toDynamic()));
      }
      return e.eval(new State(env, collector), c, next);
    }
  }

  public final static class Val implements Continuation {

    public Val(Evaluator e, State state, StateContinuation c, StVal stval) {
      this.e = e;
      this.state = state;
      this.c = c;
      this.stval = stval;
    }

    public EvalResult apply(Value v) {
      Environment env = state.environment();
      int oldsize = env.size();
      MatchResult m = e.match(state.environment(), stval.pattern(), v);
      switch (m.status()) {
        case MatchResult.STATUS_EXCEPTION:
          env.pop(env.size() - oldsize);
          return c.apply(new State(env, m.exceptionDuringMatch()));
        case MatchResult.STATUS_FAIL:
          env.pop(env.size() - oldsize);
          return c.apply(new State(env, DynamicException.noMatch()));
      }
      if (stval.assign()) {
        int count = stval.countAssignments();
        for (int i = 0; i < count; i++) {
          env.updateValue(oldsize - i, env.getValue(stval.assignment(i)));
        }
        env.pop(env.size() - oldsize);
      }
      return e.eval(state, c, stval.nextStatement());
    }
    private Evaluator e;
    private State state;
    private StateContinuation c;
    private StVal stval;
  }

  public final static class With
          extends NeedsOnlyClosedCollector
          implements Continuation {

    private Environment env;
    private ControlStatement cs;
    private Continuation c;

    public With(Evaluator e, Environment env, ControlStatement cs, Continuation c) {
      super(e);
      this.env = env;
      this.cs = cs;
      this.c = c;
    }

    public EvalResult apply(Value collector) {
      if (collector instanceof DynamicException) {
        return c.apply(collector);
      }
      State state = new State(env.freeze(), collector);
      return evaluator.eval(state, this, cs);
    }

    public Continuation needsOnlyClosedCollector() {
      return c;
    }
  }

  public final static class ValWith implements Continuation, StateContinuation {

    public ValWith(Evaluator e, State state, StateContinuation c, StVal stval) {
      this.e = e;
      this.state = state;
      this.c = c;
      this.stval = stval;
    }

    public Continuation needsOnlyClosedCollector() {
      return null;
    }

    public EvalResult apply(Value collector) {
      oldsize = state.environment().size();
      return e.eval(new State(state.environment(), collector),
              this, ((ExprWith) stval.body()).control());
    }

    public EvalResult apply(State afterwith) {
      Value v = afterwith.collector().sendMessage(Value.COLLECTOR_CLOSE);
      Environment env = afterwith.environment();
      env.pop(env.size() - oldsize);
      oldsize = env.size();
      MatchResult m = e.match(env, stval.pattern(), v);
      switch (m.status()) {
        case MatchResult.STATUS_EXCEPTION:
          env.pop(env.size() - oldsize);
          return c.apply(new State(env, m.exceptionDuringMatch()));
        case MatchResult.STATUS_FAIL:
          env.pop(env.size() - oldsize);
          return c.apply(new State(env, DynamicException.noMatch()));
      }
      if (stval.assign()) {
        int count = stval.countAssignments();
        for (int i = 0; i < count; i++) {
          env.updateValue(oldsize - i, env.getValue(stval.assignment(i)));
        }
        env.pop(env.size() - oldsize);
      }
      return e.eval(state, c, stval.nextStatement());
    }
    private Evaluator e;
    private State state;
    private int oldsize;
    private StateContinuation c;
    private StVal stval;
  }

  public final static class While implements Continuation, StateContinuation {

    private Evaluator e;
    private State state;
    private StWhile w;
    private StateContinuation c;
    private int oldsize;

    public While(Evaluator e, State state, StateContinuation c, StWhile w) {
      this.e = e;
      this.state = state;
      this.c = c;
      this.w = w;
    }

    public EvalResult apply(Value test) {
      test = test.force();
      if (test instanceof DynamicException) {
        return c.apply(new State(state.environment(), test));
      } else if (!(test instanceof BooleanValue)) {
        return c.apply(new State(state.environment(), DynamicException.invalidWhileTest()));
      }
      BooleanValue b = (BooleanValue) test;
      if (b.value()) {
        oldsize = state.environment().size();
        return e.eval(state, this, w.body());
      } else {
        return e.eval(state, c, w.nextStatement());
      }
    }

    public EvalResult apply(State after) {
      Environment env = after.environment();
      env.pop(env.size() - oldsize);
      if (after.collector() instanceof DynamicException) {
        return c.apply(after);
      }
      state = after;
      return e.eval(state.environment(), this, w.condition());
    }

    public Continuation needsOnlyClosedCollector() {
      return null;
    }
  }

  public final static class If implements Continuation, StateContinuation {

    private Evaluator e;
    private State state;
    private StIf stif;
    private StateContinuation c;
    private int oldsize;

    public If(Evaluator e, State state, StateContinuation c, StIf stif) {
      this.e = e;
      this.state = state;
      this.c = c;
      this.stif = stif;
    }

    public EvalResult apply(Value test) {
      test = test.force();
      if (test instanceof DynamicException) {
        return c.apply(new State(state.environment(), test));
      } else if (!(test instanceof BooleanValue)) {
        return c.apply(new State(state.environment(),
                DynamicException.invalidIfTest()));
      }
      BooleanValue b = (BooleanValue) test;
      if (stif.nextStatement() == null && c.needsOnlyClosedCollector() != null) {
        if (b.value()) {
          return e.eval(state, c, stif.true_branch());
        } else {
          return e.eval(state, c, stif.false_branch());
        }
      }
      oldsize = state.environment().size();
      if (b.value()) {
        return e.eval(state, this, stif.true_branch());
      } else {
        return e.eval(state, this, stif.false_branch());
      }
    }

    public EvalResult apply(State state) {
      Environment env = state.environment();
      env.pop(env.size() - oldsize);
      if (state.collector() instanceof DynamicException) {
        return c.apply(state);
      } else {
        return e.eval(state, c, stif.nextStatement());
      }
    }

    public Continuation needsOnlyClosedCollector() {
      return null;
    }
  }

  public final static class For implements Continuation, StateContinuation {

    private Evaluator e;
    private State state;
    private StFor stfor;
    private StateContinuation c;

    public For(Evaluator e, State state, StateContinuation c, StFor stfor) {
      this.e = e;
      this.state = state;
      this.c = c;
      this.stfor = stfor;
    }

    public EvalResult apply(Value collection) {
      loop:
      do {
        collection = collection.sendMessage(Value.ITERATE).force();
        SequenceValue seq;
        if (collection instanceof ExceptionValue) {
          return c.apply(new State(state.environment(),
                  ((ExceptionValue) collection).toDynamic()));
        } else if (collection instanceof SequenceValue) {
          seq = (SequenceValue) collection;
        } else {
          return c.apply(new State(state.environment(),
                  DynamicException.invalidIterate()));
        }
        if (seq.isEmpty()) {
          return e.eval(state, c, stfor.nextStatement());
        } else if (seq.size() == 2) {
          Value elem = seq.getValueAt(0);
          collection = seq.getValueAt(1);
          Environment env = state.environment();
          int oldsize = env.size();
          MatchResult m = e.match(env, stfor.pattern(), elem);
          switch (m.status()) {
            case MatchResult.STATUS_EXCEPTION:
              env.pop(env.size() - oldsize);
              return c.apply(new State(env, m.exceptionDuringMatch()));
            case MatchResult.STATUS_FAIL:
              env.pop(env.size() - oldsize);
              continue loop;
          }
          EvalResult result = e.eval(state , this, stfor.body());
          state = (State) result.trampoline();
          env.pop(env.size()-oldsize);
          continue loop;
        } else {
          return c.apply(new State(state.environment(),
                  DynamicException.invalidIterate()));
        }
      } while (true);
    }
    
    public EvalResult apply(State after) {
      return EvalResult.createFinalResult(after);
    }
    
    public Continuation needsOnlyClosedCollector() {
      return null;
    }
  }

  public final static class Match implements Continuation, StateContinuation {

    private Evaluator e;
    private State state;
    private StMatch match;
    private StateContinuation c;
    private int oldsize;

    public Match(Evaluator e, State state, StateContinuation c, StMatch match) {
      this.e = e;
      this.state = state;
      this.c = c;
      this.match = match;
    }

    public EvalResult apply(Value value) {
      value = value.force();
      int numCases = match.numCases();
      Environment env = state.environment();
      oldsize = env.size();
      loop:
      for (int i=0; i<numCases; i++) {
        CaseStatement cs = match.getCase(i);
        MatchResult m = e.match(env, cs.pattern(), value);
        switch (m.status()) {
          case MatchResult.STATUS_EXCEPTION:
            env.pop(env.size()-oldsize);
            return c.apply(new State(env,
                    m.exceptionDuringMatch()));
          case MatchResult.STATUS_FAIL:
            env.pop(env.size()-oldsize);
            continue loop;
        }
        if (match.nextStatement() == null &&
                c.needsOnlyClosedCollector() != null)
          return e.eval(state, c, cs.body());
        else
          return e.eval(state, this, cs.body());
      }
      return e.eval(state, c, match.nextStatement());
    }

    public EvalResult apply(State state) {
      Environment env = state.environment();
      env.pop(env.size()-oldsize);
      return e.eval(state, c, match.nextStatement());
    }

    public Continuation needsOnlyClosedCollector() {
      return null;
    }

  }

  public final static class Obj implements StateContinuation {

    private ExprObject expr;

    public Obj(ExprObject expr) {
      this.expr = expr;
    }

    public EvalResult apply(State state) {
      if (state.collector() instanceof DynamicException)
        return EvalResult.createFinalResult(state.collector());
      ObjectValue obj = new ObjectValue();
      int count = expr.countMessages();
      Environment env = state.environment();
      for (int i=0; i<count; i++) {
        ExprObject.MessageIndex mi = expr.messageIndex(i);
        obj.put(mi.message(), env.getValue(mi.index()));
      }
      obj.seal();
      return EvalResult.createFinalResult(obj);
    }

    public Continuation needsOnlyClosedCollector() {
      return null;
    }

  }

  public final static class Compare implements Continuation {

    private ExprCompare compare;
    private Evaluator e;
    private Environment env;
    private Continuation c;
    private Value v1;

    public Compare(Evaluator e, Environment env, Continuation c, ExprCompare compare) {
      this.e = e;
      this.env = env;
      this.c = c;
      this.compare = compare;
      v1 = null;
    }

    public EvalResult apply(Value v) {
      if (v1 != null) {
        try {
          boolean b = compare.result() == v1.compareWithOtherValue(e, v);
          return c.apply(BooleanValue.create(b));
        } catch (CompareException x) {
          return EvalResult.createFinalResult(x.exception());
        }
      } else {
        v1 = v;
        return e.eval(env, this, compare.expr2());
      }
    }
  }

}
