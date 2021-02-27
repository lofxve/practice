package com.lofxve.test.car;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 16:21
 */
public class Dome {
    public static void main(String[] args) {
//        BanzCars banzCars = new BanzCars();
//        banzCars.run();
//
//        BMWSuv bmwSuv = new BMWSuv();
//        bmwSuv.run();
//        bmwSuv.gps();
//
//        Sales sales = new Sales();
//        sales.sell(new BanzCars("奔驰","s1","白色","24w"));
//        sales.sell(new BanzSuv("奔驰","s5","黑色","96w"));
//        sales.sell(new BWMcars("宝马","k8","白色","58w"));
//        sales.sell(new BMWSuv("宝马","k120","粉色","32w"));

        new CarAndSuv(){
            @Override
            public void run() {
                System.out.println(this.getPinpai());
            }
        }.setPinpai("sss");
    }
}