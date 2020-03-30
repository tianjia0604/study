package practice_22;

import java.util.Scanner;
/**
 * 小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散
 * 了卖。于是小红要你帮忙判断一
 * 下，某串珠子里是否包含了全部自己想要的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么
 * 告诉她缺了多少珠子。
 * 为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。例如，YrR8RrY是小红想做的珠串；那么
 * ppRYYGrrYBR2258可以买，因为包含了
 * 全部她想要的珠子，还多了8颗不需要的珠子；ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗
 * 红色的珠子。
 * 输入描述：
 * 每个输入包含1个测试用例。每个测试用例分别在2行中先后给出摊主的珠串和小红想做的珠串，两串都不超
 * 过1000个珠子。
 * 输出描述：
 * 如果可以买，则在一行中输出“Yes”以及有多少多余的珠子；如果不可以买，则在一行中输出“No”以及缺了多
 * 少珠子。其间以1个空格分隔。
 * 示例1:
 * 输入
 * ppRYYGrrYBR2258
 * YrR8RrY
 * 输出
 * Yes 8*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int[] n1 = new int[1000];
            int[] n2 = new int[1000];
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for(int i = 0;i < s1.length();i++) {
                n1[s1.charAt(i)]++;
            }
            for(int i = 0;i < s2.length();i++) {
                n2[s2.charAt(i)]++;
            }
            int max = 0;
            int min = 0;
            for(int i = 0;i < 1000;i++) {
                if(n1[i] < n2[i]) {
                    min += n2[i] - n1[i];
                }else {
                    max += n1[i] - n2[i];
                }
            }
            if(min > 0) {
                System.out.println("No " + min);
            }else {
                System.out.println("Yes " + max);
            }
        }
    }
}
