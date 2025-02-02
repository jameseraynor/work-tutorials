package com.springaicourse.designpatterns.behavioral.chainofresponsibility;

import java.util.Map;

public class Database {

    private final Map<String,String> users;

    public Database() {
        users = Map.of(
                "user_username", "user_password",
                "admin_username", "admin_password"
        );
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
