package com.springaicourse.designpatterns.structural.facade;

import com.springaicourse.designpatterns.structural.facade.thirdparty.*;

/**
 * This class implements the Facade Pattern to simplify cryptocurrency purchases
 * The Facade Pattern provides a unified interface to a set of interfaces in a subsystem
 * It defines a higher-level interface that makes the subsystem easier to use
 */
public class BuyCryptoFacade {
    /**
     * Single method that orchestrates the entire crypto buying process
     * Hides the complexity of interacting with multiple services:
     * - Database service for user data
     * - UI service for logged-in user
     * - Crypto service for currency purchase
     * - Mail service for confirmation
     */
    public void buyCryptocurrency(double amount, String currency) {
        // Get user data from database service
        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUser(UIService.getLoggedInUserId());

        // Validate user has sufficient balance
        if (user.balance() < amount) {
            System.out.println("Insufficient balance to perform transaction");
            return;
        }

        // Execute crypto purchase through factory and service
        CryptoFactory.getCryptoService(currency).buyCurrency(user, amount);

        // Send confirmation email
        MailService mailService = new MailService();
        mailService.sendConfirmationMail(user);

        // Print success message
        System.out.println(amount + " of " + currency + " bought successfully!");
    }
}