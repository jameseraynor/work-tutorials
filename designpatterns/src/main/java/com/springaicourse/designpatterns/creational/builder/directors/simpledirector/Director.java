package com.springaicourse.designpatterns.creational.builder.directors.simpledirector;

import com.springaicourse.designpatterns.creational.builder.simple.CarBuilder;

public class Director {
    public void buildBugatti(CarBuilder builder) {
        builder.setMake("Bugatti")
                .setModel("Chiron")
                .setColor("Blue")
                .setNumberOfDoors(2)
                .setScreenType("Curtain")
                .setHeight(115)
                .setWeight(3900)
                .setYear(2021);
    }

    public void buildLamborghini(CarBuilder builder) {
        builder.setMake("Lamborghini")
                .setModel("Aventador")
                .setColor("Yellow")
                .setNumberOfDoors(2)
                .setScreenType("Curtain")
                .setHeight(115)
                .setWeight(3900)
                .setYear(2021);
    }
}
