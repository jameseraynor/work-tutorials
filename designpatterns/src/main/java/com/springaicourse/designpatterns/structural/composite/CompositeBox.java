package com.springaicourse.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CompositeBox represents a container that can hold multiple Box objects. This class implements the
 * Composite pattern, allowing it to treat individual objects and compositions of objects uniformly.
 */
public class CompositeBox implements Box {

  /** List to store child Box objects that make up this composite */
  private final List<Box> children = new ArrayList<>();

  /**
   * Constructor that accepts variable number of Box objects and adds them as children
   *
   * <p>* The '...' syntax is known as the "varargs" syntax in Java, the
   * parameter list allows passing an arbitrary number of Box objects as arguments, which are then
   * added to the children list This is useful when creating a composite box with multiple child
   * boxes without explicitly creating a list and adding each box individually This approach
   * simplifies the code and makes it more readable and maintainable when dealing with multiple
   * child boxes
   *
   * @param boxes Variable number of Box objects to be added to this composite
   */
  public CompositeBox(Box... boxes) {
    children.addAll(Arrays.asList(boxes));
  }

  /**
   * Calculates the total price of this composite by summing the prices of all children
   *
   * @return The sum of prices of all child Box objects
   */
  @Override
  public double calculatePrice() {
    return children.stream().mapToDouble(Box::calculatePrice).sum();
  }
}
