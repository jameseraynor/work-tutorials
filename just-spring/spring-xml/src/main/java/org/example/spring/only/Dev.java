package org.example.spring.only;

/**
 * Represents a Developer class that models a developer and their computer.
 * This class demonstrates dependency injection and basic getter/setter patterns.
 */
public class Dev {

    /** The computer associated with this developer
     * injected according to the applicationContext.xml*/
    private Computer computer;

    /**
     * Default constructor that creates a new Dev instance.
     * Prints a message when developer is created.
     */
    public Dev() {
        System.out.println("Dev is created");
    }

    /**
     * Constructor that creates a Dev instance with an associated Computer.
     * @param Computer The computer to be assigned to this developer
     */
    public Dev(Computer Computer) {
        System.out.println("Dev is created with Computer");
        this.computer = Computer;
    }

    /**
     * Simulates the developer working by printing a message and using the computer.
     * Calls the compile method on the associated computer.
     */
    public void working(){
        System.out.println("Dev is working");
        computer.compile();
    }

    /**
     * Gets the computer associated with this developer.
     * @return The Computer instance associated with this developer
     */
    public Computer getComputer() {
        return computer;
    }

    /**
     * Sets the computer for this developer.
     * @param Computer The Computer instance to be associated with this developer
     */
    public void setComputer(Computer Computer) {
        this.computer = Computer;
    }
}