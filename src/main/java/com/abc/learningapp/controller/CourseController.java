package com.abc.learningapp.controller;

import com.abc.learningapp.entity.Course;
import com.abc.learningapp.service.CourseService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.abc.learningapp.ReadValues;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @GetMapping
    public List<Course> getCourse() {
        return courseService.getAllCourses();
    }
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }


    @PostMapping
    public String addCourse(){
        return "Course Catalog - Add Courses";
    }
@Autowired
    private final CourseService courseService;
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }
    @Autowired
    private ReadValues readValues;
    @GetMapping("/collage")
    public String getCollegeName(){
        return readValues.getAppName();
    }

}
