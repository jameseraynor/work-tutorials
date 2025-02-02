package com.springaicourse.designpatterns.creational.factories.factory.simple;

import com.springaicourse.designpatterns.creational.factories.factory.model.BeefBurger;
import com.springaicourse.designpatterns.creational.factories.factory.model.Burger;
import com.springaicourse.designpatterns.creational.factories.factory.model.VeggieBurger;

public class SimpleBurgerFactory {
    public Burger createBurger(String request) {
        if (request.equals("BEEF")) {
            return new BeefBurger();
        } else if (request.equals("VEGGIE")) {
            return new VeggieBurger();
        } else {
            return null;
        }
    }
}
