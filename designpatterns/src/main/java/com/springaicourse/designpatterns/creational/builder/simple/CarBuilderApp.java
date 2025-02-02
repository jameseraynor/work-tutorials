package com.springaicourse.designpatterns.creational.builder.simple;

/**
 * Main application class demonstrating the Builder pattern for car creation This class creates two
 * instances of the Car class using the CarBuilder and prints their string representations
 *
 * <p>Builder pattern is used to construct complex objects step by step It allows for the creation
 * of immutable objects with a flexible configuration
 */
public class CarBuilderApp {

  public static void main(String[] args) {
    // Create first car with full specifications
    // Using builder pattern to construct a Car object step by step
    Car car =
        new CarBuilder()
            .setId(1) // Set unique identifier
            .setMake("Ford") // Set manufacturer
            .setModel("Mustang") // Set car model
            .setColor("Red") // Set exterior color
            .setNumberOfDoors(2) // Set door configuration
            .setScreenType("Tinted") // Set window tint type
            .setHeight(1.8) // Set height in meters
            .setWeight(2000) // Set weight in kg
            .setYear(2021) // Set manufacturing year
            .build(); // Build the final car object

    // Create second car with minimal specifications
    // Demonstrates builder pattern flexibility - not all parameters are required
    Car car2 =
        new CarBuilder()
            .setId(2) // Set unique identifier
            .setMake("Ford") // Set manufacturer
            .setModel("Lamborghini") // Set car model
            .setColor("yellow") // Set exterior color
            .build(); // Build the car with default values for unset parameters

    // Print string representations of both cars
    System.out.println(car);
    System.out.println(car2);
  }
}
