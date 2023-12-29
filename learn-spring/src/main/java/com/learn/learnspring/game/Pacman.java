package com.learn.learnspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Pacman implements GamingConsole{
    public void up() {
        System.out.println("GO UP");
    }
    public void down() {
        System.out.println("Go Down");
    }
    public void left() {
        System.out.println("Go Left");
    }
    public void right() {
        System.out.println("Go Right");
    }


}
