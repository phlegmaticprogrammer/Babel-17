package com.babel17.jruntime;

public class B17DynamicException extends B17Value {

    public final static String APPLYERROR = "APPLYERROR";
    public final static String INVALIDMESSAGE = "INVALIDMESSAGE";

    private final B17Value param;

    private B17DynamicException(B17Value param) {
        this.param = param;
    }

    public static B17DynamicException make(String exceptionName) {
        return new B17DynamicException(B17CExpr.make(exceptionName));
    }

    public static B17DynamicException make(String exceptionName, B17Value param) {
        return new B17DynamicException(B17CExpr.make(exceptionName, param));
    }


}
