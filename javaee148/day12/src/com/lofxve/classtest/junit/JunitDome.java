package com.lofxve.classtest.junit;

import org.junit.*;

/**
 * 只有被@Test注解的方法才能被运行
 * 只有public修饰时的才能被运行
 * 不能传入参数
 *
 * beforeClass 、afterClass 用于修饰静态方法
 */
public class JunitDome {
    /**
     * Junit单元测试,只能运行public修饰的,没有参数,没有返回值的非静态方法
     */
    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass方法!");
    }

    @Before
    public void Before() {
        System.out.println("Before");
    }

    @Test
    public void show01() {
        System.out.println("show01方法!");
    }

    @Test
    public void show02() {
        System.out.println("show02方法!");
    }

    @Test
    public void show03() {
        System.out.println("show03方法!");
    }

    @After
    public void After() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass方法!");
    }
}
