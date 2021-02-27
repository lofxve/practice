package com.lofxve.algorithrm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/***
 * @Author weizhendong
 * @Description //TODO 堆盘子
 * @Date 10:44 2020/9/15
 * @Param 
 * @return 
 **/
public class StackOfPlates {

    private List<Stack<Integer>> list;
//    每个盘子所能容纳的最大值
    private int cap;

    public StackOfPlates(int cap) {
        this.list = new ArrayList<Stack<Integer>>();
        this.cap = cap;
    }

    public void push(int val) {
        if (this.cap<=0)
            return;
//        如果整个表为空或者列表的最后一个栈超出盘子所能容纳的最大值，则新建一个栈添加到列表中
        if(this.list.isEmpty() || this.list.get(this.list.size()-1).size()>=this.cap){
            this.list.add(new Stack<Integer>());
        }
        Stack<Integer> stack = this.list.get(this.list.size()-1);
        stack.push(val);
    }

    public int pop() {
        if(this.list.size() <= 0) {
            return  -1;
        }
        Stack<Integer> stack = this.list.get(this.list.size() - 1);
        Integer pop = stack.pop();
        if (stack.isEmpty()) {
            this.list.remove(this.list.size() - 1);
        }
        return pop;
    }

    public int popAt(int index) {
        if(this.list.size() <= 0 || index > this.list.size() - 1) {
            return  -1;
        }
        Stack<Integer> stack = this.list.get(index);
        Integer temp = stack.pop();
        if (stack.isEmpty()){
            this.list.remove(index);
        }
        return temp;
    }
    public void all(){
        this.list.forEach(s->{
            while (!s.isEmpty()){
                System.out.println(s.pop());
            }
            System.out.println();
        });
    }

    public static void main(String[] args) {
        StackOfPlates stackOfPlates = new StackOfPlates(5);
        for (int i = 0 ;i<20;i++){
            stackOfPlates.push(i);
        }
        stackOfPlates.all();
    }
}
