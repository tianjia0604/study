package leetcode8;
/**
 * 268. 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8*/
public class missingNumber {
    public int missingNumber(int[] nums) {
//        排序法
//        Arrays.sort(nums);
//        for(int i = 0;i < nums.length;i++) {
//            if(nums[i] != i) {
//                return i;
//            }
//        }
//        return nums.length;
        //异或
        int res = nums.length;
        for(int i = 0;i < nums.length;i++) {
            res ^= nums[i] ^ i;
        }
        return res;
    }
}
