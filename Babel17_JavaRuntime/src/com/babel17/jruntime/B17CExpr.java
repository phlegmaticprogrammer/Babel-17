package com.babel17.jruntime;

public class B17CExpr extends B17Value {

    private final String constructor;
    private final B17Value param;

    private B17CExpr(String constructor, B17Value param) {
        this.constructor = constructor;
        this.param = param;
    }

    public static B17CExpr make(String constructor, B17Value param) {
        return new B17CExpr(constructor.toUpperCase(), param);
    }

    public static B17CExpr make(String constructor) {
        return new B17CExpr(constructor.toUpperCase(), B17Object.nil);
    }

}
