package leetcode7;
/**
 * 342. 4的幂
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 16
 * 输出: true
 * 示例 2:
 *
 * 输入: 5
 * 输出: false*/
public class isPowerOfFour {
    public boolean isPowerOfFour(int num) {
        // if(num < 1) {
        //     return false;
        // }
        // while(num % 4 == 0) {
        //     num /= 4;
        // }
        // return num == 1;
        return (num > 0) && ((num & (num - 1)) == 0) && (num % 3 == 1);
    }
}
