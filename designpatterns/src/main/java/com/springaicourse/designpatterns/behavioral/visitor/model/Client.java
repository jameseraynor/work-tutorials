package com.springaicourse.designpatterns.behavioral.visitor.model;

import com.springaicourse.designpatterns.behavioral.visitor.Visitor;
import lombok.Data;

/**
 * Abstract base class representing a client in the Visitor pattern implementation.
 * This class provides common client attributes and defines the accept operation
 * required for the Visitor pattern.
 */
@Data
public abstract class Client {

    /**
     * The name of the client
     * This field is marked as final to ensure immutability
     */
    private final String name;

    /**
     * The address of the client
     * This field is marked as final to ensure immutability
     */
    private final String address;

    /**
     * The contact number of the client
     * This field is marked as final to ensure immutability
     */
    private final String number;

    /**
     * Abstract method that must be implemented by concrete client classes
     * This is the key method for the Visitor pattern that allows operations
     * to be performed on the client object
     *
     * @param visitor The visitor object that will perform operations on this client
     */
    public abstract void accept(Visitor visitor);

}
