package com.springaicourse.designpatterns.creational.factories.factory.full_factory;

import com.springaicourse.designpatterns.creational.factories.factory.model.Burger;

/**
 * Main application class demonstrating the Factory Pattern with burger restaurants
 *
 * use Factory pattern when
 *  - object creation logic becomes too convoluted
 *  - the exact type of object to be created may depend on runtime conditions
 *  - want to keep object creation logic in one place to improve maintainability
 */
public class BurgerApp {
    public static void main(String[] args) {
        // Create a beef burger restaurant instance
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        // Order a burger - this will use the beef restaurant's specific implementation
        Burger beefBurger = beefRestaurant.orderBurger();
        // Print the beef burger details
        System.out.println(beefBurger);

        // Create a veggie burger restaurant instance
        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        // Order a burger - this will use the veggie restaurant's specific implementation
        Burger veggieBurger = veggieRestaurant.orderBurger();
        // Print the veggie burger details
        System.out.println(veggieBurger);
    }
}