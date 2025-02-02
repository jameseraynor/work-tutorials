package com.springaicourse.designpatterns.creational.factories.abstract_factory.company;

import com.springaicourse.designpatterns.creational.factories.abstract_factory.component.Component;

public abstract class Company {
  public abstract Component createComponent(String type);
}
