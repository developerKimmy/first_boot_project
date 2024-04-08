package com.suin_kim.first_boot_project.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record
// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// Equals, hashcode and toString are automatically created.
// Released in JDK 16.

record  Person (String name, int age, Address address) {};

// Address - firstLine & city
record Address (String firstLine, String city) {};

// 여러개의 빈이 있었을 때 (같은 타입)
// 1. Primary 를 생성하거나
// 2. Qualifier 를 생성해 어떤 빈을 불러올 것인지 설정할 수 있음
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name () {
        return "Suin";
    }

    @Bean
    public int age () {
        return 28;
    }

    @Bean
    public Person person(){
        return new Person("Suin Kim", 28, new Address("유성구", "대전"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age,  @Qualifier("address3qualifier") Address address){
        return new Person(name, age, address);
    }


    // @Bean(name = "CustomName")
    @Bean (name = "address2")
    @Primary
    public Address address(){
        return new Address("대흥동","대전");
    }

    @Bean (name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Motinagar","Hyderabad");
    }
}
