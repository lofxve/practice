package com.lofxve.classtest.bigdecimaldome;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ClassName BigDecimalDome
 * @Author 魏振东
 * @Date 2020/12/14 16:04
 */
public class BigDecimalDome {
    public static void main(String[] args) {
        double d1 = 0.09;
        double d2 = 0.01;
        System.out.println(d1 + d2);

        /**
         * 构造方法 new BigDecimal(String)
         **/
        BigDecimal bigDecimal1 = new BigDecimal("0.09");
        BigDecimal bigDecimal2 = new BigDecimal("0.07");

        /**
         * 加
         **/
        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println(add);

        /**
         * 减
         **/
        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println(subtract);

        /**
         * 乘
         **/
        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
        System.out.println(multiply);

        /**
         * 除
         * divisor 除数
         * scale 保留的小数位数
         * RoundingMode 舍入模式
         **/
        BigDecimal divide2 = bigDecimal1.divide(bigDecimal2,2, RoundingMode.HALF_UP);
        System.out.println(divide2);


        /**
         * 四舍五入
         **/
        BigDecimal bigDecimal3 = new BigDecimal("0.26484618461");
        System.out.println(bigDecimal3.setScale(3,RoundingMode.HALF_UP).doubleValue());
    }
}