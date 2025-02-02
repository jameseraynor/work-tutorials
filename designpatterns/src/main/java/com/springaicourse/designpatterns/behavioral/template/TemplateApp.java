package com.springaicourse.designpatterns.behavioral.template;

/**
 * Main application class demonstrating the Template Method design pattern The Template pattern
 * defines a skeleton algorithm in a base class and lets subclasses override specific steps
 *
 * <p>the template method turns an algorithm into a series of individual methods, and that keeps the
 * structure of the base algorithm intact eliminates code duplication by pulling up the steps into
 * the base class allows subclasses to override specific steps without modifying the overall
 * structure of the algorithm promotes code reuse by allowing subclasses to reuse the common parts
 * of the algorithm
 *
 * <p>use when:
 * - you have a common algorithm that needs to be executed in a specific order
 * - you want to allow subclasses to override specific steps of the algorithm
 * - you want to promote code reuse by allowing subclasses to reuse the common parts of the algorithm
 * - you want to keep the structure of the base algorithm intact
 */
public class TemplateApp {

  /**
   * Main method that creates game loader instances and executes their loading sequences
   *
   * @param args Command line arguments (not used)
   */
  public static void main(String[] args) {

    // Create StarCraft game loader and execute its loading sequence
    BaseGameLoader scLoader = new StarCraftLoader();
    scLoader.load();

    // Visual separator for console output
    System.out.println("==========================================");

    // Create Diablo game loader and execute its loading sequence
    BaseGameLoader diabloLoader = new DiabloLoader();
    diabloLoader.load();
  }
}
