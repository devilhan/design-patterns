package com.com.devil.runoob.template;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class Cricket extends Game {
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Started .Enjoy the game");
    }
}
