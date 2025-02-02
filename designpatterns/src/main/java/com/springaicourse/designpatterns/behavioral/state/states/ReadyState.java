package com.springaicourse.designpatterns.behavioral.state.states;

import com.springaicourse.designpatterns.behavioral.state.Phone;

/**
 * Represents the Ready state of the phone where the device is unlocked and ready for use
 * This state allows the user to access home screen and power off functionality
 */
public class ReadyState extends State {

  /**
   * Constructor that initializes the Ready state with a phone instance
   * @param phone The phone object that this state belongs to
   */
  public ReadyState(Phone phone) {
    super(phone);
  }

  /**
   * Handles the home button press event when phone is in Ready state
   * @return String representing the result of going to home screen
   */
  @Override
  public String onHome() {
    return phone.home();
  }

  /**
   * Handles the power button press event when phone is in Ready state
   * Changes the phone state to Off state and locks the phone
   * @return String representing the result of locking the phone
   */
  @Override
  public String onOffOn() {
    phone.setState(new OffState(phone));
    return phone.lock();
  }
}