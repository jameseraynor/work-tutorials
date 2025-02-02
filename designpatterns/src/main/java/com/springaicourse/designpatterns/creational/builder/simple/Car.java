package com.springaicourse.designpatterns.creational.builder.simple;

/**
 * Represents a Car entity with various attributes and specifications. This class provides a
 * complete model of a car with properties like make, model, dimensions, and features.
 */
public class Car {
  // Unique identifier for the car
  private int id;
  // Manufacturer/brand of the car
  private String make;
  // Specific model name of the car
  private String model;
  // Exterior color of the car
  private String color;
  // Number of doors on the car
  private int numberOfDoors;
  // Type of display/entertainment screen in the car
  private String screenType;
  // Height of the car in meters/feet
  private double height;
  // Weight of the car in kilograms/pounds
  private double weight;
  // Manufacturing year of the car
  private int year;

  /**
   * Constructor to create a new Car instance with all required parameters
   *
   * <p>Default access modifier to prevent direct instantiation from outside the package. This
   * constructor is used internally by the CarBuilder to create Car instances with all the required
   * properties set
   *
   * @param id Unique identifier
   * @param make Manufacturer name
   * @param model Model name
   * @param color Exterior color
   * @param numberOfDoors Number of doors
   * @param screenType Type of screen
   * @param height Vehicle height
   * @param weight Vehicle weight
   * @param year Manufacturing year
   */
  Car(
      int id,
      String make,
      String model,
      String color,
      int numberOfDoors,
      String screenType,
      double height,
      double weight,
      int year) {
    this.id = id;
    this.make = make;
    this.model = model;
    this.color = color;
    this.numberOfDoors = numberOfDoors;
    this.screenType = screenType;
    this.height = height;
    this.weight = weight;
    this.year = year;
  }

  /**
   * Provides a string representation of the Car object including all its properties
   *
   * @return formatted string with car details
   */
  @Override
  public String toString() {
    return "Car{"
        + "id="
        + id
        + ", make='"
        + make
        + '\''
        + ", model='"
        + model
        + '\''
        + ", color='"
        + color
        + '\''
        + ", numberOfDoors="
        + numberOfDoors
        + ", screenType='"
        + screenType
        + '\''
        + ", height="
        + height
        + ", weight="
        + weight
        + ", year="
        + year
        + '}';
  }
}
