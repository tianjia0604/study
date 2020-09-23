package leetcode1;
/**
 * 子树的权重
 * 首先按照从上到下，从左到右的顺序输入一棵满二叉树中的每一个节点对应
 * 一个权重，例如输入1、1、2表示二叉树的根节点的权重为1，它的左、右两个
 * 子节点的权重分别是1和2.
 * 然后判断该满二叉树中是否存在这样的非叶子节点：它的左子树上所有结点的
 * 权重之和等于右子树上所有结点的权重之和
 * 现在给你一棵满二叉树的所有结点的权重，请编写一个程序，寻找是否存在满足要求
 * 的非叶子节点，如果存在输出 “Yes” ,否则输出 “No”
 * 样例描述：
 * 3
 * 1 2 2 1 2 1 2
 * 1 2 2 1 3 2 2
 * 1 2 2 1 2 1 3
 * 样例输出：
 * Yes
 * Yes
 * No
 * */
import java.util.Scanner;
public class subtreeWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < x; i++) {
            String[] arr = sc.nextLine().trim().split(" ");
            int[] num = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                num[j] = Integer.parseInt(arr[j]);
            }
            boolean tmp = false;
            for (int j = num.length / 2 - 1; j >= 0; j--) {
                int num1 = help(num, j * 2 + 1);
                int num2 = help(num, j * 2 + 2);
                if (num1 != Integer.MIN_VALUE && num2 != Integer.MIN_VALUE) {
                    if (num1 == num2) {
                        tmp = true;
                        System.out.println("Yes");
                        break;
                    }
                }
            }
            if (!tmp) {
                System.out.println("No");
            }
        }
    }
    private static int help(int[] ints, int i) {
        if (i >= ints.length) {
            return Integer.MIN_VALUE;
        }
        int ans = ints[i];
        int nums1 = help(ints, i * 2 + 1);
        int nums2 = help(ints, i * 2 + 2);
        if (nums1 != Integer.MIN_VALUE) {
            ans += nums1;
        }
        if (nums2 != Integer.MIN_VALUE) {
            ans += nums2;
        }
        return ans;
    }
}