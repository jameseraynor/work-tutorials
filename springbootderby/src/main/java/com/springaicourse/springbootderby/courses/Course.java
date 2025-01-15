package com.springaicourse.springbootderby.courses;

import com.springaicourse.springbootderby.topics.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// Topic class represents a topic entity with basic properties
// Added Lombok annotations for boilerplate code generation

@Entity
public class Course {

  // Unique identifier for the topic
  @Id private String id;
  // Name/title of the topic
  private String name;
  // Detailed description of the topic
  private String description;

  @ManyToOne
  @JoinColumn(name = "topic_id")
  private Topic topic;

  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Topic topic) {
    this.topic = topic;
  }

  public Course() {}

  public Course(String id, String name, String description, String topicId) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.topic = new Topic(topicId, "", "");
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
