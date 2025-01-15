package com.springaicourse.springbootderby.topics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Topic class represents a topic entity with basic properties
// Added Lombok annotations for boilerplate code generation

@Entity
public class Topic {

    // Unique identifier for the topic
    @Id
    private String id;
    // Name/title of the topic
    private String name;
    // Detailed description of the topic
    private String description;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}