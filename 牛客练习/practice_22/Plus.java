package practice_22;

import java.util.*;
/**
 * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表的首部。
 * 编写函数对这两个整数求和，并用链表形式返回结果。
 * 给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。
 * 测试样例：
 * {1,2,3},{3,2,1}
 * 返回：{4,4,4}
 * 输入描述：
 * 输出描述：
 * 示例1:
 * 输入
 * 输出
 */

public class Plus {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode list = new ListNode(0);
        ListNode p = list;
        int i = 0;
        while (a != null || b != null || i != 0) {
            ListNode s = new ListNode(0);
            s.val = s.val + i;
            if(a != null) {
                s.val += a.val;
                a = a.next;
            }
            if(b != null) {
                s.val += b.val;
                b = b.next;
            }
            if(s.val > 9) {
                i = 1;
                s.val -= 10;
            }else {
                i = 0;
            }
            p.next = s;
            p = p.next;
        }
        return list.next;
    }
}