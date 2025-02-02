package com.springaicourse.designpatterns.behavioral.template;

/**
 * Abstract base class implementing the Template Method pattern for game loading. Defines the
 * skeleton of the game loading algorithm while letting subclasses override specific steps.
 *
 * <p>it's an abstract class, so we can't create an instance of it, but we can create instances of
 * its subclasses.
 * the subclasses will implement the abstract methods, and the template method will be executed
 * according to the subclass implementation. this abstract methods are the steps that are common to all
 * subclasses, and we can add default concrete implementations for some of them to avoid code duplication/
 *
 */
public abstract class BaseGameLoader {

  /**
   * Template method that defines the algorithm for loading a game. The sequence of steps is fixed
   * but individual steps can be overridden by subclasses.
   */
  public void load() {
    byte[] data = loadLocalData();
    createObjects(data);
    downloadAdditionalFiles();
    cleanTempFiles();
    initializeProfiles();
  }

  /**
   * Loads game data from local storage.
   *
   * @return byte array containing the loaded game data
   */
  abstract byte[] loadLocalData();

  /**
   * Creates game objects from the loaded data.
   *
   * @param data byte array containing game data to create objects from
   */
  abstract void createObjects(byte[] data);

  /** Downloads any additional files needed by the game. */
  abstract void downloadAdditionalFiles();

  /** Initializes user profiles and game progress data. */
  abstract void initializeProfiles();

  /**
   * Cleans up temporary files created during the loading process. This is a common implementation
   * shared by all game loaders.
   */
  protected void cleanTempFiles() {
    System.out.println("Cleaning temporary files...");
    // Some Common Code...
  }
}
