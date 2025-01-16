package com.springaicourse.microservicedemo.controllers;

import com.springaicourse.microservicedemo.DbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * use @Value to get the value from application.properties when just getting a one time use property
 * use @ConfigurationProperties to get the value from application.properties when you want to get multiple properties
 * grouped together and used in many parts of the application
 */
@RestController
@RefreshScope
public class HelloController {

  @Autowired Environment environment;

  @Value("${greeting.hello: default value}")
  String greeting;

  @Value("some String")
  String someString;

  @Value("${my.list}")
  List<String> myList;

//  @Value("#{${db.Values}}")
//  private Map<String, String> dbValues;

  @Autowired
  private DbConfig dbConfig;

  @GetMapping("/hello")
  public String hello() {
      return dbConfig.getHost() + " " + dbConfig.getPort() + " " + dbConfig.getConnection() + " " +greeting;
//    return greeting + someString + myList + dbValues;
    //        return environment.getProperty("greeting.hello");
    //        return "Hello World";
  }

  /**
   * Get all the properties from the environment
   * This is not a good practice to use in production
   * This is only for practice purposes
   * Use @Value to get the value from application.properties
   * and @Profile to not affect testability
   *
   * @return
   */
  @GetMapping("/envdetails")
  public String envDetails() {
    return environment.toString();
  }
}
