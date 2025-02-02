package com.springaicourse.designpatterns.behavioral.visitor;

import com.springaicourse.designpatterns.behavioral.visitor.model.*;

import java.util.List;

/**
 * Main application class demonstrating the Visitor Pattern implementation for insurance messaging
 * to different types of clients
 *
 * <p>isolation: the Visitor pattern isolates the algorithm from the object structure on which it
 * operates, allowing new operations to be added without modifying the objects
 *
 * <p>flexibility: the Visitor pattern allows adding new operations to existing object structures
 * without modifying their classes, promoting code extensibility
 *
 * <p>double dispatch: the Visitor pattern uses double dispatch to determine the specific method to
 * be called based on the type of the object being visited and the type of the visitor. meaning
 * delegates choosing the proper method to the object itself instead of letting the class select the
 * method
 *
 * use when:
 * - the object structure is stable but the operations on the objects need to be extended
 * - the object structure is not stable and frequently changes
 * - the operations on the objects need to be performed in a flexible and extensible way
 */
public class VisitorApp {
  public static void main(String[] args) {

    // Create a list of different types of clients (Bank, Resident, Company, Restaurant)
    // Each client is initialized with name, address, number and a type-specific attribute
    List<Client> clients =
        List.of(
            new Bank("bank_name", "bank_address", "bank_number", 10), // Bank with 10 branches
            new Resident(
                "resident_name",
                "resident_address",
                "resident_number",
                "A"), // Resident with category A
            new Company(
                "company_name",
                "company_address",
                "company_number",
                1000), // Company with 1000 employees
            new Restaurant(
                "resto_name",
                "resto_address",
                "resto_number",
                true) // Restaurant with liquor license
            );

    // Create an instance of the visitor that will generate insurance messages
    InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();

    // Process all clients and send appropriate insurance messages based on client type
    visitor.sendInsuranceMails(clients);
  }
}
