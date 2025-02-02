package com.springaicourse.designpatterns.behavioral.visitor.model;

import com.springaicourse.designpatterns.behavioral.visitor.Visitor;
import lombok.Getter;

/**
 * Represents a Bank client that extends the base Client class.
 * This class is part of the Visitor pattern implementation.
 */
@Getter
public class Bank extends Client {

    /**
     * The number of bank branches that are insured.
     * This is a final field that cannot be modified after initialization.
     */
    private final int branchesInsured;

    /**
     * Constructs a new Bank instance.
     * @param name The name of the bank
     * @param address The physical address of the bank
     * @param number The bank's identification number
     * @param branchesInsured The number of insured branches
     */
    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    /**
     * Implementation of the Visitor pattern's accept method.
     * Allows the visitor to perform operations on this Bank instance.
     * @param visitor The visitor object that will operate on this Bank
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}