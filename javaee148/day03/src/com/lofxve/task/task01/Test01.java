package com.lofxve.task.task01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Test03
 * @Author 魏振东
 * @Date 2020/12/14 14:10
 */
public class Test01 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}