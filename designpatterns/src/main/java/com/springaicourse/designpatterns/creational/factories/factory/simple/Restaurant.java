package com.springaicourse.designpatterns.creational.factories.factory.simple;

import com.springaicourse.designpatterns.creational.factories.factory.model.Burger;

/**
 * Restaurant class represents a restaurant that can create and prepare burgers
 * using a Simple Factory pattern
 */
public class Restaurant {
    /**
     * Orders and prepares a burger based on the customer's request
     * @param request The type of burger requested by the customer
     * @return Burger The prepared burger object
     */
    public Burger orderBurger(String request) {
        // Create an instance of the burger factory
        SimpleBurgerFactory factory = new SimpleBurgerFactory();

        // Use the factory to create the specific type of burger
        Burger burger = factory.createBurger(request);

        // Prepare the burger (e.g. cook it, add toppings etc)
        burger.prepare();

        // Return the prepared burger to the customer
        return burger;
    }
}