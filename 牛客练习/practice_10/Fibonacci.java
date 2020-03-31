package practice_10;

import java.util.Scanner;
/**
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。给你一
 * 个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少
 * 需要多少步可以变为Fibonacci数。
 * 输入描述：
 * 输入为一个正整数N(1 ≤ N ≤ 1,000,000)
 * 输出描述：
 * 输出一个最小的步数变为Fibonacci数"
 * 示例1:
 * 输入
 * 15
 * 输出
 * 2*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(step(n));
        }
    }
    public static int step(int num) {
        int i = 0;
        int leftstep = 0;
        int rightstep = 0;
        while(true) {
            if(Fibonacci(i) < num) {
                leftstep = num - Fibonacci(i);
            }else {
                rightstep = Fibonacci(i) - num;
                break;
            }
            i++;
        }
        if(leftstep < rightstep) {
            return leftstep;
        }
        return rightstep;
    }
    public static int Fibonacci(int n) {
        if(n == 0) {
            return 0;
        }else if(n == 1) {
            return 1;
        }else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }


    }
}
