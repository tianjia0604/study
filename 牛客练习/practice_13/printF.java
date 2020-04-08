package practice_13;

import java.util.Scanner;
/**
 * 跟奥巴马一起编程
 * 美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码
 * 的总统。2014年底，为庆祝“计算
 * 机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画
 * 吧！
 * 输入描述：
 * 输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
 * 输出描述：
 * 输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输
 * 出的行数实际上是列数的50%
 * （四舍五入取整）。
 * 示例1:
 * 输入
 * 10 a
 * 输出
 * aaaaaaaaaa
 * a        a
 * a        a
 * a        a
 * aaaaaaaaaa
 * */
public class printF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        int row = (n + 1)/2;
        for(int i = 0;i < row;i++) {
            for(int j = 0;j < n;j++) {
                if(i == 0 || j == 0 || i == row -1 || j == n - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
