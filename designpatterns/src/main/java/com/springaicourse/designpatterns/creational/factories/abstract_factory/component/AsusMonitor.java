package com.springaicourse.designpatterns.creational.factories.abstract_factory.component;

public class AsusMonitor implements Component {
  @Override
  public void assemble() {
    System.out.println("assembling ASUS MONITOR!!!");
    System.out.println("DONE!!!");
  }
}
