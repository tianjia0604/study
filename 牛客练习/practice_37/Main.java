package practice_37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/14 15:16
 */
/**
 * 木棒拼图
 * 有一个由很多木棒构成的集合，每个木棒有对应的长度，请问能否用集合中的这些木棒以某个顺序首尾相连
 * 构成一个面积大于 0
 * 的简单多边形且所有木棒都要用上，简单多边形即不会自交的多边形。
 * 初始集合是空的，有两种操作，要么给集合添加一个长度为 L
 * 的木棒，要么删去集合中已经有的某个木棒。每次操作结束后你都需要告知是否能用集合中的这些木棒构成
 * 一个简单多边形。
 * 输入描述：
 * 每组测试用例仅包含一组数据，每组数据第一行为一个正整数 n 表示操作的数量(1 ≤ n ≤ 50000) ， 接下来有
 * n行，每行第一个整数为操作类型 i (i ∈ {1,2})，第二个整数为一个长度 L(1 ≤ L ≤ 1,000,000,000)。如果 i=1 代
 * 表在集合内插入一个长度为 L 的木棒，如果 i=2 代表删去在集合内的一根长度为 L 的木棒。输入数据保证删
 * 除时集合中必定存在长度为 L 的木棒，且任意操作后集合都是非空的。
 * 输出描述：
 * 对于每一次操作结束有一次输出，如果集合内的木棒可以构成简单多边形，输出 "Yes" ，否则输出 "No"。
 * 示例1:
 * 输入
 * 5
 * 1 1
 * 1 1
 * 1 1
 * 2 1
 * 1 2
 * 输出
 * No
 * No
 * Yes
 * No
 * No*/
public class Main {
    public static boolean help(List<Long> data){
        int len = data.size();
        for (int i = 0; i < len; i++) {
            long temp = data.remove(i);
            int sum = 0;
            for (int j = 0; j < len - 1; j++) {
                sum += data.get(j);
            }
            if (sum <= temp) {
                data.add(i, temp);
                return false;
            }
            //将临时变量加回去，再进行下一步的判定
            data.add(i, temp);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //此处注意！！！若用Integer，会报数组越界等异常
        List<Long> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            long b = sc.nextInt();
            if (a == 1){
                list.add(b);
            }else {
                list.remove(b);
            }
            if (help(list)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
