package com.lofxve.dp.structural.adapter.objectadapter;

import com.lofxve.dp.structural.adapter.Adaptee;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.adapter.objectadapter
 * @ClassName: ObjectAdapterTest
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 10:25
 * @Version: 1.0
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.request();
    }
}
