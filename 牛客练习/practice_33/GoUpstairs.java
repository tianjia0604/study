package practice_33;

/**
 * @Author：Tina
 * @Date：2020/4/9 23:31
 */
import java.util.*;
/**
 * 上楼梯
 * 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。
 * 请实现一个方法，计算小孩有多少种上楼的方式。
 * 为了防止溢出，请将结果Mod 1000000007
 * 给定一个正整数int n，请返回一个数，代表上楼的方式数。
 * 保证n小于等于100000。
 */

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        int[] num = new int[100000];
        num[1] = 1;
        num[2] = 2;
        num[3] = 4;
        for(int i = 4;i <= n;i++) {
            num[i] = (num[i - 1] + (num[i - 2] + num[i - 3])%1000000007) % 1000000007;
        }
        return num[n];
    }
}