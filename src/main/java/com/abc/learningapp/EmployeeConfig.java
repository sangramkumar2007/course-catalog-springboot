package com.abc.learningapp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConfig {
    @Value("${employee.name}")
    private String employeeName;

    @PostConstruct
    public void init() {
        System.out.println("3. PostConstruct executed for Employee" + employeeName);
    }
}
