package com.lofxve.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @ClassName DateFormatTest
 * @Author 魏振东
 * @Date 2020/12/14 11:52
 */
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
//        2020年10月03日
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);

        String date = scanner.next();

        System.out.println(simpleDateFormat1.format(simpleDateFormat.parse(date)));
    }
}