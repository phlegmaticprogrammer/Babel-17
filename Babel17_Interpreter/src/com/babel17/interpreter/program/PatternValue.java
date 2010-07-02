package com.babel17.interpreter.program;

import com.babel17.interpreter.values.Value;

public class PatternValue extends Pattern {

    public PatternValue(Value v) {
        value = v;
    }

    public int kind() { return KIND_VALUE; }


    public Value value() { return value; }

    private Value value;

}
