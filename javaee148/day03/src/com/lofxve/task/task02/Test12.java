package com.lofxve.task.task02;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ClassName Test12
 * @Author 魏振东
 * @Date 2020/12/14 17:24
 */
public class Test12 {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        BigDecimal bigDecimal = new BigDecimal("0");
        for (double v : arr) {
            bigDecimal = bigDecimal.add(new BigDecimal(v));
        }
        System.out.println(bigDecimal.doubleValue());

        System.out.println(bigDecimal.divide(new BigDecimal(arr.length), 2, RoundingMode.HALF_UP));
    }
}