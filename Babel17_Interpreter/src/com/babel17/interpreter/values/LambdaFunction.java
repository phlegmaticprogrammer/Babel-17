package com.babel17.interpreter.values;

import com.babel17.interpreter.runtime.Environment;
import com.babel17.interpreter.program.Definition;

import com.babel17.interpreter.runtime.*;
import com.babel17.interpreter.program.*;

public final class LambdaFunction extends Lambda {

  public LambdaFunction(Environment env, Definition definition) {
    super(env, definition);
  }

  public EvalResult apply(Evaluator e, Continuation c, Value v) {
    if (v instanceof DynamicException) {
      return c.apply(v);
    }
    Environment env = environment().freeze();
    Definition d = definition();
    int n = d.numCases();
    for (int i = 0; i < n; i++) {
      CaseExpr caseexpr = d.getCase(i);
      Pattern p = caseexpr.pattern();
      MatchResult m = e.match(env, p, v);
      int status = m.status();
      if (status == MatchResult.STATUS_EXCEPTION) {
        return c.apply(m.exceptionDuringMatch());
      } else if (status == MatchResult.STATUS_SUCCESS) {
        return e.eval(env, c, caseexpr.body());
      }
    }
    return c.apply(DynamicException.outOfDomain());
  }
  
}
