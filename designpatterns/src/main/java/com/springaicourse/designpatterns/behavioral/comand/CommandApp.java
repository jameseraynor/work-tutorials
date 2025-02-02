package com.springaicourse.designpatterns.behavioral.comand;

import com.springaicourse.designpatterns.behavioral.comand.commands.OpenCloseCurtainsCommand;
import com.springaicourse.designpatterns.behavioral.comand.commands.SwitchLightsCommand;
import com.springaicourse.designpatterns.behavioral.comand.components.FloorLamp;
import com.springaicourse.designpatterns.behavioral.comand.components.Room;

public class CommandApp {
  /**
   * Main method demonstrating the Command pattern implementation Controls both room curtains and
   * floor lamp using command objects.
   * This pattern turns a request or behavior into an object that can be stored, passed, and executed
   * Opens the uses:
   * passing commands as method arguments
   * - storing commands in data structures
   * - serializing and deserializing commands
   * - implementing undo/redo functionality
   * - implementing transactional behavior
   * - implementing command queues
   * - implementing logging and logging and undo/redo
   *
   * <p>This example works with two components: Room and FloorLamp
   * Each component has a command object that encapsulates the operation to be performed
   * The command object is associated with the component and can be executed to perform the operation
   *
   *
   * <p>Advantages:
   * - Single responsibility principle. You can declare new Command classes without changing the code
   *   of the "invoker" or the "receiver"
   * - Open/Closed Principle. Introduce new Command classes without changing the existing code
   * - Can implement undo/redo
   * - Can implement queueing or logging requests
   * - Can support undo/redo
   * - Can reduce coupling between invoker and receiver
   * - Can assemble a set of simple commands into a complex one
   * - Command pattern can help to separate business logic from GUI logic
   * <p>Disadvantages:
   * - The use of command objects might be overkill if no additional functionality is required
   * - Can result in many independent classes
   * - Difficult to implement if the number of commands is large
   * - Difficult to implement if the number of receivers is large
   * - Difficult to implement if the number of invokers is large
   * - Difficult to implement if the number of parameters to commands is large
   * - Difficult to implement if the number of operations is large
   *
   *
   * <p>when to use:
   * - when you need to decouple the object that invokes an operation from the provider of the operation
   * - when you need to queue or log requests
   * - when you need to support undo/redo operations
   *
   * TODO: ask Ify about the difference between command and strategy pattern
   *
   * @param args Command-line arguments
   */
  public static void main(String[] args) {
    // Create a room object
    Room room = new Room();
    // Set up command to control curtains and associate it with the room
    room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
    // Execute the curtains command
    room.executeCommand();
    // Print whether curtains are open
    System.out.println(room.curtainsOpen());

    // Visual separator in output
    System.out.println("==========================================");

    // Create a floor lamp object
    FloorLamp lamp = new FloorLamp();
    // Set up command to control light and associate it with the lamp
    lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
    // Execute the light switch command
    lamp.executeCommand();
    // Print whether light is on
    System.out.println(lamp.isLightOn());
  }
}
