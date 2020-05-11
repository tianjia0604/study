package leetcode7;
/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 *
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。*/

public class addBinary {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int l = a.length() - 1;
        int r = b.length() - 1;
        int c = 0;
        while(l >= 0 || r >= 0) {
            if(l >= 0) {
                c += a.charAt(l--) - '0';
            }
            if(r >= 0) {
                c += b.charAt(r--) - '0';
            }
            ans.append(c % 2);
            c >>= 1;
        }
        String str = ans.reverse().toString();
        return c > 0 ? '1' + str : str;
    }
}
