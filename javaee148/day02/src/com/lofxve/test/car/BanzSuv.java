package com.lofxve.test.car;

/**
 * @ClassName BanzSuv
 * @Author 魏振东
 * @Date 2020/12/13 16:17
 */
public class BanzSuv extends CarAndSuv{

    public BanzSuv() {
    }

    public BanzSuv(String pinpai, String type, String color, String price) {
        super(pinpai, type, color, price);
    }

    @Override
    public void run() {
        System.out.println("奔驰suv最高运行时速：190公里");
    }
}