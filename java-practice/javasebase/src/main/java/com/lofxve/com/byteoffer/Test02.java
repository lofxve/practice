package com.lofxve.com.byteoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 8
 * 0 0 0 0 0 1 0 0
 *
 * @ClassName Test02
 * @Author lofxve
 * @Date 2021/3/14 11:09
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = Integer.valueOf(sc.nextLine());
        List<String> arr = Arrays.asList(sc.nextLine().split(" "));
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (Integer.valueOf(arr.get(i)) == 1) {
                newarr.add(i);
            }
        }
        int max = 0;
        int len = arr.size();
        for (int i = 0; i < len * 2 - 1; i++) {
            for (int j = 0; j < newarr.size(); j++) {
                if (Integer.valueOf(arr.get(i % len)) == 0) {
                    int k = Math.abs(i % len - newarr.get(j)) % N;
                    if (k > max) {
                        max = k;
                    }
                }
            }
        }
        System.out.println(max - 1);
    }
}
