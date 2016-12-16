package com.example.controller;

import com.example.config.ConfigTest;
import com.example.config.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qianbw on 16/12/1.
 */
@RestController
@RequestMapping(value = "/config")
public class ConfigController {
    @Autowired
    ConfigTest configTest;

    @Autowired
    PersonInfo personInfo;

    @RequestMapping(value = "/test1")
    String test1() {
        return configTest.getName() + "," + configTest.getSecret() + ","
                + configTest.getBignumber() + "," + configTest.getLessThanTen() + ","
                + configTest.getRangeNumber() + "," + configTest.getNumber() + "," + configTest.getDesc();
    }

    @RequestMapping(value = "/test2")
    String test2() {
        return personInfo.getFirstName() + "," + personInfo.getPhone();
    }
}
