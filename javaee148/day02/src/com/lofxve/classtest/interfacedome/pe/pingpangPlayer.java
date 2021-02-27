package com.lofxve.classtest.interfacedome.pe;

/**
 * @ClassName pingpangPlayer
 * @Author 魏振东
 * @Date 2020/12/11 15:20
 */
public class pingpangPlayer extends Player implements Say {
    public pingpangPlayer() {
    }

    public pingpangPlayer(String name, String age, String sex, String ballage) {
        super(name, age, sex, ballage);
    }


    @Override
    public void sayEenglish() {
        System.out.println("乒乓球运动员说英语");
    }
}