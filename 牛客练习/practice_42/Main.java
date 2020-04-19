package practice_42;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/19 21:23
 */
/**
 * 计算日期到天数的转换
 * 根据输入的日期，计算是这一年的第几天。。
 * 详细描述：
 * 输入某年某月某日，判断这一天是这一年的第几天？。
        *输入描述:
        *输入三行，分别是年，月，日
        *
        *
        *
        *输出描述:
        *成功:返回outDay输出计算后的第几天;
        *失败:返回-1
        *
        *示例1
        *输入
        *2012
        *12
        *31
        *输出
        *366
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            int Day = iConverDate(year,month,day);
            System.out.println(Day);
        }
    }

    private static int iConverDate(int year, int month, int day) {
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(year <= 0 || month <= 0 || month > 12 || day <= 0 || day > arr[month - 1]) {
            return 0;
        }
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            arr[1] = 29;
        }
        int Sum = 0;
        for(int i = 0;i < month - 1;i++) {
            Sum += arr[i];
        }
        return Sum + day;
    }
}
