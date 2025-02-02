package com.springaicourse.designpatterns.behavioral.strategy;

import com.springaicourse.designpatterns.behavioral.strategy.strategies.PaymentStrategy;

/**
 * Service class that handles payment processing using the Strategy pattern.
 * Allows for different payment strategies to be used at runtime.
 */
public class PaymentService {

    // The cost of items being purchased
    private int cost;

    // Flag to determine if delivery fee should be included
    private boolean includeDelivery = true;

    // The payment strategy that will be used to process the payment
    private PaymentStrategy strategy;

    /**
     * Processes an order with the given cost using the currently set payment strategy
     * @param cost The cost of the order to be processed
     */
    public void processOrder(int cost) {
        this.cost = cost;
        // Collect payment details using the selected strategy
        strategy.collectPaymentDetails();
        // Validate payment details before processing
        if (strategy.validatePaymentDetails()) {
            // Process the payment for the total amount
            strategy.pay(getTotal());
        }
    }

    /**
     * Calculates the total cost including delivery fee if applicable
     * @return The total cost with or without delivery fee
     */
    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

    /**
     * Sets the base cost of the order
     * @param cost The cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Sets whether delivery fee should be included in total
     * @param includeDelivery true to include delivery fee, false otherwise
     */
    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    /**
     * Sets the payment strategy to be used
     * @param strategy The payment strategy implementation to use
     */
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}