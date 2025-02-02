package com.springaicourse.designpatterns.creational.builder.directors.manybuilders;

/**
 * Main application class demonstrating the Builder pattern with multiple builders Shows how
 * different builders can be used with the same Director to create different representations
 *
 *
 */
public class ManyBuildersApp {
  public static void main(String[] args) {
    // Create director that will orchestrate the building process
    Director director = new Director();

    // Create a CarBuilder instance for building a Bugatti
    CarBuilder builder = new CarBuilder();
    // Use director to build base Bugatti configuration
    director.buildBugatti(builder);
    // Add specific model name
    builder.model("Chiron");
    // Build and print the final car
    System.out.println(builder.build());

    // Create a CarSchemaBuilder for building a Lamborghini schema
    CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
    // Use director to build base Lamborghini configuration
    director.buildLambo(schemaBuilder);
    // Add specific engine size and number of doors
    schemaBuilder.engine("90").nbrOfDoors(3);
    // Build and print the final car schema
    System.out.println(schemaBuilder.build());
  }
}
