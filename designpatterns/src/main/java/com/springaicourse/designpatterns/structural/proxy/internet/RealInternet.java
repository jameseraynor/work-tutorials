package com.springaicourse.designpatterns.structural.proxy.internet;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Successfully opened connection to " + host);
    }

}