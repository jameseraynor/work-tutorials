package com.springaicourse.designpatterns.creational.factories.abstract_factory.company;

import com.springaicourse.designpatterns.creational.factories.abstract_factory.component.MsiMonitor;
import com.springaicourse.designpatterns.creational.factories.abstract_factory.component.MsiGpu;
import com.springaicourse.designpatterns.creational.factories.abstract_factory.component.Component;

public class MsiManufactorer extends Company {
  @Override
  public Component createComponent(String type) {
    Component component = null;
    if ("Gpu".equalsIgnoreCase(type)) {
      component = new MsiGpu();
    } else if ("Monitor".equalsIgnoreCase(type)) {
      component = new MsiMonitor();
    }
    return component;
  }
}
