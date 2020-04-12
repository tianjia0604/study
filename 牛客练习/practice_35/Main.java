package practice_35;

/**
 * @Author：Tina
 * @Date：2020/4/12 13:31
 */

import java.util.Scanner;

/**
 * Broken Keyboard
 * On a broken keyboard, some of the keys are worn out. So when you type
 * some sentences, the characters
 * corresponding to those keys will not appear on screen.
 * Now given a string that you are supposed to type, and the string that
 * you actually type out, please list those keys
 * which are for sure worn out.
 * 输入描述：
 * Each input file contains one test case. For each case, the 1st line contains the original string, and the 2nd line
 * contains the typed-out string. Each string contains
 * no more than 80 characters which are either English letters [A-Z] (case
 * insensitive), digital numbers [0-9], or "_" (representing the space). It is guaranteed that both strings are nonempty.
 * 输出描述：
 * For each test case, print in one line the keys that are worn out, in the order of being detected. The English
 * letters must be capitalized.
 * Each worn out key must be printed once only. It is guaranteed that there is at least one worn out key.
 * 示例1:
 * 输入
 * 7_This_is_a_test
 * _hs_s_a_es
 * 输出
 * 7TI*/
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();
        first=first.toUpperCase();
        second=second.toUpperCase();
        for(int i=0;i<second.length();i++){
            first=first.replace(second.charAt(i)+"","");
        }
        String coutStr="";
        for(int i=0;i<first.length();i++){
            if(coutStr.contains(first.charAt(i)+"")){
                continue;
            }else{
                System.out.print(first.charAt(i));
                coutStr+=first.charAt(i);
            }
        }
        System.out.println();
    }
}
