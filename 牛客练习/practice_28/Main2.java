package practice_28;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/2 19:01
 */
/**
 * 密码验证合格程序
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有相同长度超2的子串重复
 * 说明:长度超过2的子串
 * 输入描述：
 * 一组或多组长度超过2的子符串。每组占一行
 * 输出描述：
 * 如果符合要求输出：OK，否则输出NG
 * 示例1:
 * 输入
 * 021Abc9000
 * 021Abc9Abc1
 * 021ABC9000
 * 021$bc9000
 * 输出
 * OK
 * NG
 * NG
 * OK*/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String psw = sc.nextLine();
            if(checkLength(psw) && checkCharKinds(psw) && checkCharRepeat(psw)) {
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }
    //1.长度超过8位
    private static boolean checkLength(String psw) {
        if(psw.length() == 0 || psw.length() <= 8) {
            return false;
        }
        return true;
    }
    //2.包括大小写字母.数字.其它符号,以上四种至少三种
    private static boolean checkCharKinds(String psw) {
        int Digit = 0,lowercase = 0,uppercase=0,others=0;
        char[] ch = psw.toCharArray();
        for(int i = 0;i < ch.length;i++) {
            if(ch[i] >= '0' && ch[i] <= '9') {
                Digit = 1;
                continue;
            }
            else if(ch[i] >= 'a' && ch[i] <= 'z') {
                lowercase = 1;
                continue;
            }
            else if(ch[i] >= 'A' && ch[i] <= 'Z') {
                uppercase = 1;
                continue;
            }else {
                others = 1;
                continue;
            }

        }
        int total = Digit + lowercase+ uppercase + others;
        return total >= 3 ? true :false;
    }
    //3.不能有相同长度超2的子串重复
    private static boolean checkCharRepeat(String psw) {
        for(int i = 0; i <psw.length() - 2;i++) {
            String str = psw.substring(i,i + 3);
            if(psw.substring(i + 1).contains(str)) {
                return false;
            }
        }
        return true;
    }
}
