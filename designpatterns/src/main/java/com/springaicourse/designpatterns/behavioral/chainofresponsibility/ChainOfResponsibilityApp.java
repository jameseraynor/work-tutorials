package com.springaicourse.designpatterns.behavioral.chainofresponsibility;

/**
 * Main application class demonstrating the Chain of Responsibility pattern for authentication
 *
 * <p>use this pattern when you want to decouple sender of request from its receiver
 * by allowing multiple objects to handle the request without coupling sender and receiver
 * directly and you want to issue a request in sequence until one of the objects in the chain
 * handles it
 * <p>
 * Example: In this example, we have a chain of handlers that check for different conditions
 * (e.g., user exists, password is valid, user has the required role) before allowing
 * the request to proceed further. The chain is built using the setNextHandler method,
 * and the authentication service (AuthService) uses the chain to handle the request.
 * <p>
 * Advantages:
 * - Decouples sender and receiver of request
 * - Allows multiple handlers to be added or removed dynamically
 * - Simplifies the code by separating the request handling logic from the sender's code
 * <p>
 * Disadvantages:
 * - Can lead to a performance hit if the chain is long and the request is not handled
 * - May make the code more complex and harder to maintain
 * <p>
 * When to use:
 * - Use when you need to decouple sender and receiver of request
 * - Use when you want to issue a request in sequence until one of the objects in the chain
 *   handles it
 * - Use when you want to simplify the code by separating the request handling logic from
 *   the sender's code
 * - Use when you want to allow multiple objects to handle the request without coupling
 *   sender and receiver directly and you want to issue a request in sequence until one
 *   of the objects in the chain handles it
 */
public class ChainOfResponsibilityApp {

  public static void main(String[] args) {
    // Create database instance to store user credentials
    Database database = new Database();

    // Build the chain of responsibility for authentication checks:
    // 1. Check if user exists
    // 2. Validate password
    // 3. Check user role
    Handler handler =
        new UserExistsHandler(database)
            .setNextHandler(new ValidPasswordHandler(database))
            .setNextHandler(new RoleCheckHandler());

    // Create authentication service with the handler chain
    AuthService service = new AuthService(handler);

    // Test Case 1: Valid admin credentials
    System.out.println("Test 1");
    service.logIn("admin_username", "admin_password");

    // Test Case 2: Invalid username
    System.out.println("Test 2");
    service.logIn("wrong_name", "admin_password");

    // Test Case 3: Invalid password
    System.out.println("Test 3");
    service.logIn("admin_username", "wrong_password");

    // Test Case 4: Valid user credentials
    System.out.println("Test 4");
    service.logIn("user_username", "user_password");
  }
}