package com.springaicourse.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Store class represents a bookstore that manages a collection of books.
 * It implements the Flyweight pattern by sharing common book type data.
 */
public class Store {

    /**
     * List to store all books in the store's inventory
     */
    private final List<Book> books = new ArrayList<>();

    /**
     * Adds a new book to the store's inventory
     * @param name The title of the book
     * @param price The price of the book
     * @param type The type/category of book
     * @param distributor The book's distributor
     * @param otherData Additional book metadata
     */
    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        // Get or create a flyweight BookType object
        BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        // Create new Book instance and add to inventory
        books.add(new Book(name, price, bookType));
    }

    /**
     * Displays all books in the store's inventory by printing them to console
     */
    public void displayBooks() {
        books.forEach(System.out::println);
    }
}