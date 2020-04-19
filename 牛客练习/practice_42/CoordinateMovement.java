package practice_42;

/**
 * @Author：Tina
 * @Date：2020/4/19 21:44
 */

import java.util.Scanner;

/**
 * 字符串加密
 * 1、对输入的字符串进行加解密，并输出。
 * 2加密方法为：
 * 当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 * 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
 * 其他字符不做变化。
 * 3、解密方法为加密的逆过程。
 * 接口描述：
 *     实现接口，每个接口实现1个基本操作：
 * void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
 * 说明：
 *
 * 1、字符串以\0结尾。
 *
 * 2、字符串最长100个字符。
 * */
public class CoordinateMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.nextLine();
            System.out.println(Encrypt(str1));
            String str2 = sc.nextLine();
            System.out.println(unEncrypt(str2));
        }
    }

    private static String Encrypt(String str1) {
        //加密
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str1.length();i++) {
            char c = str1.charAt(i);
            if(c >= 'a' && c < 'z') {
                sb.append(Character.toString((char) (c - 31)));
            }else if(c == 'z') {
                sb.append("A");
            }else if(c >= 'A' && c < 'Z') {
                sb.append(Character.toString((char) (c + 33)));
            }else if(c == 'Z') {
                sb.append("a");
            }else if(c >= '0' && c < '9') {
                sb.append(Character.toString((char) (c + 1)));
            }else if(c == '9') {
                sb.append("0");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private static String unEncrypt(String str2) {
        //解密
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str2.length();i++) {
            char c = str2.charAt(i);
            if(c > 'a' && c <= 'z') {
                sb.append(Character.toString((char) (c - 33)));
            }else if(c == 'a') {
                sb.append("Z");
            }else if(c > 'A' && c <= 'Z') {
                sb.append(Character.toString((char) (c + 31)));
            }else if(c == 'A') {
                sb.append("z");
            }else if(c > '0' && c <= '9') {
                sb.append(Character.toString((char) (c - 1)));
            }else if(c == '0') {
                sb.append("9");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
