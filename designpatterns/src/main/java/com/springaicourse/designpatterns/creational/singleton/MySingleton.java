package com.springaicourse.designpatterns.creational.singleton;

/**
 * should be used when a class in your program should have just a single instance available to all
 * clients;
 *
 * <p>disables all means of creating new instances of the class, except for the special static
 * creation method;
 *
 * <p>returns the existing instance if it has been already created at least once, and returns the
 * same instance if it has not been created before;
 *
 * <p>its code needs to be thread safe, because its static method can be accessed by multiple
 * threads simultaneously;
 */
public class MySingleton {
  // Static instance of the singleton, marked volatile to ensure thread safety
  private static volatile MySingleton mySingleton;

  // Data field to store the singleton's state
  private String data;

  // Private constructor prevents direct instantiation
  // @param data The data to initialize this singleton with
  private MySingleton(String data) {
    this.data = data;
  }

  // Returns the singleton instance, creating it if it doesn't exist
  // Uses double-checked locking pattern for thread safety
  // @param data The data to initialize with if instance needs to be created
  // @return The singleton instance
  public static MySingleton getInstance(String data) {
    // First check without locking, this first lock improves performance up to 40%
    // compared to only the single synchronized lock(just the second lock)
    MySingleton result = mySingleton;
    if (result == null) {
      // Lock only if instance might need to be created
      synchronized (MySingleton.class) {
        // Second check after acquiring lock
        result = mySingleton;
        if (result == null) {
          // Create new instance and store in both local and static variables
          mySingleton = result = new MySingleton(data);
        }
      }
    }
    return result;
  }
}
