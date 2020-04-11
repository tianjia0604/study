package practice_34;

/**
 * @Author：Tina
 * @Date：2020/4/11 22:11
 */
/**
 * 风口的猪 - 中国牛市
 * 风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。
 * 给你一个回顾历史的机会，已知一支股票连续n天的价格走势，
 * 以长度为n的整数数组表示，
 * 数组中第i个元素（prices[i]）代表该股票第i天的股价。
 * 假设你一开始没有股票，但有至多两次买入1股而后卖出1股的机会，
 * 并且买入前一定要先保证手上没有股票。若两次交易机会都放弃，收益为0。
 * 设计算法，计算你能获得的最大收益。
 * 输入数值范围：2<=n<=100,0<=prices[i]<=100
 * 输入
 * 3,8,5,1,7,8
 * 输出
 * 12
 */
public class Solution {
    public static int calculateMax(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        int max = 0;
        for(int i = 0;i < prices.length;i++) {
            int tmp = getMax(prices,0,i-1) +
                    getMax(prices,i,prices.length-1);
            if(tmp > max) {
                max = tmp;
            }

        }
        return max;
    }

    private static int getMax(int[] prices, int left, int right) {
        int min = prices[left];
        int max = 0;
        for(int i = left + 1;i <= right;i++) {
            if(prices[i] - min > max) {
                max = prices[i] - min;
            }
            if(prices[i] < min) {
                min = prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,3,1,7,8};
        System.out.println(calculateMax(arr));
    }

}