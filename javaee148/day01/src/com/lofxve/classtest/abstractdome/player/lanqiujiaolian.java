package com.lofxve.classtest.abstractdome.player;

/**
 * @ClassName lanqiujiaolian
 * @Author 魏振东
 * @Date 2020/12/11 15:21
 */
public class lanqiujiaolian extends Player{
    public lanqiujiaolian() {
    }

    public lanqiujiaolian(String name, String age, String sex, String ballage) {
        super(name, age, sex, ballage);
    }

    @Override
    public void work() {
        System.out.println("ddddddd");
    }
}