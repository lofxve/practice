package com.lofxve.task.task02;

import java.util.Calendar;

/**
 * @ClassName Test08
 * @Author 魏振东
 * @Date 2020/12/14 17:09
 */
public class Test08 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1949, 10, 1);
        String[] arr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        System.out.println(arr[c.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}