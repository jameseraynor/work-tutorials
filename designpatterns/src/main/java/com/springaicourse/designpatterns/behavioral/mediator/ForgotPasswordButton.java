package com.springaicourse.designpatterns.behavioral.mediator;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class ForgotPasswordButton extends JButton implements Component {

  private Mediator mediator;

  public ForgotPasswordButton() {
    super("Forgot Password?");
  }

  @Override
  public void fireActionPerformed(ActionEvent actionEvent) {
    mediator.forgotPass();
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public String getName() {
    return "ForgotPasswordButton";
  }
}
