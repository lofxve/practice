package com.lofxve.algorithrm.offer;

import java.util.Stack;

public class BoFeiNaQieDuiLie {
    public static int fun(int n){
        if(n<=0)
            return 0;
        if(n == 1)
            return 1;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args)
    {
//        Stack<Integer> stack = new Stack<Integer>();
//        for(int i=0;i<8;i++)
//        {
//            stack.push(i);
//        }
//    while(!stack.empty())
//    {
//        System.out.print(stack.pop()+",");
//    }
        for(int i = 0 ; i<10;i++){
            System.out.println(fun(i));
        }

    }
}
