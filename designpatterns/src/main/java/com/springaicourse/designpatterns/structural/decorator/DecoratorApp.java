package com.springaicourse.designpatterns.structural.decorator;

/**
 * Main application class demonstrating the Decorator pattern implementation
 * The Decorator pattern allows adding new behaviors to objects dynamically by placing them inside wrapper objects
 *
 * wraps an existing object and adds new functionality to it
 * - maintains the same interface as the wrapped object
 * - adds new functionality to the wrapped object
 * - can be chained with other decorators to add more functionality
 */
public class DecoratorApp {
    public static void main(String[] args) {

        // Create a notification chain that sends messages through multiple channels:
        // 1. Base Notifier
        // 2. WhatsApp Decorator
        // 3. Facebook Decorator
        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!"); // Send notification through all channels

        System.out.println("==========================================");

        // Create a notification chain for Facebook and base notification only
        // Skips WhatsApp notification
        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!"); // Send notification through Facebook and base

    }
}