package com.babel17.interpreter.runtime;

import com.babel17.interpreter.values.*;
import com.babel17.interpreter.program.*;

public final class Evaluator {

  public Evaluator() {
  }

  // match accumulates the matched variables in env
  // in case the match fails, the environment is restored to its original state
  public MatchResult match(Environment env, Pattern p, Value v) {
    switch (p.kind()) {
      case Pattern.KIND_ANY:
        return MatchResult.success();
      case Pattern.KIND_VAR:
        env.pushValue(v);
        return MatchResult.success();
      case Pattern.KIND_AS: {
        PatternAs as = (PatternAs) p;
        MatchResult m = match(env, as.pattern(), v);
        if (m.status() == MatchResult.STATUS_SUCCESS)
          env.pushValue(v);
        return m;
      }
      case Pattern.KIND_CONSTR: {
        PatternConstr pconstr = (PatternConstr) p;
        v = v.force();
        if (v instanceof ExceptionValue) {
          DynamicException e = ((ExceptionValue) v).toDynamic();
          return MatchResult.exception(e);
        } else if (v instanceof ConstructorValue) {
          ConstructorValue c = (ConstructorValue) v;
          if (c.name().equals(pconstr.name())) {
            return match(env, pconstr.pattern(), c.parameter());
          } else
            return MatchResult.fail();
        } else
          return MatchResult.fail();
      }
      case Pattern.KIND_IF: {
        PatternIf pif = (PatternIf) p;
        int oldsize = env.size();
        MatchResult m = match(env, pif.pattern(), v);
        if (m.status() == MatchResult.STATUS_SUCCESS) {
          Value result = (Value) eval(env, Continuations.defaultContinuation(),
                  pif.condition()).finalResult();
          result = result.force();
          if (result instanceof BooleanValue) {
            BooleanValue b = (BooleanValue) result;
            if (b.value())
              return MatchResult.success();
            else {
              env.pop(env.size()-oldsize);
              return MatchResult.fail();
            }
           } else {
            env.pop(env.size()-oldsize);
            return MatchResult.exception(DynamicException.invalidIfTest());
           }
        } else
          return m;
      }
      case Pattern.KIND_VALUE: {
        PatternValue pval = (PatternValue) p;
        Value x = pval.value();
        try {
          int compare = x.compareWithOtherValue(this, v);
          if (compare == 3) return MatchResult.success();
          else return MatchResult.fail();
        } catch (CompareException e) {
          return MatchResult.exception(e.exception());
        }
      }
      case Pattern.KIND_SPLIT: {
        PatternSplit psplit = (PatternSplit) p;
        Value vsplit = v.split(this, psplit.message(), psplit.countPatterns());
        if (vsplit == null) return MatchResult.fail();
        vsplit = vsplit.force();
        if (vsplit instanceof ExceptionValue) {
          ExceptionValue x = (ExceptionValue) vsplit;
          return MatchResult.exception(x.toDynamic());
        } else if (vsplit instanceof SequenceValue) {
          SequenceValue seq = (SequenceValue) vsplit;
          int count = seq.size();
          if (count != psplit.countPatterns())
            return MatchResult.fail();
          int oldsize = env.size();
          for (int i=0; i<count; i++) {
            MatchResult m = match(env, psplit.pattern(i), seq.getValueAt(i));
            if (m.status() != MatchResult.STATUS_SUCCESS) {
              env.pop(env.size()-oldsize);
              return m;
            }
          }  
          return MatchResult.success();
        } else
          return MatchResult.exception(
                  DynamicException.invalidSplit(psplit.message()));
      }
      case Pattern.KIND_PREDICATE: {
        PatternPredicate ppred = (PatternPredicate) p;
        EvalResult r = eval(env, 
                Continuations.defaultContinuation(), ppred.predicate());
        Value destructor = ((Value) r.trampoline()).force();
        if (destructor instanceof ConstructorValue) {
          Value destructed = v.deconstruct(this, (ConstructorValue) destructor);
          if (destructed == null) return MatchResult.fail();
          destructed = destructed.force();
          if (destructed instanceof ExceptionValue)
            return MatchResult.exception(((ExceptionValue) destructed).toDynamic());
          if (destructed instanceof ConstructorValue) {
            ConstructorValue cv = (ConstructorValue) destructed;
            if (cv.isNone()) return MatchResult.fail();
            Value param = cv.isSome();
            if (param == null) 
              return MatchResult.exception(DynamicException.invalidDeconstruct());
            if (ppred.pattern() == null)
              return MatchResult.success();
            return match(env, ppred.pattern(), param);
          } else
            return MatchResult.exception(DynamicException.invalidDeconstruct());
        } else {
          Value destructed = (Value) destructor.apply(this,
                  Continuations.defaultContinuation(), v).trampoline();
          destructed = destructed.force();
          if (destructed instanceof ExceptionValue)
            return MatchResult.exception(((ExceptionValue) destructed).toDynamic());
          if (destructed instanceof ConstructorValue) {
            ConstructorValue cv = (ConstructorValue) destructed;
            if (cv.isNone()) return MatchResult.fail();
            Value param = cv.isSome();
            if (param == null)
              return MatchResult.exception(DynamicException.invalidDeconstruct());
            if (ppred.pattern() == null)
              return MatchResult.success();
            return match(env, ppred.pattern(), param);
          } else if (destructed instanceof BooleanValue && ppred.pattern() == null) {
            BooleanValue b = (BooleanValue) destructed;
            return b.value() ? MatchResult.success() : MatchResult.fail();
          } else
            return MatchResult.exception(DynamicException.invalidDeconstruct());
        }
      }
      case Pattern.KIND_EXCEPTION: {
        v = v.force();
        if (v instanceof ExceptionValue) {
          return match(env, ((PatternException)p).pattern(),
                  ((ExceptionValue) v).value());
        } else return MatchResult.fail();
      }
      default:
        throw new RuntimeException("unknown pattern kind: "+p.kind());
    }
  }

