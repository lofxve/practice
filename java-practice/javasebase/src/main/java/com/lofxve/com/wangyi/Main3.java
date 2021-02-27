package com.lofxve.com.wangyi;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int a = input.nextInt();
            map.put(i+1,a);
        }
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        for (Map.Entry<Integer,Integer> m :map.entrySet()){
            if(m.getValue().equals(stack.peek())){
                stack.push(m.getKey());
            }

        }
    }
}
