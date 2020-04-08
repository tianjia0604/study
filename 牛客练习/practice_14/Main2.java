package practice_14;

/**
 * 尼科彻斯定理
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main2 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null){
            long m = Integer.valueOf(s);
            long a = m*m-m+1;//计算首项
            System.out.print(a);
            for(int i=1; i<m; i++){//继续等差数列求和
                System.out.print("+"+(a+=2));
            }
            System.out.println();
        }
        bf.close();
    }
}
