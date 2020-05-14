package leetcode4;
/**
 * 101. 对称二叉树
 *  给定一个二叉树，检查它是否是镜像对称的。
 *
 *
 *
 *  例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *      1
 *     / \
 *    2   2
 *   / \ / \
 *  3  4 4  3
 *
 *
 *  但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *    1
 *   / \
 *  2   2
 *   \   \
 *    3   3*/
public class isSymmetric {
    public class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isHelp(root.left,root.right);
    }
    private boolean isHelp(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        }
        return isHelp(left.left,right.right) && isHelp(left.right,right.left);
    }
}
