package practice_45;

/**
 * @Author：Tina
 * @Date：2020/4/22 23:15
 */
import java.util.Stack;
/**
 * 包含min函数的栈
 * 题目描述：输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    //弄一个最小值栈 即可
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
        //更新 min栈
        if(minStack.isEmpty() || minStack.peek() >= node) {
            minStack.push(node);
        }
    }
    public void pop() {
        if(minStack.peek().equals(stack.peek())) {
            minStack.pop();
        }
        stack.pop();

    }
    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
