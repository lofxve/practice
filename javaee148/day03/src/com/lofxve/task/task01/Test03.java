package com.lofxve.task.task01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Test03
 * @Author 魏振东
 * @Date 2020/12/14 15:05
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse("2018年2月14日");

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        String []arr = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        int i = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(arr[i-1]);
    }
}