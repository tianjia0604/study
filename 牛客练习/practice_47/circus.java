package practice_47;
import java.util.*;

/**
 * @Author：Tina
 * @Date：2020/4/24 21:54
 */
/**
 * 马戏团
 * 搜狐员工小王最近利用假期在外地旅游，在某个小镇碰到一个马戏团表演，
 * 精彩的表演结束后发现团长正和大伙在帐篷前激烈讨论，小王打听了下了解到，
 * 马戏团正打算出一个新节目“最高罗汉塔”，即马戏团员叠罗汉表演。
 * 考虑到安全因素，要求叠罗汉过程中，
 * 站在某个人肩上的人应该既比自己矮又比自己瘦，或相等。
 * 团长想要本次节目中的罗汉塔叠的最高，由于人数众多，
 * 正在头疼如何安排人员的问题。小王觉得这个问题很简单，
 * 于是统计了参与最高罗汉塔表演的所有团员的身高体重，
 * 并且很快找到叠最高罗汉塔的人员序列。
 * 现在你手上也拿到了这样一份身高体重表，
 * 请找出可以叠出的最高罗汉塔的高度，这份表中马戏团员依次编号为1到N。
 *
 * 输入描述:
 * 首先一个正整数N，表示人员个数。
 * 之后N行，每行三个数，分别对应马戏团员编号，体重和身高。
 *
 * 输出描述:
 * 正整数m，表示罗汉塔的高度。
 * 示例1
 * 输入
 * 6<br/>1 65 100<br/>2 75 80<br/>3 80 100<br/>4 60 95<br/>5 82 101<br/>6 81 70<br/>
 * 输出
 * 4*/
public class circus {
    static class People {
        int height;
        int weight;

        public People(int weight, int height) {
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            People[] array = new People[n];
            for (int i = 0; i < n; ++i) {
                int index = scan.nextInt();
                array[index - 1] = new People(scan.nextInt(), scan.nextInt());
            }

            Arrays.sort(array, new Comparator<People>() {
                @Override
                public int compare(People p1, People p2) {
                    int result = Integer.compare(p1.height, p2.height);
                    if (result != 0) {
                        return result;
                    } else {
                        return Integer.compare(p1.weight, p2.weight);
                    }
                }
            });

            int[] dp = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < dp.length; ++i) {
                dp[i] = 1;
                for (int j = i - 1; j >= 0; --j) {
                    if (array[i].weight > array[j].weight
                            || (array[i].weight == array[j].weight && array[i].height == array[j].height)) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.max(dp[i], max);
            }
            System.out.println(max);
        }
    }
}