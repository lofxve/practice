package com.lofxve.DesignPattern.singleton;

/**
 * @ClassName LanHan
 * @Author lofxve
 * @Date 2021/3/8 21:02
 * @Version 1.0
 */
public class LanHan {
    // 私有变量，不能让用户直接访问
    private static LanHan instance = new LanHan();
    // 私有方法，不能直接让用户创建
    private LanHan() {

    }
    // 提供静态方法，返回定义好的对象
    static LanHan getinstance() {
        return instance;
    }
}
