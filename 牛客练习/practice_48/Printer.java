package practice_48;

/**
 * @Author：Tina
 * @Date：2020/4/25 22:06
 */
/**
 * 顺时针打印矩阵
 *
 * 对于一个矩阵，请设计一个算法从左上角(mat[0][0])开始，顺时针打印矩阵元素。
 *
 * 给定int矩阵mat,以及它的维数nxm，请返回一个数组，数组中的元素为矩阵元素的顺时针输出。
 *
 * 测试样例：
 * [[1,2],[3,4]],2,2
 * 返回：[1,2,4,3]*/
import java.util.*;

public class Printer {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int tR = 0;
        int tC = 0;
        int dR = n - 1;
        int dC = m - 1;
        int index = 0;
        int[] res = new int[n * m];
        while (tR <= dR && tC <= dC) {
            if (tR == dR) {// 只有一行的时候
                for (int i = tC; i <= dC; i++) {
                    res[index++] = mat[tR][i];
                }
            } else if (tC == dC) {// 只有一列的时候
                for (int i = tR; i <= dR; i++) {
                    res[index++] = mat[i][tC];
                }
            } else {
                int curC = tC;
                int curR = tR;
                while (curC != dC) {// 从左到右打印
                    res[index++] = mat[tR][curC];
                    curC++;
                }
                while (curR != dR) {// 从上往下打印
                    res[index++] = mat[curR][dC];
                    curR++;
                }
                while (curC != tC) {// 从右往左打印
                    res[index++] = mat[dR][curC];
                    curC--;
                }
                while (curR != tR) {// 从下往上打印
                    res[index++] = mat[curR][tC];
                    curR--;
                }
            }
            tR++;
            tC++;
            dR--;
            dC--;

        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}