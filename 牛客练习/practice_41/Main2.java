package practice_41;

import java.util.Scanner;

/**
 * @Author：Tina
 * @Date：2020/4/19 18:18
 */
/**
 * 坐标移动
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点
 * 开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 * 输入：
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 * 坐标之间以;分隔。非法坐标点需要进行丢弃。如AA10; A1A; $%$; YAD; 等。
 * 下面是一个简单的例子 如：
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * 处理过程：
 * 起点（0,0）
 * + A10 = （-10,0）
 * + S20 = (-10,-20)
 * + W10 = (-10,-10)
 * + D30 = (20,-10)
 * + x = 无效
 * + A1A = 无效
 * + B10A11 = 无效
 * + 一个空 不影响
 * 非法坐标点需要进行丢弃。如AA10; A1A; $%$; YAD; 等。
 * 下面是一个简单的例子 如：
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * 处理过程：
 * 起点（0,0）
 * + A10 = （-10,0）
 * + S20 = (-10,-20)
 * + W10 = (-10,-10)
 * + D30 = (20,-10)
 * + x = 无效
 * + A1A = 无效
 * + B10A11 = 无效
 * + 一个空 不影响
 * + A10 = (10,-10)
 * 结果 （10， -10）
 * 输入描述：
 * 一行字符串
 * 输出描述：
 * 最终坐标，以,分隔
 * 示例1:
 * 输入
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * 输出
 * 10,-10*/
public class Main2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //判断是否有下一个录入的元素
        while(sc.hasNext()){
            String str=sc.nextLine();
            //使用;切割录入的字符串数据,返回字符串数组
            String[] A=str.split(";");
            int x=0,y=0;
            for(String string:A){
            //遍历字符串数组获取每一个部分内容,分别判断0索引对应的元素的内容
            //判断从1号位置开始是否有连续的1到2位的数字。(数字是0-9)
                if(string.charAt(0)=='D' && string.substring(1).matches("[0-9]{1,2}")) {
                //将字符串的字符转换为整形数字
                    x+=Integer.parseInt(string.substring(1));
                }
                if(string.charAt(0)=='W' && string.substring(1).matches("[0-9]{1,2}")) {
                    y+=Integer.parseInt(string.substring(1));
                }
                if(string.charAt(0)=='S' && string.substring(1).matches("[0-9]{1,2}")) {
                    y-=Integer.parseInt(string.substring(1));
                }
                if(string.charAt(0)=='A' && string.substring(1).matches("[0-9]{1,2}")) {
                    x-=Integer.parseInt(string.substring(1));
                }
            }
            System.out.println(x+","+y);
        }
        sc.close();
    }
}
