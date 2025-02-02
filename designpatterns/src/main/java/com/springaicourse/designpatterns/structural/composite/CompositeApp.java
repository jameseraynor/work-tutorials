package com.springaicourse.designpatterns.structural.composite;

import com.springaicourse.designpatterns.structural.composite.products.Book;
import com.springaicourse.designpatterns.structural.composite.products.VideoGame;

/**
 * Main application class demonstrating the Composite Pattern for order processing
 *
 * helps create a tree-like object structure to represent the order,
 * allowing for the calculation of the total price across all items
 * in the order, including nested boxes and individual products.
 *
 * all elements in the order are treated uniformly through a common interface,
 * enabling the client to treat individual objects and compositions of objects
 * in the same way, simplifying the code and making it more maintainable and
 * extensible.
 *
 * use when:
 * - you need to represent a hierarchical structure of objects
 * - you want to treat individual objects and compositions of objects uniformly
 * - you want to perform operations on the entire structure without knowing its exact type
 */
public class CompositeApp {
    public static void main(String[] args) {

        // Create a new delivery service instance to handle the order
        DeliveryService deliveryService = new DeliveryService();

        // Set up a complex order structure using nested composite boxes:
        deliveryService.setupOrder(
                // First box containing single video game
                new CompositeBox(
                        new VideoGame("1", 100) // Video game with ID "1" priced at 100
                ),
                // Second box containing nested items
                new CompositeBox(
                        // Nested box with two books
                        new CompositeBox(
                                new Book("2", 200),    // Book with ID "2" priced at 200
                                new Book("3", 300)     // Book with ID "3" priced at 300
                        ),
                        new VideoGame("4", 400),   // Video game with ID "4" priced at 400
                        new VideoGame("5", 500)    // Video game with ID "5" priced at 500
                )
        );

        // Calculate and print the total price of all items in the order
        System.out.println(deliveryService.calculateOrderPrice());

    }
}