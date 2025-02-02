package com.springaicourse.designpatterns.behavioral.visitor.model;

import com.springaicourse.designpatterns.behavioral.visitor.Visitor;
import lombok.Getter;

@Getter
public class Resident extends Client {

    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}