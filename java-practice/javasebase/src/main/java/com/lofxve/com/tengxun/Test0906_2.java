package com.lofxve.com.tengxun;

import java.util.ArrayList;
import java.util.Scanner;

public class Test0906_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0;i<n;i++){
            int k = input.nextInt();
            arr.add(k);
        }
        int k = 0;
        if((n%2)== 1){
           k = n/2+1;
        }else{
            k = n/2;
        }
        for (int i = 0;i<n;i++){
            int temp = arr.get(i);
            arr.remove(i);
            System.out.println(arr.get(k-1));
            arr.add(i,temp);
        }
    }
}
