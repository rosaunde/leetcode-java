package easy;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    public Queue<Integer> myq;

    /** Initialize your data structure here. */
    public MyStack() {
        myq = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> myq2 = new LinkedList<>();
        myq2.add(x);
        while(!(myq.size() == 0)){
            int current=myq.poll();
            myq2.add(current);
        }
        myq=myq2;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return myq.poll();
    }

    /** Get the top element. */
    public int top() {
        return myq.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return myq.size() ==0;
    }
}