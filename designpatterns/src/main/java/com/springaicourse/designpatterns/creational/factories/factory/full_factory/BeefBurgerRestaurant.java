package com.springaicourse.designpatterns.creational.factories.factory.full_factory;

import com.springaicourse.designpatterns.creational.factories.factory.model.BeefBurger;
import com.springaicourse.designpatterns.creational.factories.factory.model.Burger;

/**
 * Restaurant specializing in beef burgers, extending the base Restaurant class.
 * Implements the Factory Method pattern by providing a concrete implementation
 * for creating beef burgers.
 */
public class BeefBurgerRestaurant extends Restaurant {

    /**
     * Factory method that creates and returns a new BeefBurger instance.
     * Overrides the abstract createBurger() method from the parent Restaurant class.
     *
     * @return Burger A new BeefBurger object
     */
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
