package com.learn.learnspring.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){}

record Address (String firstline, String city) {}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name () {
        return "Arpit";
    }

    @Bean
    public int age () {
        return 25;
    }

    @Bean
    public Person person() {
        var person= new Person("Ravi", 50);
        return person;
    }
    @Bean
    Address address () {
        var address=new Address ("Jankipuram", "Lucknow");
        return address;
    }

}
