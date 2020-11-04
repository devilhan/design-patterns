package com.com.devil.runoob.template;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Started.Enjoy the game.");
    }
}
