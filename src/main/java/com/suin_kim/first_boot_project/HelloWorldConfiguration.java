package com.suin_kim.first_boot_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record
// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// Equals, hashcode and toString are automatically created.
// Released in JDK 16.

record  Person (String name, int age, Address address) {};

// Address - firstLine & city
record Address (String firstLine, String city) {};

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

    // @Bean(name = "CustomName")
    @Bean (name = "address2")
    public Address address(){
        return new Address("대흥동","대전");
    }

    @Bean (name = "address3")
    public Address address3(){
        return new Address("Motinagar","Hyderabad");
    }
}
