package practice_15;
import java.util.*;
import java.util.Scanner;
/**
 * 另类加法
 * 请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
 * 给定两个int A和B。请返回A＋B的值
 * 测试样例：
 * 1,2
 * 返回：3*/
public class Main {
    public static int addAB(int A, int B) {
        if(B == 0) {
            return A;
        }
        int sum = A ^ B;
        int jin = (A & B) << 1;
        return addAB(sum,jin);
    }

    public static void main(String[] args) {
        System.out.println(addAB(3,6));
    }
}
