package com.springaicourse.designpatterns.creational.factories.factory.full_factory;

import com.springaicourse.designpatterns.creational.factories.factory.model.Burger;

/**
 * Abstract Restaurant class implementing the Factory Method pattern
 * This class serves as the base for different restaurant types
 */
public abstract class Restaurant {
    /**
     * Orders a burger by creating and preparing it
     * This is the template method that uses the factory method
     * @return prepared Burger object
     */
    public Burger orderBurger() {
        // Create the burger using factory method
        Burger burger = createBurger();
        // Prepare the burger (e.g. cook, add toppings etc)
        burger.prepare();
        return burger;
    }

    /**
     * Factory method that must be implemented by concrete restaurants
     * Each restaurant type will create its specific type of burger
     * @return Burger object of the specific type
     */
    public abstract Burger createBurger();
}