package com.lofxve.classtest.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/31 16:10
 * @Version 1.0
 */
public class Dome {
    /**
     * 模拟单元测试的Junit的@Test注解
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 获取class文件对象
        Class clazz = Class.forName("com.lofxve.classtest.test.MyTestDome");
        // 实例化对象
        Object o = clazz.newInstance();
        // 获取对象中所有方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        // 遍历方法
        for (Method declaredMethod : declaredMethods) {
            // 如果被MyTest.class注解注释过
            if (declaredMethod.isAnnotationPresent(MyTest.class)){
                // 使用invoke运行方法
                declaredMethod.invoke(o);
            }
        }
    }
}