package com.springaicourse.designpatterns.structural.flyweight;

import java.util.List;
import java.util.Random;

/**
 * Flyweight pattern is used when we need to create a lot of Objects of a class.
 * Since every object consumes memory space that can be crucial for memory limited devices,
 * such as mobile devices or embedded systems, flyweight pattern can be applied to reduce the
 * load on memory by sharing objects. splits the state of the initial object into two parts:
 * intrinsic-immutable state (shared) and extrinsic-mutable state (unique).
 *
 * In this example, we create a Store class that manages Book objects.
 * Each Book object has a unique name, price, and a BookType object that represents the shared
 * intrinsic state (type, distributor, and otherData).
 * The BookType objects are created using the Flyweight pattern, which ensures that only one
 * BookType object is created for each unique combination of type, distributor, and otherData.
 * This reduces the memory usage compared to creating a new BookType object for each Book instance.
 *
 * use when:
 * - When you need to create a large number of objects
 * - When memory usage needs to be optimized
 * - When you want to share data among multiple objects
 *
 */
public class FlyweightApp {
    // Define constants for the number of unique book types (intrinsic state)
    private static final int BOOK_TYPES = 2;
    // Total number of book instances to create
    private static final int BOOKS_TO_INSERT = 10_000_000;

    public static void main(String[] args) {
        // Create a store that will manage the flyweight objects
        Store store = new Store();

        // Create books in bulk, alternating between two types
        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            // Create Action book with unique extrinsic state (name, price)
            // but shared intrinsic state ("Action", "Follett", "Stuff")
            store.storeBook(getRandomName(), getRandomPrice(), "Action", "Follett", "Stuff");

            // Create Fantasy book with unique extrinsic state (name, price)
            // but shared intrinsic state ("Fantasy", "Ingram", "Extra")
            store.storeBook(getRandomName(), getRandomPrice(), "Fantasy", "Ingramr-index=0 reference-tracker>", "Extra");
        }

        // Display memory usage statistics
        System.out.println(BOOKS_TO_INSERT + " Books Inserted");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        // Each Book object only stores unique data (20 bytes)
        // BookTypes store shared data (30 bytes) and are reused
        System.out.println("Book Size (20 bytes) * " + BOOKS_TO_INSERT +
                " + BookTypes Size (30 bytes) * " + BOOK_TYPES + "");
        System.out.println("==========================================");
        // Calculate memory savings compared to storing all data in each book
        System.out.println("Total: " + ((BOOKS_TO_INSERT * 20 + BOOK_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((BOOKS_TO_INSERT * 50) / 1024 / 1024) + "MB)");
    }

    // Helper method to generate random book names from a fixed list
    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5",
                "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }

    // Helper method to generate random prices
    private static double getRandomPrice() {
        return new Random().nextDouble(10, 200);
    }
}

