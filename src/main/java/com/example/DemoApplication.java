package com.example;

import com.example.event.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DemoApplication.class, args);

        SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        springApplication.addListeners(new MyContextRefreshedEvent());
        springApplication.addListeners(new MyApplicationReadyEvent());
        springApplication.addListeners(new MyContextClosedEvent());
        springApplication.addListeners(new MyContextStartedEvent());
        springApplication.addListeners(new MyContextStoppedEvent());

        springApplication.setWebEnvironment(true);
        springApplication.run(args);
    }
}

