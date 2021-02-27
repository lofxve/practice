package com.lofxve.task.task02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @ClassName Test06
 * @Author 魏振东
 * @Date 2020/12/14 17:03
 */
public class Test06 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(simpleDateFormat2.format(simpleDateFormat1.parse(next)));
    }
}