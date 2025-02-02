package com.springaicourse.designpatterns.creational.factories.factory.model;

public class BeefBurger implements Burger {
  @Override
  public void prepare() {
    System.out.println("preparing beef burger...");
    System.out.println("DONE!!!");
  }
}
