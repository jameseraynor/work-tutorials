package com.springaicourse.designpatterns.behavioral.comand.commands;

import com.springaicourse.designpatterns.behavioral.comand.components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {

  @Override
  public void execute() {
    curtains.openClose();
  }
}
