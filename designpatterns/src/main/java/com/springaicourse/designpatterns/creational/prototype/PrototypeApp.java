package com.springaicourse.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
/**
 * Main application class demonstrating the Prototype design pattern
 * The Prototype pattern allows objects to be cloned/copied rather than created from scratch
 *
 * <p>use the Prototype pattern when:
 * - creating new objects based on existing ones
 * - reducing the number of subclasses
 * - when instances of a class are created at runtime
 *
 * <p>benefits:
 * - allows for efficient object creation
 * - will clone without coupling them to a concrete class
 * - will get rid of repeated initialization code in the subclass
 * - will save resources and time
 *
 * TODO example with shallow copy vs deep copy
 */
public class PrototypeApp {

    public static void main(String[] args) {

        // Create a list of vehicle prototypes (original objects)
        List<Vehicle> vehicles = List.of(
                new Car("car_brand", "car_model", "car_color", 300), // Create a car prototype
                new Bus("bus_brand", "bus_model", "bus_color", 8)    // Create a bus prototype
        );

        // Create a new list to store cloned vehicles
        List<Vehicle> copyList = new ArrayList<>();
        // Clone each vehicle from the original list
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());  // Use clone() method to create copies
        }

        // Print out all the cloned vehicles
        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        // Demonstrate using a cache/registry of prototypes
        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);  // Store the vehicle prototypes in the cache
        // Retrieve and print a specific vehicle from the cache by its key
        System.out.println(registry.get("car_brand car_model"));

    }
}