package com.learn.learnspring;

import com.learn.learnspring.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        try(var context=
                    new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

//            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }



    }
}
