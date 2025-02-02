package com.springaicourse.designpatterns.behavioral.state;

import com.springaicourse.designpatterns.behavioral.state.states.OffState;
import com.springaicourse.designpatterns.behavioral.state.states.State;

/**
 * Represents a phone device that implements the State pattern to manage different states
 * (e.g. on, off, locked) and their associated behaviors
 */
public class Phone {
    // Current state of the phone
    private State state;

    /**
     * Constructor initializes phone in the Off state
     */
    public Phone() {
        state = new OffState(this);
    }

    /**
     * Changes the current state of the phone
     * @param state New state to transition to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Locks the phone and turns off screen
     * @return Status message indicating phone is locked
     */
    public String lock() {
        return "Locking phone and turning off the screen";
    }

    /**
     * Returns to home screen
     * @return Status message indicating return to home
     */
    public String home() {
        return "Going to home-screen";
    }

    /**
     * Unlocks the phone to home screen
     * @return Status message indicating phone is unlocked
     */
    public String unlock() {
        return "Unlocking the phone to home";
    }

    /**
     * Turns on screen while keeping phone locked
     * @return Status message indicating screen is on
     */
    public String turnOn() {
        return "Turning screen on, device still locked";
    }

    /**
     * Handles home button click based on current state
     * @return Response based on current state's home button behavior
     */
    public String clickHome() {
        return state.onHome();
    }

    /**
     * Handles power button click based on current state
     * @return Response based on current state's power button behavior
     */
    public String clickPower() {
        return state.onOffOn();
    }

}
