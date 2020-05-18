package leetcode5;

import java.util.ArrayList;
import java.util.List;
/**
 * 119. 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]*/

public class getRow {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> array = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    array.add(1);
                }else{
                    array.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(array);
            if (i == rowIndex){
                return array;
            }
        }
        return null;
    }
}
