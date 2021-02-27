package com.lofxve.DesignPattern.FactoryPattern.dome;

import java.math.BigDecimal;
/**
 *  实现创建具体产品对象的操作
 * @ClassName: NumberFactoryImpl
 * @Auther: weizhendong
 * @Date: 20:23 2020/11/15
 **/
public class NumberFactoryImpl implements NumberFactory{
    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
