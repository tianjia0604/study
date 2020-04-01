package practice_21;

import java.util.Scanner;
/**
 * 统计每个月兔子总数
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔
 * 子都不死，问每个月的兔子总数为多少？
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(getTotalcount(n));
        }
    }
    public static int getTotalcount(int n) {
        if(n ==1 || n == 2) {
            return 1;
        }else if(n == 3) {
            return 2;
        }
        return  getTotalcount(n - 1) + getTotalcount(n - 2);

    }
}
