package com.springaicourse.designpatterns.structural.bridge.abstractions;

import com.springaicourse.designpatterns.structural.bridge.implementations.Pizza;

public class AmericanRestaurant extends Restaurant{
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Everything");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Super Secret Recipe");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thick");
    }
}
