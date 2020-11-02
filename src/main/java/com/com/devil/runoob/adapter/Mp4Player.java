package com.com.devil.runoob.adapter;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file name : "+fileName);
    }
}
