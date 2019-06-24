package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> { // CrudRepository is a generic class

    // do not have to implement the method. just declare the method with the findByProperty name format,
    // the Spring Data JPA will implement for you
    List<Course> findByTopicId(String topicId);
}
