package com.suin_kim.first_boot_project;

import com.suin_kim.first_boot_project.game.GameRunner;
import com.suin_kim.first_boot_project.game.GamingConsole;
import com.suin_kim.first_boot_project.game.Pacman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[]arg){

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
