package com.lofxve.algorithrm.offer;
import java.util.Stack;
public class TwoStackToQueue {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if(stack2.size()<=0)
            {
                while(stack1.size()>0)
                {
                    stack2.push(stack1.pop());
                }
            }
            else if(stack2.size()==0)
            {
                return -1;
            }
            return stack2.pop();
        }
        public int peek(){
            if(stack2.size()<=0)
            {
                while(stack1.size()>0)
                {
                    stack2.push(stack1.pop());
                }
            }
            else if(stack2.size()==0)
            {
                return -1;
            }
            return stack2.peek();
        }
        public boolean empty() {
            if (stack1.isEmpty() && stack2.isEmpty())
                return true;
            else
                return false;
        }

    public static void main(String[] args) {
        TwoStackToQueue queue = new TwoStackToQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
