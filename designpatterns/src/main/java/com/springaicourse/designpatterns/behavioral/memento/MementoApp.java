package com.springaicourse.designpatterns.behavioral.memento;

/**
 * Main application class demonstrating the Memento design pattern The Memento pattern allows
 * capturing and restoring an object's internal state
 *
 * <p>the pattern is used to save and restore the state of an object without exposing its internal
 * details, to do this it makes full copies of an object's state, allowing the object to be restored
 * to its previous state at any time.
 * makes the original object's data safe and protects it from being modified by external objects
 * without breaking encapsulation.
 * delegates the creation of Mementos to the actual object being saved, and provides a way to
 * restore the object to its previous state.
 */
public class MementoApp {
  public static void main(String[] args) {

    // Create a new Editor instance that will store text and its history
    Editor editor = new Editor();

    // Write initial text and print it
    editor.write("Like and");
    editor.printText();

    // Add more text and print updated version
    editor.write("Like and Subscribe");
    editor.printText();

    // Add final text and print complete version
    editor.write("Like and Subscribe to Geekific!");
    editor.printText();

    // Demonstrate undo functionality by reverting to previous states
    editor.undo(); // Removes "to Geekific!"
    editor.printText();

    editor.undo(); // Removes "Subscribe"
    editor.printText();

    editor.undo(); // Removes everything
    editor.printText();
  }
}
