package com.springaicourse.designpatterns.behavioral.comand.components;

public class Curtains {
    private boolean open = false;

    public void openClose() {
        open = !open;
    }

    public boolean isOpen() {
        return open;
    }
}
