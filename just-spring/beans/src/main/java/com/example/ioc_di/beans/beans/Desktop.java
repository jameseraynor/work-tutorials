package com.example.ioc_di.beans.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    public void compile() {
        System.out.println("Code Compiled but faster");
    }

}
