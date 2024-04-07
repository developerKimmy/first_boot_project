package com.suin_kim.first_boot_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record
// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// Equals, hashcode and toString are automatically created.
// Released in JDK 16.

record  Person (String name, int age) {};

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
        return new Person("Suin Kim", 28);
    }

    @Bean
    public Address address(){
        return new Address("대흥동","대전");
    }
}
