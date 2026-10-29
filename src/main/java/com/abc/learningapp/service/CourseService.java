package com.abc.learningapp.service;

import com.abc.learningapp.exception.CourseNotFoundException;
import com.abc.learningapp.repository.CourseRepository;
import org.springframework.stereotype.Service;
import com.abc.learningapp.entity.Course;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public Course getCourseById(Long id){
        return courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException("Course Not Found With ID: "+id)
        );
    }

}
