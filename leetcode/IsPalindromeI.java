package leetcode6ListNode;
/**
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true*/
public class IsPalindromeI {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode reverseNode = reverse(head);
        while (head != null) {
            if (head.val != reverseNode.val) {
                return false;
            }
            head = head.next;
            reverseNode = reverseNode.next;
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode result = null;
        while (node != null) {
            ListNode temp = new ListNode(node.val);
            temp.next = result;
            result = temp;
            node = node.next;
        }
        return result;
    }
}
