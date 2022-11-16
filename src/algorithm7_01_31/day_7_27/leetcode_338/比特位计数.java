package algorithm7_01_31.day_7_27.leetcode_338;

import java.util.Arrays;

public class 比特位计数 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBits(5)));
    }
    public static int[] countBits(int n) {
        //定义一个数组 n + 1 防止越界
        int[] result = new int[n + 1];
        //进来的n 是循环次数
        for (int i = 1; i <= n; i++) {
            //给result[i] 赋值
            result[i] = result[i / 2] + i % 2;
        }
        //返回数组
        return result;
    }
}
