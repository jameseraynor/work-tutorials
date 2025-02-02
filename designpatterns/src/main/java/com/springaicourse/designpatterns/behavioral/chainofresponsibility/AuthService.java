package com.springaicourse.designpatterns.behavioral.chainofresponsibility;

public class AuthService extends Handler{
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (!handler.handle(username, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        System.out.println("Authorization was successful!");
        return handle(username, password);
    }

}
