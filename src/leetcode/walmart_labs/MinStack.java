package leetcode.walmart_labs;

import java.util.Stack;

public class MinStack {
    /**
     * https://leetcode.com/problems/min-stack/*/

    Stack<Integer> stack;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            int elm = minStack.pop();
            if(elm < x){
                minStack.push(x);
                minStack.push(elm);
            }else{
                minStack.push(elm);
                minStack.push(x);
            }
        }

    }

    public void pop() {
        Integer elem = stack.pop();
        minStack.removeElement(elem);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
