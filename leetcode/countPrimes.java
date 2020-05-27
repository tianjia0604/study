package leetcode5;
/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。*/
public class countPrimes {
    public int countPrimes(int n) {
        int result = 0;
        boolean[] b = new boolean[n];
        if(2 < n) {
            result++;
        }

        for(int i = 3; i < n; i += 2){
            if(!b[i]){
                for(int j = 3; i * j < n; j += 2){
                    b[i * j] = true;
                }
                result++;
            }
        }
        return result;
    }
}
