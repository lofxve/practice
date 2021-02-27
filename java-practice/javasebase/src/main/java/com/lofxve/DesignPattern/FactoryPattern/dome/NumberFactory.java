package com.lofxve.DesignPattern.FactoryPattern.dome;
/**
 *  创建抽象产品对象操作接口
 * @ClassName: NumberFactory
 * @Auther: weizhendong
 * @Date: 20:22 2020/11/15
 **/
public interface NumberFactory {
    // 创建方法:
    Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }
    static NumberFactory impl = (NumberFactory) new NumberFactoryImpl();
}
