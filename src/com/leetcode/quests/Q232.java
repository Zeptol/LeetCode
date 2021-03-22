package com.leetcode.quests;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 */
public class Q232 {
    public static void main(String[] args) {
        var obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println("obj.pop() = " + obj.pop());
        System.out.println("obj.peek() = " + obj.peek());
        System.out.println("obj.empty() = " + obj.empty());
    }
}

class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!stackOut.isEmpty()) stackIn.push(stackOut.pop());
        stackOut.push(x);
        while (!stackIn.isEmpty()) stackOut.push(stackIn.pop());
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return stackOut.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stackOut.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stackOut.empty();
    }
}