package practice_06;

import java.util.Scanner;
/**
 * 计算糖果
 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道
 * 以下的信息：
 * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所
 * 有题设条件。
 * 输入描述：
 * 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区
 * 间)。
 * 输出描述：
 * 输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。 如果不存在
 * 这样的整数A，B，C，则输出No
 * 示例1:
 * 输入
 * 1 -2 3 4
 * 输出
 * 2 1 3
 */

public class sweat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        //x1=A-B,x2=B-C,x3=A+B,x4=B+C
        //B=A-x1;
        //A+A-x1=x3;
        //A=(x3+x1)/2;
        int A = (x3+x1)/2;
        //B=x2+C;
        //x4=x2+C+C
        //C=(x4-x2)/2;
        int C = (x4-x2)/2;
        //C=B-x2;
        //x4=B+B-x2
        //B=(x4+x2)/2;
        int B = (x4+x2)/2;
        if((A - B == x1) && (B - C == x2) && (A + B == x3) && (B + C ==x4)) {
            System.out.println(A + " " + B + " " + C);
        }else {
            System.out.println("No");
        }
    }
}
