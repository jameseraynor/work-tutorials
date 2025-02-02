package com.springaicourse.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * BookFactory implements the Flyweight pattern to efficiently manage BookType objects.
 * The Flyweight pattern is used to minimize memory usage by sharing common data between objects.
 */
public class BookFactory {

    /**
     * Cache to store and reuse BookType objects.
     * Acts as a flyweight pool where similar BookTypes are stored and shared.
     */
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    /**
     * Factory method that implements the flyweight pattern.
     * Returns existing BookType if already created, creates new one if not found.
     *
     * @param type - Intrinsic state that is shared
     * @param distributor - Extrinsic state passed to BookType
     * @param otherData - Additional extrinsic state
     * @return BookType - Either existing or new BookType instance
     */
    public static BookType getBookType(String type, String distributor, String otherData) {
        if (bookTypes.get(type) == null) {
            bookTypes.put(type, new BookType(type, distributor, otherData));
        }
        return bookTypes.get(type);
    }
}