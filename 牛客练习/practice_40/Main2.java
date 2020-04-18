package practice_40;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/18 18:00
 */
/**
 * 删除公共字符串
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are
 * students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 * 输入描述：
 * 每个测试输入包含2个字符串
 * 输出描述：
 * 输出删除后的字符串
 * 示例1:
 * 输入
 * They are students.
 * aeiou
 * 输出
 * Thy r stdnts.*/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            for(int i = 0;i < str2.length();i++) {
                str1 = str1.replaceAll(str2.substring(i,i + 1),"");
            }
            System.out.println(str1);
        }
    }
}
