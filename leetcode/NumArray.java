package leetcode8;
/**
 * 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 示例：
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3*/
public class NumArray {
    private int[] sum;
    public void NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for(int i = 0;i < nums.length;i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];

    }
}
