package com.springaicourse.designpatterns.behavioral.chainofresponsibility;

public class ValidPasswordHandler extends Handler{
    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    public boolean handle(String username, String password) {
        System.out.println("Validating password...");
        if (!database.isValidPassword(username, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return true;
    }
}
