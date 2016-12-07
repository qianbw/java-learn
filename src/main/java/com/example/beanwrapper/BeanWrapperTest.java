package com.example.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanWrapperTest {

//    public static void main(String[] args) {
//        try {
//            Company c = new Company();
//            c.setName("abccc");
//
//            BeanWrapper bwComp = new BeanWrapperImpl(c);
//            // setting the company name...
//            bwComp.setPropertyValue("name", "Some Company Inc.");
//            // ... can also be done like this:
//            PropertyValue v = new PropertyValue("name", "Some Company Inc.");
//            bwComp.setPropertyValue(v);
//
//            // ok, lets create the director and tie it to the company:
//            Employee jim = new Employee();
//            BeanWrapper bwJim = new BeanWrapperImpl(jim);
//            bwJim.setPropertyValue("salary", "10.0");
//
//            bwComp.setPropertyValue("managingDirector", jim);
//
//            // retrieving the salary of the managingDirector through the company
//            Float salary = (Float) bwComp.getPropertyValue("managingDirector.salary");
//            System.out.println("" + salary);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}


