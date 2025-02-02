package com.springaicourse.designpatterns.behavioral.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * LoginButton class represents a login button in a GUI application.
 * It extends JButton for basic button functionality and implements Component interface
 * to participate in the Mediator pattern.
 * This class is responsible for handling the login button's click event and
 * notifying the mediator about the login action.
 */
public class LoginButton extends JButton implements Component {

    /**
     * Reference to the mediator object that coordinates interactions
     */
    private Mediator mediator;

    /**
     * Constructor that initializes the button with "Log In" text
     */
    public LoginButton() {
        super("Log In");
    }

    /**
     * Handles button click events by delegating to the mediator
     * @param actionEvent The action event triggered by button click
     */
    @Override
    public void fireActionPerformed(ActionEvent actionEvent) {
        mediator.login();
    }

    /**
     * Sets the mediator for this component
     * @param mediator The mediator object to coordinate with
     */
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Returns the name identifier for this component
     * @return String containing "LoginButton"
     */
    @Override
    public String getName() {
        return "LoginButton";
    }
}
