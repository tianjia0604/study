package practice_29;

/**
 * @Author：Tina
 * @Date：2020/4/5 17:17
 */
/**
 * 年会抽奖
 * 今年公司年会的奖品特别给力，但获奖的规矩却很奇葩：
 * 1. 首先，所有人员都将一张写有自己名字的字条放入抽奖箱中；
 * 2. 待所有字条加入完毕，每人从箱中取一个字条；
 * 3. 如果抽到的字条上写的就是自己的名字，那么“恭喜你，中奖了！”
 * 现在告诉你参加晚会的人数，请你计算有多少概率会出现无人获奖？
 * 输入描述：
 * 输入包含多组数据，每组数据包含一个正整数n（2≤n≤20）。
 * 输出描述：
 * 对应每一组数据，以“xx.xx%”的格式输出发生无人获奖的概率。
 * 示例1:
 * 输入
 * 2 输
 * 出
 * 50.00%
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            float sum1 = sum(n);
            float sum2 = count(n);
            float result = (sum2 / sum1) * 100;
            System.out.println(String.format("%.2f", result) + "%");
        }
    }
    public static float factorial(int num) {
        float result = 1;
        if (num > 0) {
            result = num * factorial(num - 1);
        }
        return result;
    }
    public static float sum(int num) {
        float result = 1;
        if(num==0){
            return 1;
        }else if (num > 0) {
            result = num * factorial(num - 1);
        }
        return result;
    }
    public static float count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n - 1) + count(n - 2));
        }
    }
}
