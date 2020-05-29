package leetcode7;

import java.util.Stack;
/**
 * 232. 用栈实现队列
 * 使用栈实现队列的下列操作：
 *
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 * 示例:
 *
 * MyQueue queue = new MyQueue();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // 返回 1
 * queue.pop();   // 返回 1
 * queue.empty(); // 返回 false*/
public class MyQueue {
    private Stack<Integer> a;
    private Stack<Integer> b;
    /** Initialize your data structure here. */
    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        a.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(b.isEmpty()) {
            if(!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(b.isEmpty()) {
            while(!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}
