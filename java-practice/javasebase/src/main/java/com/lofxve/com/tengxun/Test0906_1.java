package com.lofxve.com.tengxun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class Test0906_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = 0;
        LinkedList<ArrayList<Integer>> list = new LinkedList<>();
        for(int i = 0 ;i<m;i++){
            k =input.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0;j<k;j++){
                int p = input.nextInt();
                arr.add(p);
            }
            list.addLast(arr);
        }
//        list.forEach(l->{
//            l.forEach(arr->{
//                System.out.print(arr+" ");
//            });
//            System.out.println();
//        });
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(0);
        int kkk = 0;

        while (!stack.empty()){
            //循环链表，小团队
            for(int i = 0;i<k;i++){
                ArrayList<Integer> l = list.get(i);
//                循环团队
                for(int j = 0;j<l.size();j++){
                    if(l.get(j).equals(stack.peek())){
                        l.remove(j);
                        for(Integer ll:l){
                            stack.push(ll);
                        }
                        stack.pop();
                        kkk++;
                        list.remove(i);
                    }
                }
            }
            stack.pop();
        }

        System.out.println(kkk);
    }
}

//50 5
//2 1 2
//5 10 11 12 13 14
//2 0 1
//2 49 2
//4 6 7 8 2