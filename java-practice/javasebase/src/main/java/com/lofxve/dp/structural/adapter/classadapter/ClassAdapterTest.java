package com.lofxve.dp.structural.adapter.classadapter;

import com.lofxve.dp.structural.adapter.Target;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.adapter
 * @ClassName: ClassAdapterTest
 * @Author: lofxve
 * @Description: 客户端
 * @Date: 2021/4/9 10:13
 * @Version: 1.0
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target classAdapter = new ClassAdapter();
        classAdapter.request();
    }
}