  public EvalResult eval(State state, StateContinuation c, Statement statement) {
    if (statement == null) return c.apply(state);
    switch (statement.kind()) {
      case Program.KIND_YIELD: {
        Statement next = statement.nextStatement();
        StYield y = (StYield) statement;
        if (next == null) {
          Continuation jump = c.needsOnlyClosedCollector();
          if (jump != null) {
            Value collector = state.collector();
            if (collector instanceof BlockValue && ((BlockValue)collector).empty()) {
              return eval(state.environment(), jump, y.value());
            }
          }
        }
        return eval(state.environment(), 
                new Continuations.Yield(this, c, state, next),
                y.value());
      }
      case Program.KIND_BEGIN: {
        StBegin b = (StBegin) statement;
        int oldsize = state.environment().size();
        StateContinuation sc = new Continuations.Begin(this, oldsize, c,
                statement.nextStatement());
        return eval(state, sc, b.nestedStatement());
      }
      case Program.KIND_VAL: {
        StVal val = (StVal) statement;
        return eval(state.environment(),
                new Continuations.Val(this, state, c, val),
                val.body());
      }
      case Program.KIND_VAL_WITH: {
        StVal val = (StVal) statement;
        ExprWith with = (ExprWith) val.body();
        return eval(state.environment(),
                new Continuations.ValWith(this, state, c, val),
                with.collector());
      }
      case Program.KIND_WHILE: {
        StWhile w = (StWhile) statement;
        return eval(state.environment(),
                new Continuations.While(this, state, c, w),
                w.condition());
      }
      case Program.KIND_IF: {
        StIf stif = (StIf) statement;
        return eval(state.environment(),
                new Continuations.If(this, state, c, stif),
                stif.condition());
      }
      case Program.KIND_FOR: {
        StFor stfor = (StFor) statement;
        return eval(state.environment(),
                new Continuations.For(this, state, c, stfor),
                stfor.collection());
      }
      case Program.KIND_MATCH: {
        StMatch match = (StMatch) statement;
        return eval(state.environment(),
                new Continuations.Match(this, state, c, match),
                match.value());
      }
      case Program.KIND_LETREC: {
        StLetRec letrec = (StLetRec) statement;
        int num = letrec.numDefinitions();
        Environment env = state.environment();
        for (int i=0; i<num; i++) {
          Definition d = letrec.definition(i);
          if (d.takesArg())
            env.pushValue(new LambdaFunction(null, d));
          else
            env.pushValue(new LambdaValue(null, d));
        }
        env = env.freeze();
        for (int i=0; i<num; i++)
          ((Lambda)env.getValue(i)).setEnv(env);
        return eval(state, c, letrec.nextStatement());
      }
      default: throw new RuntimeException("unknown kind of statement: "+statement.kind());
    }
  }
  
  public EvalResult eval(final Environment env, final Continuation c,
          final Expr p)
  {
    switch (p.kind()) {
      case Program.KIND_VAR: {
        Value v = env.getValue(((ExprVar) p).index());
        if (v instanceof LambdaValue) {
          LambdaValue f = (LambdaValue) v;
          return c.apply(f.eval(this));
        }
        return c.apply(v);
      }
      case Program.KIND_SEND_MESSAGE: {
        ExprSendMessage expr = (ExprSendMessage) p;
        return eval(env, new Continuations.SendMessage(
                    expr.message(), c), expr.receiver());
      }
      case Program.KIND_VALUE:
        return EvalResult.createFinalResult(((ExprValue)p).value());
      case Program.KIND_CONSTR: {
        ExprConstr expr = (ExprConstr) p;
        return eval(env, new Continuations.Constr(expr.name(), c),
                expr.param());
      }
      case Program.KIND_APPLY: {
        ExprApply expr = (ExprApply) p;
        return eval(env, new Continuations.Apply(this, env, expr.operand(), c),
                expr.operator());
      }
      case Program.KIND_WITH: {
        ExprWith with = (ExprWith) p;
        return eval(env, new Continuations.With(this, env, with.control(), c),
                with.collector());
      }
      case Program.KIND_LAMBDA: {
        ExprLambda lambda = (ExprLambda) p;
        return EvalResult.createFinalResult(new LambdaFunction(env.freeze(),
                lambda.definition()));
      }
      case Program.KIND_OBJECT: {
        ExprObject obj = (ExprObject) p;
        Value dummyCollector = new BlockValue();
        return eval(new State(env.freeze(), dummyCollector),
             new Continuations.Obj(obj), obj.body());
      }
      case Program.KIND_COMPARE: {
        ExprCompare comp = (ExprCompare) p;
        return eval(env, new Continuations.Compare(this, env, c, comp),
                comp.expr1());
      }
      default:
        throw new RuntimeException("unknown kind of expression: "+p.kind());
    }
  }

}
