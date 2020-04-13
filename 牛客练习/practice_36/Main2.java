package practice_36;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/13 11:32
 */
/**
 * 字母统计
 * 输入一行字符串，计算其中A-Z大写字母出现的次数
 * 输入描述：
 * 案例可能有多组，每个案例输入为一行字符串。
 * 输出描述：
 * 对每个案例按A-Z的顺序输出其中大写字母出现的次数。
 * 示例1:
 * 输入
 * DFJEIWFNQLEF0395823048+_+JDLSFJDLSJFKK
 * 输出
 * A:0
 * B:0
 * C:0
 * D:3
 * E:2
 * F:5
 * G:0
 * H:0
 * I:1
 * J:4
 * K:2
 * L:3
 * M:0
 * N:1
 * O:0
 * P:0
 * Q:1
 * R:0
 * S:2
 * T:0
 * V:0
 * W:1
 * X:0
 * Y:0
 * Z:0*/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            int[] count = new int[26];
            for(int i = 0;i < line.length();i++) {
                char c = line.charAt(i);
                if(c >= 'A' && c <= 'Z') {
                    count[c - 'A']++;
                }
            }
            for(int i = 0;i < 26;i++) {
                System.out.println((char) ('A'+i) + ":" + count[i]);
            }
        }
    }
}
