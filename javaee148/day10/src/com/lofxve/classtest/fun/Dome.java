package com.lofxve.classtest.fun;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/22 15:44
 */
public class Dome {
    public static void main(String[] args) {
        System.out.println(jieCheng(5));
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }

    public static int jieCheng(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getSum(n - 1);
    }
    private static int boFei(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return boFei(i - 1) + boFei(i - 2);
    }
}