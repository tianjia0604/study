package practice_47;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/24 20:44
 */
/**
 * 合唱团
 * 有 n 个学生站成一排，每个学生有一个能力值，
 * 牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * 要求相邻两个学生的位置编号的差不超过 d，
 * 使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 *
 * 输入描述:
 * 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数n (1 <= n <= 50)，
 * 表示学生的个数，接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 *
 * 输出描述:
 * 输出一行表示最大的乘积。
 * 示例1
 * 输入
 * 3
 * 7 4 7
 * 2 50
 * 输出
 * 49*/
public class choir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();          // n 个学生
            int[] arr = new int [n+1];
            for (int i = 1; i <=n ; i++) {
                arr[i] = sc.nextInt();
            }
            int K = sc.nextInt();            // 选出K个
            int d = sc.nextInt();            // 两个学生的位置编号的差不超过 d
            long[][] fmax = new long[K+1][n+1]; // 记录最大乘积
            long[][] fmin = new long[K+1][n+1]; // 记录最小乘积
            // fmax[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最大乘积；
            // fmin[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最小乘积；
            //初始化第一行
            long  res = Integer.MIN_VALUE; // 记得用Long类型，考虑数值范围
            for (int i = 1; i <=n; i++) {
                fmax[1][i] = arr[i];
                fmin[1][i] = arr[i];
                for (int k = 2; k <=K; k++) {
                    for (int j = i-1 ; j > 0 &&  i-j<=d ; j--) {
                        fmax[k][i] = Math.max(fmax[k][i], Math.max(fmax[k-1][j] * arr[i], fmin[k-1][j] * arr[i]));
                        fmin[k][i] = Math.min(fmin[k][i], Math.min(fmax[k-1][j] * arr[i], fmin[k-1][j] * arr[i]));
                    }
                }
                res = Math.max(res ,fmax[K][i]);
            }
            System.out.println(res);
        }
    }
}
