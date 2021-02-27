package com.lofxve.task.task01;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ClassName Test08
 * @Author 魏振东
 * @Date 2020/12/14 14:27
 */
public class Test08 {
    public static void main(String[] args) {
        String[] nums = {"3.22", "8.1", "7", "2.5", "3.1", "7.77", "8.0", "9.21" };
        BigDecimal count = new BigDecimal(0);

        for (String num : nums) {
            count = count.add(new BigDecimal(num));
        }
        BigDecimal divide = count.divide(new BigDecimal(nums.length));

        double value = divide.setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println(value);
    }
}