package com.lofxve.task.task02;

import java.util.Calendar;

/**
 * @ClassName Test07
 * @Author 魏振东
 * @Date 2020/12/14 17:06
 */
public class Test07 {
    public static void main(String[] args) {
        //当前系统时间
        Calendar c = Calendar.getInstance();

        //get
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int h = c.get(Calendar.HOUR);
        int m = c.get(Calendar.MINUTE);
        int s = c.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日"+h+"时"+m+"分"+s+"秒");
    }
}