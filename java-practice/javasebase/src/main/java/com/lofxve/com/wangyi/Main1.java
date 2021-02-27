package com.lofxve.com.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int k = 0;
        HashMap<Integer,String> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int x = input.nextInt();
            String str = input.next();
            int y = input.nextInt();
            if(x>m||y>m){
                break;
            }
            if(map.getOrDefault(x,str)!=str){
                k++;
            }
            map.put(x,str);
        }
        System.out.println(k);
    }
}
