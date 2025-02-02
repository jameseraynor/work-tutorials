package com.springaicourse.designpatterns.structural.facade;

/**
 * Main application class demonstrating the Facade pattern for cryptocurrency purchases The Facade
 * pattern simplifies complex subsystem interactions into a single interface
 *
 * <p>Facade pattern is used to provide a simplified interface to a complex subsystem
 *
 * <p>It encapsulates the complexity of the subsystem and provides a single entry point for clients
 * to interact with the subsystem
 *
 * <p>improves readability and usability of the codebase by hiding the interaction of its components
 *
 * <p>applies the single responsibility principle to the subsystems
 *
 * <p>defines entry points to each level of a subsystem, thus decoupling multiple subsystems and
 * forcing them to communicate only through facades
 *
 * use when:
 * - want to provide a simple interface to a complex subsystem
 * - want to decouple the client code from the subsystem code
 * - want to layer subsystems to improve maintainability and flexibility
 */
public class FacadeApp {
  /**
   * Main entry point of the application
   *
   * @param args Command line arguments (not used)
   */
  public static void main(String[] args) {

    // Create instance of facade that encapsulates cryptocurrency purchase workflow
    BuyCryptoFacade buyCrypto = new BuyCryptoFacade();

    // Execute purchase of 1000 units of Bitcoin (BTC) using the simplified facade interface
    // The facade handles all the complex operations like wallet creation, funds transfer, etc.
    buyCrypto.buyCryptocurrency(1000, "BTC");
  }
}
