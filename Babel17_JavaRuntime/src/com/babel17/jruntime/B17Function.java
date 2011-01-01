package com.babel17.jruntime;

public abstract class B17Function extends B17Value {

    public abstract B17Value apply(B17Value v, Continuation c);

}
