package practice_44;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/21 22:03
 */
/**
 * 骆驼命名法
 * 从C/C++转到Java的程序员，一开始最不习惯的就是变量命名方式的改变。C语言风格使用下划线分隔多个单词，例如“hello_world”；而Java则采用一种叫骆驼命名法的规则：除首个单词以外，所有单词的首字母大写，例如“helloWorld”。
 * 请你帮可怜的程序员们自动转换变量名。
 * 输入描述:
 * 输入包含多组数据。
 *
 * 每组数据一行，包含一个C语言风格的变量名。每个变量名长度不超过100。
 * 输出描述:
 * 对应每一组数据，输出变量名相应的骆驼命名法。
 * 示例1
 * 输入
 * 复制
 * hello_world
 * nice_to_meet_you
 * 输出
 * 复制
 * helloWorld
 * niceToMeetYou*/
public class CamelNomenclature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            String[] arr = str.split("_");
            for(String s:arr){
                if(sb.length()==0){
                    sb.append(s.toLowerCase());
                }else{
                    sb.append(s.substring(0, 1).toUpperCase());
                    sb.append(s.substring(1).toLowerCase());
                }
            }
            System.out.println(sb.toString());
        }
    }
}
