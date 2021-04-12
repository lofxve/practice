package com.lofxve.dp.structural.facade;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.facade
 * @ClassName: FacadePattern
 * @Author: lofxve
 * @Description: 外观模式
 * @Date: 2021/4/12 10:47
 * @Version: 1.0
 */
public class FacadePattern {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
