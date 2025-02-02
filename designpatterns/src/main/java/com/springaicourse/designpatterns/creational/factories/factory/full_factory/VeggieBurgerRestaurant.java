package com.springaicourse.designpatterns.creational.factories.factory.full_factory;

import com.springaicourse.designpatterns.creational.factories.factory.model.Burger;
import com.springaicourse.designpatterns.creational.factories.factory.model.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
    return new VeggieBurger();
    }
}
