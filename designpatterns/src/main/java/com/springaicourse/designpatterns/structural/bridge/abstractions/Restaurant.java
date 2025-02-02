package com.springaicourse.designpatterns.structural.bridge.abstractions;

import com.springaicourse.designpatterns.structural.bridge.implementations.Pizza;

/**
 * Abstract Restaurant class that serves as a base for different restaurant types.
 * This class implements the Bridge pattern by delegating pizza-making operations
 * to a Pizza implementation object.
 */
public abstract class Restaurant {
    // Reference to the Pizza implementation
    protected Pizza pizza;

    /**
     * Constructor that takes a Pizza implementation
     * @param pizza The Pizza implementation to be used
     */
    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Abstract method to add sauce to the pizza
     * To be implemented by concrete restaurant classes
     */
    abstract void addSauce();

    /**
     * Abstract method to add toppings to the pizza
     * To be implemented by concrete restaurant classes
     */
    abstract void addToppings();

    /**
     * Abstract method to make the pizza crust
     * To be implemented by concrete restaurant classes
     */
    abstract void makeCrust();

    /**
     * Template method that defines the algorithm for pizza preparation and delivery
     * Calls the abstract methods in specific order and delegates final steps to Pizza implementation
     */
    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }
}