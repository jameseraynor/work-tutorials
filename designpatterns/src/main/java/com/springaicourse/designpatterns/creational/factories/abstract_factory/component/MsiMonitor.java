package com.springaicourse.designpatterns.creational.factories.abstract_factory.component;

public class MsiMonitor implements Component {
  @Override
  public void assemble() {
    System.out.println("assembling MSI MONITOR!!!");
    System.out.println("DONE!!!");
  }
}
