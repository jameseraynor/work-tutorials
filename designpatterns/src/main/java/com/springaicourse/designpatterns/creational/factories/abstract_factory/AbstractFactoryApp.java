package com.springaicourse.designpatterns.creational.factories.abstract_factory;

import com.springaicourse.designpatterns.creational.factories.abstract_factory.company.AsusManufactorer;
import com.springaicourse.designpatterns.creational.factories.abstract_factory.company.Company;
import com.springaicourse.designpatterns.creational.factories.abstract_factory.company.MsiManufactorer;

/**
 * Main application class demonstrating the Abstract Factory pattern
 * This pattern provides an interface for creating families of related objects
 * without specifying their concrete classes
 */
public class AbstractFactoryApp {

  /**
   * Main method to demonstrate the Abstract Factory pattern in action
   * Creates instances of different computer component manufacturers (MSI and ASUS)
   * and uses them to create and assemble GPUs and Monitors
   *
   * <p>This pattern is useful when you need to create objects that belong to multiple families
   * and want to ensure that the created objects are compatible with each other.
   * Centralizes the creation in one place.
   *
   * <p>Follows the open-close and single responsibility principles
   *  - open for extension (new manufacturers can be added without modifying existing code)
   *  - closed for modification (new manufacturers do not break existing code)
   *  - single responsibility (each manufacturer is responsible for creating its own components)
   *
   * <p>use Abstract Factory pattern when
   *  - need to create families of related objects
   *  - want to provide a high level of abstraction when creating objects
   *  - after using the Factory method pattern, you may need to use the Abstract Factory pattern
   */
  public static void main(String[] args) {
    // Create an MSI manufacturer instance
    Company msiCompany = new MsiManufactorer();
    // Create and assemble an MSI GPU
    msiCompany.createComponent("Gpu").assemble();
    // Create and assemble an MSI Monitor
    msiCompany.createComponent("Monitor").assemble();

    // Create an ASUS manufacturer instance
    Company asusCompany = new AsusManufactorer();
    // Create and assemble an ASUS GPU
    asusCompany.createComponent("Gpu").assemble();
    // Create and assemble an ASUS Monitor
    asusCompany.createComponent("Monitor").assemble();
  }
}