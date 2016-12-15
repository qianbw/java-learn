package com.example.event;

import com.example.beanwrapper.Company;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by qianbw on 16/12/15.
 * 启动过程中，先执行ContextRefreshedEvent，再执行ApplicationReadyEvent。关闭服务时执行ContextClosedEvent。其余的event正常情况下不会主动执行
 */
public class MyApplicationReadyEvent implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("ApplicationReadyEvent......");

//        // 打印当前容器中的bean
//        String[] list = event.getApplicationContext().getBeanDefinitionNames();
//        //System.out.println(list.length);
//        for (String str : list) {
//            // System.out.println(str);
//        }

        Company company = event.getApplicationContext().getBean("company", Company.class);
        System.out.println(company.getName());
    }
}