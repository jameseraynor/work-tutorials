package com.springaicourse.designpatterns.behavioral.chainofresponsibility;

public class RoleCheckHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        System.out.println("Checking user role...");
        if (username.equals("admin_username")) {
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page...");
        return false;
    }
}
