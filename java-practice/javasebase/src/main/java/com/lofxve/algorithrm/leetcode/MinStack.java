package com.lofxve.algorithrm.leetcode;


import java.util.Stack;
/***
 * @Author weizhendong
 * @Description //TODO 最小栈
 * @Date 9:32 2020/9/15
 * @Param 
 * @return 
 **/
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack(){
        stack =  new Stack<Integer>();
        minstack = new Stack<Integer>();
    }
    public void push(int x) {
        stack.push(x);
        if (minstack.size()==0){
            minstack.push(x);
        }else{
            if(minstack.peek()<x){
                minstack.push(minstack.peek());
            }else{
                minstack.push(x);
            }
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
