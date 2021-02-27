package com.lofxve.task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Task02
 * @Author com.lofxve
 * @Date 2020/12/17 15:41
 */
public class Task02 {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(88.5, 39.2, 77.1, 56.8, 89.0, 99.0, 59.5);
        //使用增强for遍历所有元素，并打印
        for (Double aDouble : doubles) {
            System.out.println(aDouble);
        }
        //使用增强for遍历所有元素，打印不及格的分数；
        for (Double aDouble : doubles) {
            if (aDouble<60){
                System.out.println(aDouble);
            }
        }
        //使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        BigDecimal sum = new BigDecimal("0.0");
        int count = 0;
        for (Double aDouble : doubles) {
            if (aDouble<60){
                sum = sum.add(new BigDecimal(aDouble));
                count++;
            }
        }
        System.out.println("总分:"+sum.doubleValue()+"  平均分"+sum.divide(new BigDecimal(count),2, RoundingMode.HALF_UP));
        //使用增强for遍历所有元素，求出最高分，并打印；
        double max = 0.0;
        for (Double aDouble : doubles) {
            max = aDouble>max?aDouble:max;
        }
        System.out.println(max);
    }
}