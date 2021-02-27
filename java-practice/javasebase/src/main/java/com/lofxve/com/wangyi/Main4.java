package com.lofxve.com.wangyi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strman = input.nextLine();
        String strwon = input.nextLine();
        String[] man = strman.split(" ");
        String[] won = strwon.split(" ");
        int n = input.nextInt();
        HashMap<String,String> map = new HashMap<>();
        int k = 0;
        for (int i =0;i<n;i++){
            String[] pipei = input.nextLine().split(" ");
            map.put(pipei[0],pipei[1]);
        }
        for (Map.Entry<String,String> m :map.entrySet()){
        }
    }
}
