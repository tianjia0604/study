package practice_07;

import java.util.Scanner;
/**
 * 最小公倍数
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
 * 设计一个算法，求输入A和B的最小公倍数。
 * 输入描述：
 * 输入两个正整数A和B。
 * 输出描述：
 * 输出A和B的最小公倍数。
 * 示例1:
 * 输入
 * 5 7
 * 输出
 * 35
 */
public class Clm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int m = isMax(n1,n2);
            int isMin = (n1 * n2)/m;
            System.out.println(isMin);
        }
    }
    public static int isMax(int n1,int n2) {
        if(n2 == 0) {
            return n1;
        }
        return isMax(n2,n1%n2);
    }
}
