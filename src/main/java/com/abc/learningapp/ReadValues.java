package com.abc.learningapp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadValues {
    @Value("${spring.application.collegeName}")
    private String appName;
    public String getAppName(){
        return appName;

    }
    @PostConstruct
    public void init() {
        System.out.println("3. PostConstruct executed"+ appName);
    }
}
