package com.example.springboot.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private List<Topic> topics;

    public TopicService() {
        topics = new ArrayList<>(
                Arrays.asList(
                        new Topic("spring", "Spring Framework", "Spring Framework Description"),
                        new Topic("java", "Core Java", "Core Java Description"),
                        new Topic("javascript", "JavaScript", "JavaScript Description")));
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    /**
     * Retrieves a topic by its ID
     * @param id The unique identifier of the topic
     * @return The Topic object matching the ID
     * @throws 'NoSuchElementException' if no topic is found with the given ID
     */
    public Topic getTopicById(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElseThrow();
    }

    /**
     * Adds a new topic to the list of topics
     * @param topic The Topic object to be added
     */
    public void addTopic(Topic topic) {
        System.out.println("the topic added:" + topic);
        topics.add(topic);
        System.out.println("updated topic list: " + topics);
    }

    /**
     * Updates an existing topic's name and description
     * @param id The ID of the topic to update
     * @param updatedTopic Topic object containing the new name and description
     * @throws 'NoSuchElementException' if no topic is found with the given ID
     */
    public void updateTopic(String id, Topic updatedTopic) {
        Topic topic = topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElseThrow();
        topic.setName(updatedTopic.getName());
        topic.setDescription(updatedTopic.getDescription());
    }

    /**
     * Deletes a topic by its ID if it exists
     * @param id The ID of the topic to delete
     */
    public void deleteTopicById(String id) {
        Optional<Topic> topic = topics.stream().filter(t -> t.getId().equals(id)).findFirst();
        topic.ifPresent(t -> topics.remove(t));
    }
}
