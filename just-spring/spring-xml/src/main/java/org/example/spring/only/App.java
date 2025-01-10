package org.example.spring.only;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
/**
 * Main application class that demonstrates Spring IoC container usage
 */
public class App
{
    /**
     * Main entry point of the application
     * @param args Command line arguments (not used)
     */
    public static void main( String[] args )
    {
        // Create Spring application context by loading XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Dev bean instance from Spring container
        Dev dev = (Dev) context.getBean("dev");
        // Call working method on Dev instance
        dev.working();

        // Print Hello World message
        System.out.println( "Hello World!" );
    }
}