package com.lofxve.test.car;

/**
 * @ClassName BanzCars
 * @Author 魏振东
 * @Date 2020/12/13 16:15
 */
public class BanzCars extends CarAndSuv {

    public BanzCars() {
    }

    public BanzCars(String pinpai, String type, String color, String price) {
        super(pinpai, type, color, price);
    }

    @Override
    public void run() {
        System.out.println("奔驰轿车最高运行时速：200公里");
    }
    
}