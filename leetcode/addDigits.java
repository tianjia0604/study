package leetcode7;
/**
 * 258. 各位相加
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。*/
public class addDigits {
    //递归
    public int addDigits(int num) {
        int res = 0;
        while(num != 0) {
            res += num % 10;
            num /= 10;
        }
        if(res % 10 == res) {
            return res;
        }else {
            return addDigits(res);
        }

    }
    //数学推理
    public int addDigits2(int num) {
        if(num > 9) {
            num = num % 9;
            if(num == 0) {
                return 9;
            }
        }
        return num;
    }
}