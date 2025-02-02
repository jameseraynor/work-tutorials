package com.springaicourse.designpatterns.creational.builder.directors.simpledirector;

import com.springaicourse.designpatterns.creational.builder.simple.CarBuilder;

/**
 * Main application class demonstrating the Director pattern with car building Shows how the
 * Director can be used to construct different car configurations without exposing the builder
 * implementation details
 *
 * <p>try creating a director if the same creation is used to create multiple objects
 */
public class DirectorsApp {

  public static void main(String[] args) {
    // Create a Director instance to coordinate the building process
    Director director = new Director();

    // Create a CarBuilder instance that will construct the actual car objects
    CarBuilder builder = new CarBuilder();

    // Use director to build a Bugatti car with predefined specifications
    director.buildBugatti(builder);
    // Print the completed Bugatti car object
    System.out.println(builder.build());

    // Use same builder instance to create a Lamborghini with different specs
    director.buildLamborghini(builder);
    // Print the completed Lamborghini car object
    System.out.println(builder.build());
  }
}
