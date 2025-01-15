package com.springaicourse.springbootderby.courses;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    private List<Course> courses;

    public CourseService() {
    }

    public List<Course> getAllCourses(String id) {
        return courseRepository.findByTopicId(id);
    }

    /**
     * Retrieves a topic by its ID
     * @param id The unique identifier of the topic
     * @return The Topic object matching the ID
     * @throws 'NoSuchElementException' if no topic is found with the given ID
     */
    public Course getCourseById(String id) {
        return courseRepository.findById(id).orElseThrow();
    }

    /**
     * Adds a new course to the list of topics
     * @param course The Topic object to be added
     */
    public void addCourse(Course course) {
        System.out.println("the course added:" + course);
        courseRepository.save(course);
        System.out.println("updated course list: " + course);
    }

    /**
     * Updates an existing topic's name and description
     * @param id The ID of the topic to update
     * @param updatedTopic Topic object containing the new name and description
     * @throws 'NoSuchElementException' if no topic is found with the given ID
     */
    public void updateCourse(String id, Course updatedTopic) {
        Course course = courseRepository.findById(id).orElseThrow();
        course.setName(updatedTopic.getName());
        course.setDescription(updatedTopic.getDescription());
        courseRepository.save(course);
    }

    /**
     * Deletes a topic by its ID if it exists
     * @param id The ID of the topic to delete
     */
    public void deleteCourseById(String id) {
        courseRepository.deleteById(id);
    }
}
