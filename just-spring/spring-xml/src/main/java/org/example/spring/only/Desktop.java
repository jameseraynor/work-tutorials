package org.example.spring.only;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop is created");
    }

    public void compile(){
        System.out.println("Code, Compile, Run in Desktop");
    }
}
