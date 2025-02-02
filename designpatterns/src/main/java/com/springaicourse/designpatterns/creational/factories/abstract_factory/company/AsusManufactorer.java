package com.springaicourse.designpatterns.creational.factories.abstract_factory.company;

import com.springaicourse.designpatterns.creational.factories.abstract_factory.component.AsusGpu;
import com.springaicourse.designpatterns.creational.factories.abstract_factory.component.AsusMonitor;
import com.springaicourse.designpatterns.creational.factories.abstract_factory.component.Component;

public class AsusManufactorer extends Company {
  @Override
  public Component createComponent(String type) {
    Component component = null;
    if ("Gpu".equalsIgnoreCase(type)) {
      component = new AsusGpu();
    } else if ("Monitor".equalsIgnoreCase(type)) {
      component = new AsusMonitor();
    }

    return component;
  }
}
