package com.lofxve.task.task02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @ClassName Test03
 * @Author 魏振东
 * @Date 2020/12/14 16:39
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        //获取生日
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生日{yyyy-MM-dd}");
        String birthday = scanner.next();

        // 将生日转换成long
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        long time = simpleDateFormat.parse(birthday).getTime();
        long currentTimeMillis = System.currentTimeMillis();

        if (time>currentTimeMillis){
            System.out.println("生日必须早于当前日期！");
        }else{
            // 输出
            System.out.println((currentTimeMillis - time)/1000/3600/24);
        }
    }
}