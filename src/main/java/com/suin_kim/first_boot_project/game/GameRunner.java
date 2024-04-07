package com.suin_kim.first_boot_project.game;

public class GameRunner{

    // I have added static key word to variable.
    // which solved the error, but I have no idea why it caused such error and why it has fixed...

    private static GamingConsole game;
    // private MarioGame game

    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public static void run() {
        System.out.println("Running game : " +  game);

        game.up();
        game.down();
        game.left();
        game.right();
    }
}
