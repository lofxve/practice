package com.lofxve.task.task02;

import java.util.Scanner;

/**
 * @ClassName Test04
 * @Author 魏振东
 * @Date 2020/12/15 10:30
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println("输入一个java文件的名字");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if(next.endsWith(".java")){
            System.out.println("合法");
        }else{
            System.out.println("不合法的Email地址");
        }
        System.out.println(next.indexOf("."));
    }
}