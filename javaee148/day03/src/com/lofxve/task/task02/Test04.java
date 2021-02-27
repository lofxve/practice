package com.lofxve.task.task02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @ClassName Test04
 * @Author 魏振东
 * @Date 2020/12/14 16:59
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        //获取生日
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生日{yyyy-MM-dd}");
        String birthday1 = scanner.next();
        String birthday2 = scanner.next();

        // 将生日转换成long
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (simpleDateFormat.parse(birthday1).before(simpleDateFormat.parse(birthday2))){
            System.out.println("第一个生日大于第二个生日");
        }else{
            System.out.println("第一个生日小于第二个生日");
        }
    }
}