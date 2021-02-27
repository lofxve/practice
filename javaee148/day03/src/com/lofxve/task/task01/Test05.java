package com.lofxve.task.task01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName Test05
 * @Author 魏振东
 * @Date 2020/12/14 14:24
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
//        "2014年09/28 23时13分01秒"
//        "2009-02月12日 12时02分01秒"

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM/dd HH时mm分ss秒");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM月dd日 HH时mm分ss秒");
        String str1 = "2014年09/28 23时13分01秒";
        String str2 = "2009-02月12日 12时02分01秒";
        long time1 = simpleDateFormat1.parse(str1).getTime();
        long time2 = simpleDateFormat2.parse(str2).getTime();

        long day = Math.abs(time1 - time2) / 1000 / 3600 / 24;
        System.out.println(day);
    }
}