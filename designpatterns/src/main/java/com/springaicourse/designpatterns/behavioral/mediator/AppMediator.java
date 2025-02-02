package com.springaicourse.designpatterns.behavioral.mediator;

/**
 * This class demonstrates the Mediator pattern, which is a behavioral design pattern that allows
 * loose coupling between components by introducing a mediator object that coordinates the
 * interactions between other components.
 *
 * <p>extracts all the relationships between your classes into a separate class this way classes
 * will be decoupled from one another and communicate indirectly via the mediator This allows the
 * reuse of any component in a different app, and makes it easy to define new ways for these
 * components to communicate with each other without changing their code
 *
 * <p>use when:
 * <ul>
 *   <li>you have a set of objects that need to interact with each other, but you don't want them
 *       to reference each other explicitly
 *   <li>you want to reduce the coupling between the objects
 *   <li>you want to reuse an object in a different context
 * </ul>
 *
 * @see Dialog
 */
public class AppMediator {

  /**
   * Main method to demonstrate the Mediator pattern with a login dialog The Dialog class acts as
   * the mediator between different UI components
   */
  public static void main(String[] args) {
    // Create new Dialog instance which will mediate between components
    Dialog dialog = new Dialog();

    // Simulate user entering their username
    dialog.enterUsername("Geekific");

    // Simulate user entering their password
    dialog.enterPassword("LikeAndSubscribe");

    // Simulate user clicking the login button
    // This will trigger the mediator to coordinate between components
    dialog.simulateLoginClicked();

    // Simulate user clicking "Forgot Password" link
    // Mediator will handle showing appropriate screens/components
    dialog.simulateForgotPassClicked();
  }
}
