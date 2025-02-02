package com.springaicourse.designpatterns.behavioral.strategy;

import com.springaicourse.designpatterns.behavioral.strategy.strategies.PaymentByCreditCard;
import com.springaicourse.designpatterns.behavioral.strategy.strategies.PaymentByPayPal;

/**
 * Strategy Pattern The Strategy Pattern defines a family of algorithms, encapsulates each one, and
 * makes them interchangeable. It lets the algorithm vary independently from clients that use it.
 *
 * <p>strategies are easily replaceable and can be swapped at runtime applies single responsibility
 * principle and the open-closed principle each strategy is now isolated and can introduce new
 * strategies without affecting the existing ones
 *
 * <p>use when:
 * - many related classes differ only in their behavior
 * - you need different variants of an algorithm
 * - an algorithm is exposed to the client unchanged
 * - a family of algorithms exists
 *
 * state vs strategy:
 * - strategy for interfaces
 * - strategy is resolved at runtime
 * - strategy is mutable
 * - strategy is hidden
 * - strategy is passed to the client
 * - strategy is passed to the context
 *
 * - state for enums
 * - state is resolved at runtime
 * - state is immutable
 * - state is exposed
 * - state is in the client
 * - state is in the context
 */
public class StrategyApp {
  /**
   * Main method demonstrating the Strategy Pattern for payment processing The Strategy Pattern
   * allows us to define a family of algorithms, encapsulate each one, and make them interchangeable
   * at runtime
   */
  public static void main(String[] args) {

    // Create instance of payment service that will use different payment strategies
    PaymentService paymentService = new PaymentService();
    // The strategy can now be easily picked at runtime

    // Set credit card as the payment strategy and process an order
    paymentService.setStrategy(new PaymentByCreditCard());
    paymentService.processOrder(100);

    // Visual separator in console output
    System.out.println("==========================================");

    // Switch to PayPal as the payment strategy and process another order
    // Demonstrates how strategies can be swapped easily at runtime
    paymentService.setStrategy(new PaymentByPayPal());
    paymentService.processOrder(100);
  }
}
