package com.example.ioc_di.beans.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    Computer computer;

    // @Autowired
    // public Dev(Laptop computer) {
    //     this.computer = computer;
    // }

    // public Dev() {
    // }

    // @Autowired
    // public void setComputer(Computer computer) {
    //     this.computer = computer;
    // }

    public void doWork() {

        computer.compile();

        System.out.println("Dev is working...");
    }

}
