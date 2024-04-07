package com.suin_kim.first_boot_project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

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

        // because I have changed the name of bean to address2
//        System.out.println(context.getBean("address")); // No bean named 'address' available
        System.out.println(context.getBean("address2"));
        // looking for type of the class
//        System.out.println(context.getBean(Address.class));

        System.out.println("Person2 : " + context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));


        // get list of spring beans
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


        System.out.println("address : " + context.getBean(Address.class));
        System.out.println("person : " + context.getBean(Person.class));

        System.out.println("booyah : " + context.getBean("person5Qualifier"));


    }
}
