package com.lofxve.classtest.abstractdome.player;

/**
 * @ClassName pppppjiaolian
 * @Author 魏振东
 * @Date 2020/12/11 15:21
 */
public class pingpangjiaolian extends Player{

    public pingpangjiaolian() {
    }

    public pingpangjiaolian(String name, String age, String sex, String ballage) {
        super(name, age, sex, ballage);
    }

    @Override
    public void work() {
        System.out.println("hujhuuh");
    }
}