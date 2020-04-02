package practice_23;

/**
 * 二叉树平衡检查
 * 实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不
 * 超过1。
 * 给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
 * 输入描述：
 * 输出描述：
 * 示例1:
 * 输入
 * 输出*/
public class Balance {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null) {
            return true;
        }
        int left = help(root.left);
        int right = help(root.right);
        if(Math.abs(left - right) > 1) {
            return false;
        }else {
            return isBalance(root.left) && isBalance(root.right);
        }
    }
    public int help(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(help(root.left) ,help(root.right)) + 1;
    }
}