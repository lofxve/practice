package com.lofxve.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName DateTest
 * @Author 魏振东
 * @Date 2020/12/14 11:56
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();

        Date old = simpleDateFormat.parse(date);

        Date now = new Date(System.currentTimeMillis() - (1000L * 60 * 60 * 24 * 365 * 2));
        System.out.println(simpleDateFormat.format(now));

        if (old.before(now)) {
            System.out.println("符合要求");
        } else {
            System.out.println("不符合要求");
        }
    }
}