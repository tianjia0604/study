package practice_36;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/13 10:57
 */
/**
 * 进制转换
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串(注意可能存在的一个测试用例
 * 里的多组数据)。
 * 输入描述：
 * 输入一个十六进制的数值字符串。
 * 输出描述：
 * 输出该数值的十进制字符串。
 * 示例1:
 * 输入
 * 0xA
 * 输出
 * 10*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(Integer.parseInt(str.substring(2),16));

        }
    }
}
