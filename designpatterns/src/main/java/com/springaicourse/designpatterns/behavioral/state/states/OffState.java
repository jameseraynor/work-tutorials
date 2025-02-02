package com.springaicourse.designpatterns.behavioral.state.states;

import com.springaicourse.designpatterns.behavioral.state.Phone;

/**
 * Represents the Off state of the phone in the State pattern implementation.
 * This state handles behavior when the phone is completely powered off.
 */
public class OffState extends State {

  /**
   * Constructor that initializes the OffState with a reference to the phone.
   * @param phone The Phone object that this state belongs to
   */
  public OffState(Phone phone) {
    super(phone);
  }

  /**
   * Handles pressing the home button when phone is off.
   * Changes state to LockedState and turns on the phone.
   * @return String message indicating phone is turning on
   */
  @Override
  public String onHome() {
    phone.setState(new LockedState(phone));
    return phone.turnOn();
  }

  /**
   * Handles pressing the power button when phone is off.
   * Changes state to LockedState and turns on the phone.
   * @return String message indicating phone is turning on
   */
  @Override
  public String onOffOn() {
    phone.setState(new LockedState(phone));
    return phone.turnOn();
  }
}