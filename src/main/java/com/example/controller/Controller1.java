package com.example.controller;

import com.example.beanwrapper.Company;
import com.example.paradigm.ParadigmTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qianbw on 16/12/1.
 */
@RestController
public class Controller1 {
    @Autowired
    Company company;

    @Autowired
    ParadigmTest faradigm;

    @RequestMapping(value = "/")
    String fanXing() {
        company.setName("钱多多");
        faradigm.test(company);
        return "hello world";
    }

    @RequestMapping(value = "/test1")
    public void doSomething(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        boolean rst = company.isMicrosoft();
        System.out.println(rst);
    }
}
