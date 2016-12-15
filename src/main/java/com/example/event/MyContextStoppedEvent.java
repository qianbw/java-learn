package com.example.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by qianbw on 16/12/15.
 */
public class MyContextStoppedEvent implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent......");

        // 打印当前容器中的bean
        String[] list = event.getApplicationContext().getBeanDefinitionNames();
        //System.out.println(list.length);
        for (String str : list) {
            // System.out.println(str);
        }
    }
}