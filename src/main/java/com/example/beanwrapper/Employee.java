package com.example.beanwrapper;

import org.springframework.stereotype.Component;

/**
 * Created by qianbw on 16/11/29.
 */
@Component
public class Employee {
    private float salary;


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
