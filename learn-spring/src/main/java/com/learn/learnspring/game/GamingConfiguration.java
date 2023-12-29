package com.learn.learnspring.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game=new Pacman();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRun=new GameRunner(game);
        return gameRun;
    }


    //        var game =new Mario();
//        var game =new Pacman();
//    var game =new SuperContra();
//    var gameRunner =new GameRunner(game);
//
//
//        gameRunner.run();
}
