# Design Patterns Implementation in Java

This project demonstrates various design patterns implemented in Java, providing practical examples and explanations for each pattern.

## Project Description

This repository contains a comprehensive collection of design pattern implementations in Java. It serves as an educational resource for developers looking to understand and apply design patterns in their software projects. The patterns are organized into three main categories: Behavioral, Creational, and Structural.

Key features of this project include:
- Clear and concise implementations of popular design patterns
- Detailed explanations and use cases for each pattern
- Practical examples demonstrating pattern applications
- Organized structure for easy navigation and understanding

The project covers a wide range of design patterns, including but not limited to:
- Behavioral Patterns: Chain of Responsibility, Command, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor
- Creational Patterns: Builder, Factory Method, Abstract Factory, Prototype, Singleton
- Structural Patterns: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy

Each pattern implementation is accompanied by example usage and explanations to help developers understand when and how to apply these patterns in real-world scenarios.

## Repository Structure

```
.
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── springaicourse
│   │               └── designpatterns
│   │                   ├── behavioral
│   │                   │   ├── chainofresponsibility
│   │                   │   ├── command
│   │                   │   ├── iterator
│   │                   │   ├── mediator
│   │                   │   ├── memento
│   │                   │   ├── observer
│   │                   │   ├── state
│   │                   │   ├── strategy
│   │                   │   ├── template
│   │                   │   └── visitor
│   │                   ├── creational
│   │                   │   ├── builder
│   │                   │   ├── factories
│   │                   │   ├── prototype
│   │                   │   └── singleton
│   │                   └── structural
│   │                       ├── adapter
│   │                       ├── bridge
│   │                       ├── composite
│   │                       ├── decorator
│   │                       ├── facade
│   │                       ├── flyweight
│   │                       └── proxy
│   └── test
│       └── java
│           └── com
│               └── springaicourse
│                   └── designpatterns
└── pom.xml
```

Key Files:
- `pom.xml`: Maven project configuration file
- `src/main/java/com/springaicourse/designpatterns/DesignpatternsApplication.java`: Main application entry point
- Pattern-specific implementation files are located in their respective directories under `src/main/java/com/springaicourse/designpatterns/`

## Usage Instructions

### Installation

1. Ensure you have Java Development Kit (JDK) 17 or later installed.
2. Clone the repository:
   ```
   git clone <repository-url>
   ```
3. Navigate to the project directory:
   ```
   cd designpatterns
   ```
4. Build the project using Maven:
   ```
   mvn clean install
   ```

### Getting Started

To run the examples for a specific design pattern:

1. Navigate to the pattern's directory under `src/main/java/com/springaicourse/designpatterns/`.
2. Locate the main application class for the pattern (usually named `*App.java`).
3. Run the main method of the application class.

For example, to run the Chain of Responsibility pattern example:

```java
java com.springaicourse.designpatterns.behavioral.chainofresponsibility.ChainOfResponsibilityApp
```

### Common Use Cases

1. Chain of Responsibility Pattern:
   ```java
   Database database = new Database();
   Handler handler = new UserExistsHandler(database)
       .setNextHandler(new ValidPasswordHandler(database))
       .setNextHandler(new RoleCheckHandler());
   AuthService service = new AuthService(handler);
   service.logIn("admin_username", "admin_password");
   ```

2. Singleton Pattern:
   ```java
   MySingleton singleton = MySingleton.getInstance("Initial Data");
   ```

3. Builder Pattern:
   ```java
   Car car = new CarBuilder()
       .setId(1)
       .setMake("Toyota")
       .setModel("Camry")
       .setColor("Blue")
       .setNumberOfDoors(4)
       .setScreenType("LCD")
       .setHeight(1.5)
       .setWeight(1500)
       .setYear(2023)
       .build();
   ```

### Testing & Quality

To run the unit tests for the project:

```
mvn test
```

### Troubleshooting

1. Issue: ClassNotFoundException when running examples
   - Ensure that you have built the project using `mvn clean install`
   - Verify that your classpath includes the `target/classes` directory

2. Issue: Compilation errors
   - Make sure you're using JDK 17 or later
   - Run `mvn clean install` to ensure all dependencies are properly downloaded and built

3. Issue: Pattern implementation not working as expected
   - Review the pattern's main application class for correct usage
   - Check the console output for any error messages or unexpected behavior
   - Verify that all required classes for the pattern are present and properly implemented

## Data Flow

1. The user selects a specific design pattern example to run.
2. The main application class for the chosen pattern is executed.
3. The pattern's components are instantiated and configured.
4. The pattern's behavior is demonstrated through method calls and interactions between objects.
5. Results and state changes are displayed in the console output.

```
[User] -> [Pattern App] -> [Pattern Components] -> [Console Output]
```

## Deployment

This project is primarily designed for educational purposes and local execution. However, if you wish to deploy it as part of a larger application:

1. Package the project as a JAR file:
   ```
   mvn package
   ```
2. Include the generated JAR file in your application's classpath.
3. Import and use the design pattern implementations as needed in your application code.