package com.springaicourse.designpatterns.creational.factories.factory.simple;

import com.springaicourse.designpatterns.creational.factories.factory.model.Burger;

public class RestaurantApp {
    public static void main(String[] args) {
        // Create an instance of the restaurant
        Restaurant restaurant = new Restaurant();

        // Order a burger using the restaurant
        Burger burger = restaurant.orderBurger("VEGGIE");

        // Print the prepared burger
        System.out.println(burger);
    }
}
