package com.suin_kim.first_boot_project.game;

public class MarioGame implements GamingConsole {

    // sout + tab = System.out.println()

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go into a hole");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Accelerate");
    }
}
