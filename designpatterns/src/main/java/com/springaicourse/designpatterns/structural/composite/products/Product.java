package com.springaicourse.designpatterns.structural.composite.products;

import com.springaicourse.designpatterns.structural.composite.Box;
import lombok.Data;

/**
 * Abstract base class representing a product in the composite pattern.
 * Implements the Box interface to allow products to be treated uniformly
 * with composite boxes in the object structure.
 *
 * The Box interface enables both individual products (leaf nodes) and
 * containers/boxes (composite nodes) to be handled through the same interface,
 * supporting operations like price calculation across the entire product hierarchy.
 */
@Data
public abstract class Product implements Box {
    /**
     * The name/title of the product
     */
    protected final String title;

    /**
     * The price of the individual product
     */
    protected final double price;
}