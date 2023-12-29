package com.learn.learnspring.game;

public class GameRunner {

//    Mario game;
//    SuperContra game;

    GamingConsole game;
    public GameRunner(GamingConsole game) {
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
