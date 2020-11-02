package com.com.devil.runoob.adapter;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
