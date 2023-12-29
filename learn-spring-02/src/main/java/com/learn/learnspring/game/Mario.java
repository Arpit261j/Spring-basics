package com.learn.learnspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole{
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Sit");
    }
    public void left() {
        System.out.println("Go left");
    }
    public void right() {
        System.out.println("Go right");
    }
}
