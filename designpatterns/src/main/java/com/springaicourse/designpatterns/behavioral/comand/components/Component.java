package com.springaicourse.designpatterns.behavioral.comand.components;

import com.springaicourse.designpatterns.behavioral.comand.commands.Command;

/**
 * Component class that acts as the invoker in the Command pattern.
 * This class holds and executes commands without knowing the concrete implementation.
 */
public class Component {

  /**
   * Reference to the command object that will be executed
   */
  private Command command;

  /**
   * Sets the command that this component will execute
   * @param command The Command object to be set
   */
  public void setCommand(Command command) {
    this.command = command;
  }

  /**
   * Executes the currently set command
   * This method delegates the execution to the command object's execute() method
   */
  public void executeCommand() {
    command.execute();
  }
}