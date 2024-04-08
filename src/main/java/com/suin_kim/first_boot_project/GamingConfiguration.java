package com.suin_kim.first_boot_project;

import com.suin_kim.first_boot_project.game.GameRunner;
import com.suin_kim.first_boot_project.game.GamingConsole;
import com.suin_kim.first_boot_project.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new Pacman();
        return game;
    }

    @Bean
    public GameRunner gameRunner(){
        // 위에 게임 함수가 있기 때문에 따료 생성할 필요 없음
//        var game = new Pacman();
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
}
