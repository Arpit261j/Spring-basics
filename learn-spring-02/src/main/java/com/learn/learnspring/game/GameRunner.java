package com.learn.learnspring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

//    Mario game;
//    SuperContra game;

    GamingConsole game;
    @Autowired
    public GameRunner(GamingConsole game) {
        System.out.println("#@$%#$@#@$#$@#$@");
        this.game=game;
    }

    public void run() {
        System.out.println("Running game " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
