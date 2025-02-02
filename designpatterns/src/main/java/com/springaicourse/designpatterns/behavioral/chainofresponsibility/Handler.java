package com.springaicourse.designpatterns.behavioral.chainofresponsibility;

public abstract class Handler {

    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    protected boolean handle(String username, String password){
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }
}
