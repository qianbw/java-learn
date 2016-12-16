package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by qianbw on 16/12/16.
 */
@Component
public class ConfigTest {
    @Value("${name}")
    private String name;

    @Value("${my.desc}")
    private String desc;

    @Value("${my.secret}")
    private String secret;

    @Value("${my.number}")
    private int number;

    @Value("${my.bignumber}")
    private long bignumber;

    @Value("${my.number.less.than.ten}")
    private int lessThanTen;

    @Value("${my.number.in.range}")
    private int rangeNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public int getLessThanTen() {
        return lessThanTen;
    }

    public void setLessThanTen(int lessThanTen) {
        this.lessThanTen = lessThanTen;
    }

    public int getRangeNumber() {
        return rangeNumber;
    }

    public void setRangeNumber(int rangeNumber) {
        this.rangeNumber = rangeNumber;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
