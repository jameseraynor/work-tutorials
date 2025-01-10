package com.example.springboot.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller class for handling Topic-related HTTP requests
@RestController
// Maps all requests to /topics endpoint
@RequestMapping("/topics")
public class TopicController {

    // Injects TopicService dependency
    @Autowired
    private TopicService topicService;

    // All mappings have the appropriate verb associated
    // GET /topics - Returns list of all topics
    @GetMapping
    public List<Topic> getTopics() {
//        return List of topics;
        return topicService.getAllTopics();
    }

    // GET /topics/{id} - Returns a specific topic by ID
    @GetMapping("/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopicById(id);
    }

    // POST /topics - Creates a new topic
    @PostMapping
    public void addTopic(@RequestBody Topic topic) {
        System.out.println(topic);
        topicService.addTopic(topic);
    }

    // PUT /topics/{id} - Updates an existing topic
    @PutMapping("/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        System.out.println(topic);
        topicService.updateTopic(id, topic);
    }

    // DELETE /topics/{id} - Deletes a topic by ID
    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable String id) {
        System.out.println("deleting topic with id: "+ id);
        topicService.deleteTopicById(id);
    }
}
