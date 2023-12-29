package com.learn.learnspring.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class BusinessLauncher {
    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext(BusinessLauncher.class)) {
            System.out.println(
                    context.getBean(BusinessCalculationService.class).findMax()
            );
        }


    }
}
