package com.springaicourse.designpatterns.behavioral.state;

/**
 * Main application class demonstrating the State pattern with a Phone example The State pattern
 * allows an object to alter its behavior when its internal state changes
 *
 * <p>the state pattern allows an object to alter its behavior when its internal state changes,
 * extracting each logic to a separate class and let the context delegate the behavior to the
 * corresponding state.
 * applies the single responsibility principle and the open/closed principle
 * each state is represented by a separate class, and the context class is responsible for
 * delegating the behavior to the current state
 *
 * <p>In this example, the Phone class acts as the Context, and its state (e.g., ReadyState,
 * OffState) determines the behavior of the phone. The State pattern allows the phone's behavior to
 * change based on its current state, promoting extensibility and maintainability.
 *
 * when to use:
 * - when an object's behavior depends on its state, and its behavior needs to change based on
 *   that state
 * - when there are multiple conditions that affect the behavior of an object
 *
 */
public class StateApp {
  /**
   * Entry point of the application Creates a new Phone instance and simulates user interactions
   *
   * @param args Command line arguments (not used)
   */
  public static void main(String[] args) {
    // Create new phone instance in default state
    Phone phone = new Phone();
    // Simulate series of button clicks
    simulatePhoneClicks(phone);
  }

  /**
   * Simulates a sequence of power and home button clicks on the phone Demonstrates how the phone's
   * behavior changes based on its state
   *
   * @param phone The Phone instance to simulate clicks on
   */
  private static void simulatePhoneClicks(Phone phone) {
    // First power click - should turn phone on
    System.out.println(phone.clickPower());
    // Second power click - should lock phone if it was on
    System.out.println(phone.clickPower());
    // Series of home button clicks - behavior depends on current state
    System.out.println(phone.clickHome());
    System.out.println(phone.clickHome());
    System.out.println(phone.clickHome());
    // Another series of power clicks - toggles between states
    System.out.println(phone.clickPower());
    System.out.println(phone.clickPower());
    // Final home click to demonstrate state change
    System.out.println(phone.clickHome());
  }
}
