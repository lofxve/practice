package com.lofxve.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @ClassName BirthdayDome
 * @Author 魏振东
 * @Date 2020/12/14 11:39
 */
public class BirthdayDome {
    public static void main(String[] args) throws ParseException {
        //获取生日
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生日{yyyy-MM-dd}");
        String birthday = scanner.next();

        // 将生日转换成long
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        long time = simpleDateFormat.parse(birthday).getTime();
        long currentTimeMillis = System.currentTimeMillis();

        // 输出
        System.out.println((currentTimeMillis - time)/1000/3600/24);
//        8119
//        7670
    }
}