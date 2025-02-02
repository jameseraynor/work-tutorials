package com.springaicourse.designpatterns.creational.builder.simple;

/**
 * Builder class for creating Car objects using a fluent interface pattern.
 * This class allows for step-by-step construction of a Car object with multiple optional parameters.
 */
public class CarBuilder {
  // Basic car properties
  private int id;
  private String make;
  private String model;
  private String color;
  private int numberOfDoors;

  // Additional features
  private String screenType;

  // Physical specifications
  private double height;
  private double weight;
  private int year;

  /**
   * Sets the unique identifier for the car
   * @param id The car's ID number
   * @return The builder instance for method chaining
   */
  public CarBuilder setId(int id) {
    this.id = id;
    return this;
  }

  /**
   * Sets the manufacturer of the car
   * @param make The car manufacturer (e.g. Toyota, Ford)
   * @return The builder instance for method chaining
   */
  public CarBuilder setMake(String make) {
    this.make = make;
    return this;
  }

  /**
   * Sets the model name of the car
   * @param model The specific model name
   * @return The builder instance for method chaining
   */
  public CarBuilder setModel(String model) {
    this.model = model;
    return this;
  }

  /**
   * Sets the color of the car
   * @param color The car's color
   * @return The builder instance for method chaining
   */
  public CarBuilder setColor(String color) {
    this.color = color;
    return this;
  }

  /**
   * Sets the number of doors on the car
   * @param numberOfDoors The number of doors (typically 2 or 4)
   * @return The builder instance for method chaining
   */
  public CarBuilder setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
    return this;
  }

  /**
   * Sets the type of screen/display in the car
   * @param screenType The screen/display type (e.g. LCD, LED)
   * @return The builder instance for method chaining
   */
  public CarBuilder setScreenType(String screenType) {
    this.screenType = screenType;
    return this;
  }

  /**
   * Sets the height of the car
   * @param height The car's height in meters
   * @return The builder instance for method chaining
   */
  public CarBuilder setHeight(double height) {
    this.height = height;
    return this;
  }

  /**
   * Sets the weight of the car
   * @param weight The car's weight in kilograms
   * @return The builder instance for method chaining
   */
  public CarBuilder setWeight(double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Sets the manufacturing year of the car
   * @param year The year the car was manufactured
   * @return The builder instance for method chaining
   */
  public CarBuilder setYear(int year) {
    this.year = year;
    return this;
  }

  /**
   * Creates and returns a new Car instance with all the properties set in the builder
   * @return A new Car object with the specified properties
   */
  public Car build() {
    return new Car(id, make, model, color, numberOfDoors, screenType, height, weight, year);
  }
}