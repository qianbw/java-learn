package com.example.commandlinerunner;

import com.example.beanwrapper.Company;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by qianbw on 16/12/15.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner running......");
        Company company = applicationContext.getBean("company", Company.class);
        System.out.println(company.getName());

        company.setName("set name by MyCommandLineRunner");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
