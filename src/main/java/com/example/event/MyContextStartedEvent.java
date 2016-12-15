package com.example.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by qianbw on 16/12/15.
 */
public class MyContextStartedEvent implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent......");

        // 打印当前容器中的bean
        String[] list = event.getApplicationContext().getBeanDefinitionNames();
        //System.out.println(list.length);
        for (String str : list) {
            // System.out.println(str);
        }
    }
}