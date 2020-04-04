package practice_20;

import java.util.*;
/**链表分割
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 * 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的
 * 数据顺序不变。
 */
public class Partition {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode cur = pHead;
        //定义2个链表，此处Shead Bhead两个头指针
        ListNode Shead = new ListNode(-1);
        ListNode Bhead = new ListNode(-1);
        ListNode Stmp = Shead;
        ListNode Btmp = Bhead;
        while (cur != null) {
            if (cur.val < x) {//值小于x的节点
                Stmp.next = new ListNode(cur.val);
                Stmp = Stmp.next;
            } else {//值大于等于x的节点
                Btmp.next = new ListNode(cur.val);
                Btmp = Btmp.next;
            }
            cur = cur.next;
        }
        //第1个链表的头
                cur = Shead;
        //循环遍历找到第1个链表的尾
        while (cur.next != null && cur.next.val != -1) {
            cur = cur.next;
        }
        //cur的next指向第2个节点的next(非头节点)
        //相当于将第1个链表和第2个链表连接
        cur.next = Bhead.next;
        return Shead.next;//返回第1个节点next(不含头节点)
    }
}