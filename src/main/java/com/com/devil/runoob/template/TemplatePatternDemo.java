package com.com.devil.runoob.template;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new Cricket();
        game.play();
        System.out.println("==================");
        game = new Football();
        game.play();
    }
}
