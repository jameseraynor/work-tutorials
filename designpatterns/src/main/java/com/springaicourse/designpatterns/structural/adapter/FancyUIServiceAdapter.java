package com.springaicourse.designpatterns.structural.adapter;

/**
 * Adapter class that allows FancyUIService (which works with JSON) to be used with systems expecting XML data
 * This implements the IMultiRestoApp interface while wrapping a FancyUIService instance
 */
public class FancyUIServiceAdapter implements IMultiRestoApp{
    // The wrapped FancyUIService instance that we're adapting
    private final FancyUIService fancyUIService;

    /**
     * Constructor - initializes the wrapped FancyUIService instance
     */
    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }

    /**
     * Displays menus by converting XML data to JSON format
     * @param xmlData The menu data in XML format
     */
    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Menus using converted JSON data...");
        fancyUIService.displayMenus(jsonData);
    }

    /**
     * Displays recommendations by converting XML data to JSON format
     * @param xmlData The recommendations data in XML format
     */
    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Recommendations using converted JSON data...");
        fancyUIService.displayRecommendations(jsonData);
    }

    /**
     * Helper method to convert XML format to JSON format
     * @param xmlData The input data in XML format
     * @return JsonData The converted data in JSON format
     */
    private JsonData convertXmlToJson(XmlData xmlData) {
        // Converts XmlData to JsonData and return it
        System.out.println("Converting XML to JSON...");
        return new JsonData();
    }
}