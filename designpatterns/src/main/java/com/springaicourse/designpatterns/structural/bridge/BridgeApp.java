package com.springaicourse.designpatterns.structural.bridge;

import com.springaicourse.designpatterns.structural.bridge.abstractions.AmericanRestaurant;
import com.springaicourse.designpatterns.structural.bridge.abstractions.ItalianRestaurant;
import com.springaicourse.designpatterns.structural.bridge.abstractions.Restaurant;
import com.springaicourse.designpatterns.structural.bridge.implementations.PepperoniPizza;
import com.springaicourse.designpatterns.structural.bridge.implementations.VeggiePizza;

/**
 * Main application class demonstrating the Bridge design pattern
 * The Bridge pattern decouples an abstraction (Restaurant) from its implementation (Pizza),
 * allowing them to vary independently
 *
 * It is mainly used to handle complex extensibility issues
 * Divides and organizes the monolithic code into two hierarchies, one for abstractions and another for implementations
 * client code won't be exposed to implementation details
 * applies a single responsibility principle to both the abstractions and implementations and the open-close principle
 * independently introduce new abstractions and implementations; making it easier to switch between them at runtime
 *
 * use when:
 * - You want to avoid a permanent dependence on a concrete class
 * - Both the abstractions and their implementations should be extensible by subclassing
 * - Changes in the implementation of an abstraction should have no impact on clients
 * - You want to share an implementation among multiple objects and this may include
 *   functionality that is not defined in their common interface
 */
public class BridgeApp {
    public static void main(String[] args) {

        // Create an American restaurant that makes pepperoni pizza
        // AmericanRestaurant is a concrete abstraction, PepperoniPizza is a concrete implementation
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        // Visual separator for console output
        System.out.println("==========================================");

        // Create an Italian restaurant that makes veggie pizza
        // ItalianRestaurant is a concrete abstraction, VeggiePizza is a concrete implementation
        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }
}
