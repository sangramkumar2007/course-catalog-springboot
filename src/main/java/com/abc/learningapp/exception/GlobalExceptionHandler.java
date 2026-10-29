package com.abc.learningapp.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<ApiError>handleCourseNotFound(
            CourseNotFoundException ex,
            HttpServletRequest request
    ){
        ApiError error = new ApiError(LocalDateTime.now(),
                404,"Course not Found",
                ex.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
