package com.springaicourse.designpatterns.creational.factories.factory.model;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("preparing veggie burger...");
        System.out.println("DONE!!!");
    }
}
