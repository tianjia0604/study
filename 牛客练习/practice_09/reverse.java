package practice_09;

import java.util.Scanner;
/**
 * 数字颠倒
 * 描述：
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * 输入描述：
 * 输入一个int整数
 * 输出描述：
 * 将这个整数以字符串的形式逆序输出
 * 示例1:
 * 输入
 * 1516000
 * 输出
 * 0006151*/
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            String str = String.valueOf(n);
            int reverseNum = 0;
            for(int i = 0;i < str.length();i++) {
                reverseNum = reverseNum * 10 + n % 10;
                n /= 10;
            }
            System.out.println(reverseNum);
        }
    }
}
