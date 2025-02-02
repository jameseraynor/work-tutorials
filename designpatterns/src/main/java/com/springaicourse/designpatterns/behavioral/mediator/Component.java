package com.springaicourse.designpatterns.behavioral.mediator;

import java.awt.event.ActionEvent;

public interface Component {
  void fireActionPerformed(ActionEvent actionEvent);

  void setMediator(Mediator mediator);

  String getName();
}
