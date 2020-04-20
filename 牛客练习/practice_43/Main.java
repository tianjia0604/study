package practice_43;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/20 19:59
 */
/**
 * 求和
 * 输入两个整数 n 和 m，从数列1，2，3.......n 中随意取几个数,使其和等于 m ,要求将其中所有的可能组合列出来
 * 输入描述:
 * 每个测试输入包含2个整数,n和m
 *
 * 输出描述:
 *
 * 按每个组合的字典序排列输出,每行输出一种组合
 * 示例1
 * 输入
 *
 * 5 5
 * 输出
 *
 * 1 4
 * 2 3
 * 5*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int j = 1;
            String str = "";
            int sum = 0;
            for(int i = 0;i < n;i++) {
                arr[i] = j++;
            }
            helper(arr,m,str,sum,0);
        }
    }

    private static void helper(int[] arr, int m, String str, int sum, int i) {
        if(i == arr.length) {
            if(m == sum) {
                System.out.println(str.trim());
            }
            return;
        }
        helper(arr,m,str + arr[i]+" ", + sum+ arr[i],i+1);
        helper(arr,m,str,sum,i+1);
    }
}
