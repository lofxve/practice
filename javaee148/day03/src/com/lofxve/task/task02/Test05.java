package com.lofxve.task.task02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Test05
 * @Author 魏振东
 * @Date 2020/12/14 17:01
 */
public class Test05 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}