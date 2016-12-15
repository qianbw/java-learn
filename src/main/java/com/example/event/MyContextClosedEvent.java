package com.example.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * Created by qianbw on 16/12/15.
 */
public class MyContextClosedEvent implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("ContextClosedEvent......");

        // 打印当前容器中的bean
        String[] list = event.getApplicationContext().getBeanDefinitionNames();
        //System.out.println(list.length);
        for (String str : list) {
            // System.out.println(str);
        }
    }
}