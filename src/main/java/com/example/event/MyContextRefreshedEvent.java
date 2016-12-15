package com.example.event;

import com.example.beanwrapper.Company;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by qianbw on 16/12/15.
 * 收到ContextRefreshedEvent时，bean以及完成了初始化
 */
public class MyContextRefreshedEvent implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent......");

//        // 打印当前容器中的bean
//        String[] list = event.getApplicationContext().getBeanDefinitionNames();
//        //System.out.println(list.length);
//        for (String str : list) {
//            // System.out.println(str);
//        }

        Company company = event.getApplicationContext().getBean("company", Company.class);
        company.setName("set name by ContextRefreshedEvent");
    }
}
