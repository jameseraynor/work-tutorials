package com.example.ioc_di.beans.beans;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Code Compiled");
    }

}
