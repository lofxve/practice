package com.lofxve.task.task02;

import java.util.Scanner;

/**
 * @ClassName Test03
 * @Author 魏振东
 * @Date 2020/12/15 10:28
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("Email地址");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if(next.contains("@")){
            System.out.println("合法");
        }else{
            System.out.println("不合法的Email地址");
        }
    }
}