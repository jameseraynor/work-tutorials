package com.springaicourse.designpatterns.behavioral.strategy.strategies;

public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);

}