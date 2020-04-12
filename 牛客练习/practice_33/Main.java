package practice_33;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/9 22:46
 */
/**
 * 锤子剪刀布
 * 大家应该都会玩“”的游戏：
 * 现给出两人的交锋记录，请统计双方的胜、平、负次数，并且给出双方分别出什么手势的胜算最大。
 * 输入描述：
 * 输入第1行给出正整数N（<=105），即双方交锋的次数。随后N行，每行给出一次交锋的信息，即甲、乙双
 * 方同时给出的的手势。C代表“锤子”、J代表“剪刀”、B代
 * 表“布”，第1个字母代表甲方，第2个代表乙方，中间有1个空格。
 * 输出描述：
 * 输出第1、2行分别给出甲、乙的胜、平、负次数，数字间以1个空格分隔。第3行给出两个字母，分别代表
 * 甲、乙获胜次数最多的手势，中间有1个空格。如果解不唯
 * 一，则输出按字母序最小的解。
 * 示例1:
 * 输入
 * 10
 * C J
 * J B
 * C B
 * B B
 * B C
 * C C
 * C B
 * J B
 * B C
 * J J
 * 输出
 * 5 3 2
 * 2 3 5
 * B B*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] js = new int[3];
        int jf = 0;
        int[] ys = new int[3];
        int yf = 0;
        int p = 0;
        while(N--!=0){
            int j = convert(in.next());
            int y = convert(in.next());
            if(j==y) {
                p++;
            } else if(judge(j, y)){
                //甲赢
                js[j]++;
                yf++;
            }else{
                ys[y]++;
                jf++;
            }
        }
        System.out.println(yf+" "+p+" "+jf);
        System.out.println(jf+" "+p+" "+yf);
        System.out.println(getResult(js)+" "+getResult(ys));
    }

    private static int convert(String s){
        if(s.equals("B")) {
            return 0;
        }
        if(s.equals("C")) {
            return 1;
        }
        return 2;// J
    }
    private static boolean judge(int j,int y){
        if(j==2 && y==0) {
            return true;
        } else if(j>y) {
            return false;
        }
        return true;
    }
    private static String getResult(int[] a){
        int max = a[0];
        int index = 0;
        for(int i = 1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                index = i;
            }
        }
        return index==0?"B":index==1?"C":"J";
    }
}
