package practice_35;

/**
 * @Author：Tina
 * @Date：2020/4/12 15:05
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 求球的半径和体积
 * 输入球的中心点和球上某一点的坐标，计算球的半径和体积
 * 输入描述：
 * 球的中心点和球上某一点的坐标，以如下形式输入：x0 y0 z0 x1 y1 z1
 * 输出描述：
 * 输入可能有多组，对于每组输入，输出球的半径和体积，并且结果保留三位小数
 * 为避免精度问题，PI值请使用arccos(-1)。
 * 示例1:
 * 输入
 * 0 0 0 1 1 1
 * 输出
 * 1.732 21.766*/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        double r = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)+Math.pow(z1-z2,2));
        double v = 4/3.0*Math.acos(-1)*Math.pow(r,3);

        DecimalFormat format = new DecimalFormat("0.000");
        System.out.println(format.format(r)+" "+format.format(v));

    }
}
