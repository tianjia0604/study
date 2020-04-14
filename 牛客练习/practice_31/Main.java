package practice_31;

import java.util.Scanner;


/**
 * @Author：Tina
 * @Date：2020/4/7 15:30
 */
/**说反话
 * 【说反话 (20)】给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 * 代码片段
 * 测试输入包含一个测试用例，在一行内给出总长度不超过80的字符串。
 * 字符串由若干单词和若干空格组成，其中单词是由英文字母（大小写有区分）组成的字符串，
 * 单词之间用1个空格分开，输入保证句子末尾没有多余的空格。
 * 每个测试用例的输出占一行，输出倒序后的句子。
 * Hello World Here I Come
 * Come I Here World Hello*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        for(int i = 0;i < arr.length;i++){
            String tmp = arr[arr.length-1-i];
            System.out.print(tmp + " ");
        }
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(reverseStr(str));
//    }
//    public  static void swap(char[] arr,int a,int b) {
//        char tmp;
//        for(;a < b;a++,b--) {
//            tmp = arr[a];
//            arr[a] = arr[b];
//            arr[b] = tmp;
//        }
//    }
//
//    public static String reverseStr(String str) {
//        if(str == null) {
//            return null;
//        }
//        char[] chars = str.toCharArray();
//        //先逆序整个数组tneduts a ma I
//        swap(chars,0,chars.length-1);
//        //再以空格为界逆序每个单词
//        int start = 0;
//        for(int i = 1;i < chars.length;i++) {
//            if(chars[i] == ' ') {
//                swap(chars,start,i-1);
//                start = i+1;
//            }
//        }
//        return String.valueOf(chars);
//    }
//}


