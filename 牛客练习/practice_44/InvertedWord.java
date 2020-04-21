package practice_44;

/**
 * @Author：Tina
 * @Date：2020/4/21 21:51
 */
/**
 * 单词倒排
 * 对字符串中的所有单词进行倒排。
 *
 * 说明：
 *
 * 1、每个单词是以26个大写或小写英文字母构成；
 *
 * 2、非构成单词的字符均视为单词间隔符；
 *
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 *
 * 4、每个单词最长20个字母；
 *
 * 输入描述:
 * 输入一行以空格来分隔的句子
 *
 * 输出描述:
 * 输出句子的逆序
 *
 * 示例1
 * 输入
 * I am a student
 * 输出
 * student a am I*/
import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/21 21:51
 */
public class InvertedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s=str.split("[^a-zA-Z]");
            StringBuilder sb = new StringBuilder();
            for (int i = s.length-1; i >=0; i--) {
                sb.append(s[i]+" ");
            }
            System.out.println(sb.substring(0).toString().trim());
        }
    }
}

