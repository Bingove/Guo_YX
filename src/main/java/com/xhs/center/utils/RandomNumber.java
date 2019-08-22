package com.xhs.center.utils;

import java.util.Random;

/**
 * @Author 常冬军
 * @Date 2018/11/5 0005下午 18:29
 */
public class RandomNumber {
    public static String getRandom() {
        Random rand=new Random();//生成随机数
        String cardNumber="1";
        for(int a=0;a<10;a++){
            cardNumber+=rand.nextInt(10);//生成6位数字
        }
        return cardNumber;
    }
}
