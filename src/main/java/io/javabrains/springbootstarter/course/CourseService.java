package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService { // business services are singletons

    @Autowired
    private CourseRepository courseRepository; // with autowired it can inject the topic repository

    public List<Course> getAllCourses(String topicId) {
        // return courses
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add); // filter by this particular topicId
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course); // update can not change id, or it become creating a course
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
