package com.suin_kim.first_boot_project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[]arg){
        // 1 : Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
                // -> 자바 설정에서 정보를 읽어와 빈 객체를 생성, 관리 한다.
        // 2 : Configure the things that we want Spring to manage - @Configuration
        // what is @Configuration ?
        // - it is a class-level annotation indicating that an object is a source of bean definitions

        // 3 : Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

    }
}
