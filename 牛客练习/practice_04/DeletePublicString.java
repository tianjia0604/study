package practice_04;

import java.util.Scanner;
/**
 * 删除公共字符
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are
students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
输入描述：
每个测试输入包含2个字符串
输出描述：
输出删除后的字符串
示例1:
输入
They are students.
aeiou
输出
Thy r stdnts*/
public class DeletePublicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char[] arr = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i = 0;i < arr.length;i++) {
                if(!str.contains(String.valueOf(arr[i]))) {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
