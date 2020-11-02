package com.com.devil.runoob.adapter;

/**
 * @author Hanyanjiao
 * @date 2020/11/2
 */
public class AdapterPatternDemo {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","what makes you beautiful.mp4");
        audioPlayer.play("vlc","love story.vlc");
        audioPlayer.play("avi","loser.avi");
    }
}
