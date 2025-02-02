package com.springaicourse.designpatterns.behavioral.comand.components;

/**
 * Represents a floor lamp component in the system.
 * This class extends the base Component class and encapsulates a Light object.
 */
public class FloorLamp extends Component{
  /**
   * The light component of the floor lamp.
   * This is marked as final to ensure immutability after initialization.
   */
  private final Light light;

  /**
   * Constructor for FloorLamp.
   * Initializes a new Light object when the FloorLamp is created.
   */
  public FloorLamp() {
    this.light = new Light();
  }

  /**
   * Gets the Light object associated with this FloorLamp.
   * @return The Light object contained in this FloorLamp
   */
  public Light getLight() {
    return light;
  }

  /**
   * Checks if the lamp's light is currently switched on.
   * @return true if the light is on, false if it's off
   */
  public boolean isLightOn() {
    return light.isSwitchedOn();
  }
}