package practice_39;

/**
 * @Author：Tina
 * @Date：2020/4/20 12:59
 */
/**
 * 回文串
 * 给定一个字符串，问是否能通过添加一个字母将其变为回文串。
 * 输入描述：
 * 一行一个由小写字母构成的字符串，字符串长度小于等于10。
 * 输出描述：
 * 输出答案(YES\NO).
 * 示例1:
 * 输入
 * coco
 * 输出
 * YES*/
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            //去掉两端或者本身是否是回文
            if (isHuiwen(s.substring(0, s.length() - 1)) || isHuiwen(s.substring(1,
                    s.length())) || isHuiwen(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    //这个函数是判断字符串是否为回文串
    public static boolean isHuiwen(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}