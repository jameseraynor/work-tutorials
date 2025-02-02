package com.springaicourse.designpatterns.behavioral.state.states;

import com.springaicourse.designpatterns.behavioral.state.Phone;

/**
 * Abstract base class representing a state in the State pattern for a Phone device.
 * Each concrete state will implement specific behavior for phone operations.
 */
public abstract class State {

    /**
     * Reference to the Phone context that this state belongs to.
     * Protected access allows concrete state classes to interact with the phone.
     */
    protected Phone phone;

    /**
     * Constructor that sets the phone context for this state.
     * @param phone The Phone object that this state will operate on
     */
    public State(Phone phone) {
        this.phone = phone;
    }

    /**
     * Defines behavior when home button is pressed in this state.
     * @return String describing the action taken
     */
    public abstract String onHome();

    /**
     * Defines behavior when power button is pressed in this state.
     * @return String describing the action taken
     */
    public abstract String onOffOn();

}