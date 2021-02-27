package com.lofxve.classtest.datedome;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName CalendarDome
 * @Author 魏振东
 * @Date 2020/12/14 14:54
 */
public class CalendarDome {
    public static void show(Calendar c){
        //get
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int h = c.get(Calendar.HOUR);
        int m = c.get(Calendar.MINUTE);
        int s = c.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "日" + h + "时" + m + "分" + s + "秒");
    }
    public static void main(String[] args) {
        /**
        Calendar类中的常用成员方法(重点)
            int get(int field) 返回给定日历字段的值。
            void set(int field, int value) 将给定的日历字段设置为给定值。
            void add(int field, int amount)  把给定的日历字段,增加|减少指定的值
            Date getTime()  把日历转换为日期Date对象
        方法的参数:
            int field:传递指定的日历字段,在Calendar类中被定义为了常量
            年:public final static int YEAR = 1;
            月:public final static int MONTH = 2;
            日:public final static int DATE = 5;
            日:public final static int DAY_OF_MONTH = 5;
            时:public final static int HOUR = 10;
            分:public final static int MINUTE = 12;
            秒:public final static int SECOND = 13;
            星期:public final static int DAY_OF_WEEK = 7;
         */
        // 当前系统时间
        Calendar c = Calendar.getInstance();

        // get
        System.out.println(c.get(Calendar.YEAR));
        // set
        c.set(Calendar.YEAR, 2019);
        show(c);

        // add
        c.add(Calendar.YEAR,1);
        show(c);

        // getDate
        Date time = c.getTime();
        System.out.println();

        /**
         * 月份的显示 0-11
         **/
        c.set(2020, 12-1, 15);
        show(c);
        
        /**
         * 获取星期几
         **/
        String[] arr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        System.out.println(arr[c.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}