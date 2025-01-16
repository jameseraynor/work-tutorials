package com.springaicourse.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringclouddemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringclouddemoApplication.class, args);
  }
}
