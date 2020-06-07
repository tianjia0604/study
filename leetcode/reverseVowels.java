package leetcode9;
/**
 * 345. 反转字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"*/
public class reverseVowels {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            while(l<arr.length && judge(arr[l])) {
                l++;
            }
            while(r>=0 && judge(arr[r])) {
                r--;
            }
            if(l>=r){
                break;
            }
            char tmp = arr[r];
            arr[r--] = arr[l];
            arr[l++] = tmp;
        }
        String result = String.valueOf(arr);
        return result;
    }
    public boolean judge(char c){
        if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
            return true;
        }else{return false;}
    }
}
