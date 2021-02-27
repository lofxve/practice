package com.lofxve.task.task01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName Test02
 * @Author 魏振东
 * @Date 2020/12/14 14:12
 */
public class Test02 {
    public static void main(String[] args) throws ParseException {
        //        2020年10月03日
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2018-03-04";

        System.out.println(simpleDateFormat.format(simpleDateFormat1.parse(date)));
    }
}