package com.lofxve.classtest.datedome;

import java.util.Date;

/**
 * @ClassName DateDome
 * @Author 魏振东
 * @Date 2020/12/14 10:57
 */
public class DateDome {
    public static void main(String[] args) {
        /**
         * 无参数构造方法
         **/
        Date date = new Date();
        // 获取毫秒数
        System.out.println(date.getTime());
        System.out.println(date);

        /**
         * 有参构造方法
         **/
        Date date1 = new Date(10000);
        // 设置毫秒数
        date1.setTime(date.getTime());
        
        
        System.out.println(date1);
    }
}