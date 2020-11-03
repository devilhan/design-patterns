package com.com.devil.runoob.mediator;

import java.util.Date;

/**
 * @author Hanyanjiao
 * @date 2020/11/3
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+"["+user.getName()+"]:"+message);
    }
}
