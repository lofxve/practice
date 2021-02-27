package com.lofxve.classtest.datedome;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateFormatDome
 * @Author 魏振东
 * @Date 2020/12/14 11:13
 */
public class DateFormatDome {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // format  Date转String
        System.out.println(simpleDateFormat.format(new Date()));
        // parse   String转Date
        System.out.println(simpleDateFormat.parse("2000年12月14日 11:19:07"));
    }
}