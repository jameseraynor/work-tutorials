package com.springaicourse.springbootderby.courses;

import java.util.List;

import com.springaicourse.springbootderby.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Controller class for handling Topic-related HTTP requests
@RestController
// Maps all requests to /topics endpoint
@RequestMapping("/topics")
public class CourseController {

    // Injects TopicService dependency
    @Autowired
    private CourseService topicService;

    // All mappings have the appropriate verb associated
    // GET /topics - Returns list of all topics
    @GetMapping("/{topicId}/courses")
    public List<Course> getCourses(@PathVariable String topicId) {
//        return List of topics;
        return topicService.getAllCourses(topicId);
    }

    // GET /topics/{id} - Returns a specific topic by ID
    @GetMapping("/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return topicService.getCourseById(id);
    }

    // POST /topics - Creates a new topic
    @PostMapping("/{topicId}/courses")
    public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
        System.out.println(course);
        course.setTopic(new Topic(topicId, "", ""));
        topicService.addCourse(course);
    }

    // PUT /topics/{id} - Updates an existing topic
    @PutMapping("/{topicId}/courses/{id}")
    public void updateCourse(@PathVariable String topicId, @PathVariable String id, @RequestBody Course course) {
        System.out.println(course);
        course.setTopic(new Topic(topicId, "", ""));
        topicService.updateCourse(id, course);
    }

    // DELETE /topics/{id} - Deletes a topic by ID
    @DeleteMapping("/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String topicId, @PathVariable String id) {
        System.out.println("deleting topic with id: "+ id);
        topicService.deleteCourseById(id);
    }
}
