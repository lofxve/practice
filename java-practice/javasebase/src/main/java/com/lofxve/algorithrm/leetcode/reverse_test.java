package com.lofxve.algorithrm.leetcode;

public class reverse_test {
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n)+s.substring(0,n);
    }
    
    public static void main(String args[])
    {
        System.out.println(3|9);
    }

}
