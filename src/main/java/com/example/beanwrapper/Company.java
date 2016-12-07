package com.example.beanwrapper;

import org.springframework.stereotype.Component;

/**
 * Created by qianbw on 16/11/29.
 */
@Component
public class Company {
    private String name;
    private Employee managingDirector;


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Employee getManagingDirector() {
        return this.managingDirector;
    }

    public void setManagingDirector(Employee managingDirector) {
        this.managingDirector = managingDirector;
    }

    public boolean isMicrosoft() {
        return false;
    }
}
