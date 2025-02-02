package com.springaicourse.designpatterns.behavioral.chainofresponsibility;

public class UserExistsHandler extends Handler{
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        System.out.println("Checking if user exists...");
        if (!database.isValidUser(username)) {
            System.out.println("This username is not registered!");
            System.out.println("Sign Up to our app now!");
            return false;
        }
        return handle(username, password);
    }
}
