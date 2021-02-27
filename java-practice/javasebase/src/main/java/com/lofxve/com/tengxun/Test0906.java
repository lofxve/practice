package com.lofxve.com.tengxun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 *
 * */
public class Test0906 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for(int i = 0;i<n;i++){
            int k = input.nextInt();
            list1.addLast(k);
        }
        int m = input.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int j = 0;j<m;j++){
            int k = input.nextInt();
            list2.addLast(k);
        }
        LinkedList<Integer> list3 = new LinkedList<>();
        for (int i = 0,j = 0;i<n&&j<m;i++,j++){
            if(list1.get(i).equals(list2.get(j))){
                list3.addLast(list1.get(i));
            }else {
                if(m>n){
                    j++;
                }else {
                    i++;
                }
                if(list1.get(i).equals(list2.get(j))){
                    list3.addLast(list1.get(i));
                }
            }
        }
        list3.forEach(l->{
            System.out.print(l+" ");
        });
    }
}
