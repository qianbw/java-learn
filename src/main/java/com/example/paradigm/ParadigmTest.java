package com.example.paradigm;

import com.example.beanwrapper.Company;
import org.springframework.stereotype.Component;

/**
 * 范式测试
 */
@Component
public class ParadigmTest {
    public <E> void test(E requestDto) {
        if (requestDto instanceof Company) {
            Company company = (Company) requestDto;
            System.out.println(company.getName());
        }
    }
}
