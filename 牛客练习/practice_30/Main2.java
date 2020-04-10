package practice_30;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/5 21:25
 */
/**
 * 大整数排序
 *
 * 输入第一行为一个整数N，(1<=N<=100)。
 * 接下来的N行每行有一个数，数的长度范围为1<=len<=1000。
 * 每个数都是一个正数，并且保证不包含前缀零。
 *
 * 可能有多组测试数据，对于每组数据，
 * 将给出的N个数从小到大进行排序，输出排序后的结果，每个数占一行。
 * */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            BigInteger[] num = new BigInteger[n];
            for(int i = 0;i < n;i++) {
                num[i] = sc.nextBigInteger();
            }
            Arrays.sort(num);
            for(int i = 0;i < n;i++) {
                System.out.println(num[i]);
            }
        }
    }
}
