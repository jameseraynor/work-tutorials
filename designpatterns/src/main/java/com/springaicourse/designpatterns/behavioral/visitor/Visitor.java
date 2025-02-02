package com.springaicourse.designpatterns.behavioral.visitor;

import com.springaicourse.designpatterns.behavioral.visitor.model.*;

/**
 * Visitor interface that defines methods to visit different types of entities.
 * Implements the Visitor design pattern to add new operations to existing object structures
 * without modifying them.
 */
public interface Visitor {

    /**
     * Visit method for Bank entities.
     * Allows performing operations specific to Bank objects.
     * @param bank The Bank object to be visited
     */
    void visit(Bank bank);

    /**
     * Visit method for Company entities.
     * Allows performing operations specific to Company objects.
     * @param company The Company object to be visited
     */
    void visit(Company company);

    /**
     * Visit method for Resident entities.
     * Allows performing operations specific to Resident objects.
     * @param resident The Resident object to be visited
     */
    void visit(Resident resident);

    /**
     * Visit method for Restaurant entities.
     * Allows performing operations specific to Restaurant objects.
     * @param restaurant The Restaurant object to be visited
     */
    void visit(Restaurant restaurant);

}