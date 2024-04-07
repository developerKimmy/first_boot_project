package com.suin_kim.first_boot_project;

import com.suin_kim.first_boot_project.game.GameRunner;
import com.suin_kim.first_boot_project.game.MarioGame;
import com.suin_kim.first_boot_project.game.Pacman;
import com.suin_kim.first_boot_project.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[]arg){
        // var: allows user to declare variable without specifying its type
        // to import class, press alt and enter (alt + enter)
//        var marioGame = new MarioGame();
//        var game = new SuperContraGame();
//        var game = new MarioGame();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);

        // to create a method, mouseOver where its needed and click the button to create the method.
        gameRunner.run();
    }
}
