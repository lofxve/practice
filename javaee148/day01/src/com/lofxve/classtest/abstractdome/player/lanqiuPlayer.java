package com.lofxve.classtest.abstractdome.player;

/**
 * @ClassName lanqiu
 * @Author 魏振东
 * @Date 2020/12/11 15:17
 */
public class lanqiuPlayer extends Player{

    public lanqiuPlayer() {
    }

    public lanqiuPlayer(String name, String age, String sex, String ballage) {
        super(name, age, sex, ballage);
    }

    @Override
    public void work() {
        System.out.println("训练投篮...");
    }
}