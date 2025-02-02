package com.springaicourse.designpatterns.behavioral.comand.commands;

import com.springaicourse.designpatterns.behavioral.comand.components.Light;

public record SwitchLightsCommand(Light light) implements Command {

  @Override
  public void execute() {
    light.switchLights();
  }
}
