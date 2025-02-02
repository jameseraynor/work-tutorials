package com.springaicourse.designpatterns.behavioral.state.states;

import com.springaicourse.designpatterns.behavioral.state.Phone;

/**
 * Represents the locked state of a phone device
 * Extends the base State class to implement specific locked state behavior
 */
public class LockedState extends State {

  /**
   * Constructor that initializes the locked state with a phone reference
   * @param phone The phone device that this state belongs to
   */
  public LockedState(Phone phone) {
    super(phone);
  }

  /**
   * Handles the home button press event when phone is locked
   * Transitions the phone to ready state and unlocks it
   * @return String message indicating phone is unlocked
   */
  @Override
  public String onHome() {
    phone.setState(new ReadyState(phone));
    return phone.unlock();
  }

  /**
   * Handles the power button press event when phone is locked
   * Transitions the phone to off state and locks it
   * @return String message indicating phone is locked
   */
  @Override
  public String onOffOn() {
    phone.setState(new OffState(phone));
    return phone.lock();
  }
}