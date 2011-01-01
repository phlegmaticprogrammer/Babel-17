package com.babel17.jruntime;

public class B17Value {
    public B17Value send(Message m) {
        return B17DynamicException.make(B17DynamicException.INVALIDMESSAGE,
                new B17String(m.get()));
    }
    public B17Value apply(B17Value v, Continuation c) {
        return B17DynamicException.make(B17DynamicException.APPLYERROR);
    }
    public B17Value sendApply(Message m, B17Value v, Continuation c) {
        return send(m).apply(v, c);
    }
    public B17Value force(Continuation continuation) {
        return continuation.apply(this);
    }
}
