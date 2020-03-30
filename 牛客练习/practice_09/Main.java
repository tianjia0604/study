package practice_09;

import java.util.Scanner;

/**
 * 末尾0的个数
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 * 输入描述：
 * 输入为一行，n(1 ≤ n ≤ 1000)
 * 输出描述：
 * 输出一个整数,即题目所求
 * 示例1:
 * 输入
 * 10
 * 输出
 * 2*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = 1;
            for (int i = 1; i <= n; i++) {
                num *= i;
            }
            int count = 0;
            String str = String.valueOf(num);
            char[] arr = str.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != '0') {
                    break;
                }
                count++;
            }
            System.out.println(count);
        }
    }

}