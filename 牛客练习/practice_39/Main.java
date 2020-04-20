package practice_39;

/**
 * @Author：Tina
 * @Date：2020/4/20 12:32
 */
/**
 * 二维数组的打印
 * 有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
 * 给定一个二位数组arr及题目中的参数n，请返回结果数组。
 * 测试样例：
 * [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]],4
 * 返回：[4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]
 * 输入描述：
 * 输出描述：
 * 示例1:
 * 输入
 * 输出*/
public class Main {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] res = new int[n * n];
        int index = 0;
        int startx = 0;
        int starty = n - 1;
        while(startx < n) {
            int x = startx;
            int y = starty;
            while(x < n && y < n) {
                res[index++] = arr[x++][y++];
            }
            if(starty > 0) {
                //新的纵坐标
                starty--;
            }else {
                //新的横坐标
                startx++;
            }
        }
        return res;
    }
}
