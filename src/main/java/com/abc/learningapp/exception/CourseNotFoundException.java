package com.abc.learningapp.exception;

public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(){
        super();
    }
    public CourseNotFoundException(String message){
        super(message);
    }
}
