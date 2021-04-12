package com.lofxve.dp.structural.facade;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.facade
 * @ClassName: Facade
 * @Author: lofxve
 * @Description: 外观角色
 * @Date: 2021/4/12 10:45
 * @Version: 1.0
 */
public class Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
