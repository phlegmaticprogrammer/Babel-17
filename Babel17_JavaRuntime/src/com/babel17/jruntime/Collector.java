package com.babel17.jruntime;

public interface Collector {

    public B17DynamicException add(B17Value value);
    public B17Value close();

}

/*

def even x = if n == 0 then true else odd (x-1)
def odd x = if n == 0 then false else even (x-1)

*/