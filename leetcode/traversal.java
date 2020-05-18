package leetcode4tree;

import java.util.*;
//二叉树的前中后序遍历
public class traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //前序遍历  根-左-右
    public List<Integer> preOderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) {
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            res.add(tmp.val);
            if(tmp.right != null) {
                stack.push(tmp.right);
            }
            if(tmp.left != null) {
                stack.push(tmp.left);
            }
        }
        return res;
    }
    //中序遍历  左-根-右
    public List<Integer> inOderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()) {
            if(root != null) {
                stack.add(root);
                root = root.left;
            }else {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
    //后序遍历  左-右-根
    public List<Integer> postOderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) {
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            res.addFirst(tmp.val);
            if(tmp.left != null) {
                stack.push(tmp.left);
            }
            if(tmp.right != null) {
                stack.push(tmp.right);
            }
        }
        return res;
    }
}
