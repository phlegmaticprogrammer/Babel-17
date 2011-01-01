package com.babel17.jruntime;

public class Thunk {
    private final B17Value result;
    public Thunk(B17Value result) {
        this.result = result;
    }
    public Thunk() {
        result = null;
    }
    protected Thunk compute() {
        return null;
    }
    public final B17Value force() {
        Thunk t = this;
        while (t.result == null) {
            t = t.compute();
        }
        return t.result;
    }
}
