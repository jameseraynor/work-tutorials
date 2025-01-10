package com.example.springboot.topics;

import lombok.*;


// Topic class represents a topic entity with basic properties
// Added Lombok annotations for boilerplate code generation
@Getter // Generates getters for all fields
@Setter // Generates setters for all fields
@AllArgsConstructor // Generates constructor with all fields as parameters
@NoArgsConstructor // Generates default no-args constructor
@ToString // Generates toString() method including all fields
public class Topic {

    // Unique identifier for the topic
    private String id;
    // Name/title of the topic
    private String name;
    // Detailed description of the topic
    private String description;

}