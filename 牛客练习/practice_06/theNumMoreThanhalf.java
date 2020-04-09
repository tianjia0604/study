package practice_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * n个数里出现次数大于等于n/2的数
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 * 输入描述：
 * 每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
 * 输出描述：
 * 输出出现次数大于等于n/2的数。
 * 示例1:
 * 输入
 * 3 9 3 2 5 6 7 3 2 3 3 3
 * 输出
 * 3
 */
public class theNumMoreThanhalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int[] arr = new int[strs.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(strs[i]);
        }
        int num = arr[0];
        int count = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == num) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    num = arr[j];
                    count = 1;
                }
            }
        }
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                n++;
            }
        }
        if (n >= arr.length / 2) {
            System.out.println(num);
        } else {
            System.out.println(0);
        }
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        while (sc.hasNextInt()) {
//            list.add(sc.nextInt());
//        }
//        Collections.sort(list);
//        int index = list.size() / 2;
//        if (list.size() % 2 != 1) {
//            --index;
//        }
//        System.out.println(list.get(index));
//    }
}




