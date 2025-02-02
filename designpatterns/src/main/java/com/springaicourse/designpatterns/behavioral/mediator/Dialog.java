package com.springaicourse.designpatterns.behavioral.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Mediator pattern implementation This class acts as a mediator between different components
 * (buttons, text fields) and handles the logic for login and forgot password actions
 *
 * <p>it mediates between components by implementing the Mediator interface and handling the logic
 * for login and forgot password actions based on user input and triggering appropriate actions on
 * other components
 */
public class Dialog implements Mediator {
  // Text field for entering username
  private final JTextField userTextBox = new JTextField();
  // Text field for entering password
  private final JTextField passTextBox = new JTextField();
  // Button to trigger login action
  private final LoginButton loginButton = new LoginButton();
  // Button to trigger forgot password flow
  private final ForgotPasswordButton passwordButton = new ForgotPasswordButton();

  /**
   * Constructor initializes dialog and sets up mediator pattern by connecting buttons to this
   * mediator
   */
  public Dialog() {
    loginButton.setMediator(this);
    passwordButton.setMediator(this);
  }

  /**
   * Handles login action when login button is clicked Gets username and password from text fields
   * Validates credentials and logs in user
   */
  @Override
  public void login() {
    System.out.println("Logging in...");
    String username = userTextBox.getText();
    String password = passTextBox.getText();
    // validate username and password
    // logs in the user or pops error message
  }

  /**
   * Handles forgot password action Gets username and triggers password reset flow Generates new
   * password and emails it to user
   */
  @Override
  public void forgotPass() {
    System.out.println("Generating new Password...");
    String username = userTextBox.getText();
    // generate new pass for the user
    // send mail to this username with new pass
  }

  /**
   * Sets text in username field
   *
   * @param username The username to set
   */
  public void enterUsername(String username) {
    userTextBox.setText(username);
  }

  /**
   * Sets text in password field
   *
   * @param password The password to set
   */
  public void enterPassword(String password) {
    passTextBox.setText(password);
  }

  /** Simulates click of login button for testing Fires action event on login button
   *  this will trigger mediator to coordinate between components
   *  and handle login action
   *  @see LoginButton
   *  @see ForgotPasswordButton
   *  @see Mediator
   *  @see Dialog
   *  @see AppMediator
   *
   */
  public void simulateLoginClicked() {
    loginButton.fireActionPerformed(new ActionEvent(this, 0, "login"));
  }

  /**
   * Simulates click of forgot password button for testing Fires action event on forgot password
   * button
   */
  public void simulateForgotPassClicked() {
    passwordButton.fireActionPerformed(new ActionEvent(this, 0, "forgot pass"));
  }
}
