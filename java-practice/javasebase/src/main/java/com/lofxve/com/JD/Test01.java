package com.lofxve.com.JD;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/27 19:40
 * @Version 1.0
 */
public class Test01 {
    public static HashMap<Character, Integer> map = new HashMap<>();
    static {
        map.put('C', 12);
        map.put('H', 1);
        map.put('O', 16);
        map.put('N', 14);
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int su = 0;
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                su = fun(c, stack.pop());
            } else {
                stack.push(c);
            }

            sum += su;
        }
        while (!stack.isEmpty()) {
            sum += fun('1', stack.pop());
        }
        System.out.println(sum);
    }

    public static int fun(char c, Character pop) {
        return (c-48) * map.get(pop);
    }
}
