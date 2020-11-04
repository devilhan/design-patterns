package com.com.devil.runoob.template;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
