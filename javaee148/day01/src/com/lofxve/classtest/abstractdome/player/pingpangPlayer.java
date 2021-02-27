package com.lofxve.classtest.abstractdome.player;

/**
 * @ClassName pingpangPlayer
 * @Author 魏振东
 * @Date 2020/12/11 15:20
 */
public class pingpangPlayer extends Player{
    public pingpangPlayer() {
    }

    public pingpangPlayer(String name, String age, String sex, String ballage) {
        super(name, age, sex, ballage);
    }

    @Override
    public void work() {
        System.out.println("训练旋转球..");
    }
}