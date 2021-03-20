package com.lofxve.com.yingtailai;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName Test02
 * @Author lofxve
 * @Date 2021/3/17 19:16
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        BigDecimal sum = new BigDecimal("0");
        Stack<BigDecimal> stackNum = new Stack<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > '0' && c < '9') {
                stackNum.push(new BigDecimal(c+""));
            }else{
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            sum = stackNum.pop();
            Character pop = stack.pop();
            switch (pop){
                case '*':
                    sum = sum.multiply(stackNum.pop());
                    stackNum.push(sum);
                    break;
                case '/':
                    sum = sum.divide(stackNum.pop());
                    stackNum.push(sum);
                    break;
                case '+':
                    sum = sum.add(stackNum.pop());
                    stackNum.push(sum);
                    break;
                case '-':
                    sum = sum.subtract(stackNum.pop());
                    stackNum.push(sum);
                    break;
            }
        }
        System.out.println(stackNum.pop().setScale(0));
    }
}
