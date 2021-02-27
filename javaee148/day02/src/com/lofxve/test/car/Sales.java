package com.lofxve.test.car;

/**
 * @ClassName Sales
 * @Author 魏振东
 * @Date 2020/12/13 16:19
 */
public class Sales {
    public void sell(CarAndSuv carAndSuv){
        System.out.println("我销售车的信息如下：");
        System.out.println(carAndSuv);
        carAndSuv.run();
    }
}