package com.springaicourse.designpatterns.creational.factories.abstract_factory.component;

public class MsiGpu implements Component {
  @Override
  public void assemble() {
    System.out.println("assembling MSI GPU!!!");
    System.out.println("DONE!!!");
  }
}
