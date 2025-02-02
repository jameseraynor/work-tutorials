package com.springaicourse.designpatterns.creational.factories.abstract_factory.component;

public class AsusGpu implements Component {
  @Override
  public void assemble() {
    System.out.println("assembling ASUS GPU!!!");
    System.out.println("DONE!!!");
  }
}
