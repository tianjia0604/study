package practice_13;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 超长数相加
 * 请设计一个算法完成两个超长正整数的加法。
 * 接口说明
 *
 * 请设计一个算法完成两个超长正整数的加法。
 * 输入参数：
 * String addend：加数
 * String augend：被加数
 * 返回值：加法结果
 *
 * */
public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            BigInteger a = new BigInteger(str1);
            BigInteger b = new BigInteger(str2);
            BigInteger sum = a.add(b);
            System.out.println(sum);
        }
    }
}
