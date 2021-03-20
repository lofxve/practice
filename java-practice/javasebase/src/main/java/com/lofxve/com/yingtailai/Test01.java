package com.lofxve.com.yingtailai;

import java.util.Scanner;

/**
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/17 19:04
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        if (n<=0){
            System.out.println(0);
        }else {
            while (n>0){
                n -=i;
                i++;
                if(n<i){
                    break;
                }
            }
            System.out.println(i-1);
        }
    }
}
