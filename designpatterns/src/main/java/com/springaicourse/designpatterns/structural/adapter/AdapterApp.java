package com.springaicourse.designpatterns.structural.adapter;

/**
 * Main application class demonstrating the Adapter pattern
 * Shows how to adapt a new UI service to work with existing XML data format
 *
 * Adapter pattern allows objects with incompatible interfaces to work together
 * by converting the interface of one class into another expected by the client
 *
 * use when:
 * - You want to use a class, but its interface is not compatible with the one you need
 * - You need to use several classes, but it's impractical to integrate them
 * - You want to reuse existing class with a new interface
 */
public class AdapterApp {
    public static void main(String[] args) {

        // Create sample XML data to be displayed
        XmlData myData = new XmlData();

        // Old UI implementation
        // Uses the original MultiRestoApp that directly works with XML data
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(myData);
        multiRestoApp.displayRecommendations(myData);

        // Visual separator between old and new UI outputs
        System.out.println("==========================================");

        // New UI implementation using the Adapter pattern
        // FancyUIServiceAdapter converts XML data to JSON format expected by new UI
        IMultiRestoApp adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(myData);
        adapter.displayRecommendations(myData);

    }
}
