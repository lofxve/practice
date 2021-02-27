package com.lofxve.test.car;

/**
 * @ClassName BWMcars
 * @Author 魏振东
 * @Date 2020/12/13 16:16
 */
public class BWMcars extends CarAndSuv implements BMW {

    public BWMcars() {
    }

    public BWMcars(String pinpai, String type, String color, String price) {
        super(pinpai, type, color, price);
    }

    @Override
    public void gps() {
        System.out.println("缺德地图为你导航");
    }

    @Override
    public void run() {
        System.out.println("宝马轿车最高运行时速：230公里");
    }
}