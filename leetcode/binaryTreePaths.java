package leetcode4tree;

import java.util.LinkedList;
import java.util.List;
/**
 * 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3*/
public class binaryTreePaths {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        helpPaths(root,"",paths);
        return paths;
    }

    private void helpPaths(TreeNode root, String s, LinkedList<String> paths) {
        if(root != null) {
            s += Integer.toString(root.val);
            if(root.left == null && root.right == null) {
                paths.add(s);
            }else {
                s += "->";
                helpPaths(root.left,s,paths);
                helpPaths(root.right,s,paths);
            }
        }
    }
}
