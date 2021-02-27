package com.lofxve.classtest.interfacedome.pe;

/**
 * @ClassName pppppjiaolian
 * @Author 魏振东
 * @Date 2020/12/11 15:21
 */
public class pingpangjiaolian extends Player implements Say {

    public pingpangjiaolian() {
    }

    public pingpangjiaolian(String name, String age, String sex, String ballage) {
        super(name, age, sex, ballage);
    }

    @Override
    public void sayEenglish() {
        System.out.println("乒乓球教练说英语");
    }
}