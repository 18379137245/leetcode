package algorithm9_01_30.day_9_12.leetcode_670;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_12.leetcode_670
 * @className: 最大交换
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/13 21:11
 * @version: 1.0
 */

public class 最大交换 {
    public static void main(String[] args) {
        System.out.println(maximumSwap(9936));
    }

    public static int maximumSwap(int num) {
        //定义char 数组
        char[] charArray = String.valueOf(num).toCharArray();
        int n = charArray.length;
        //当前最大的值
        int maxNum = num;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //不停调换位置 可以理解为冒泡
                swap(charArray, i, j);
                //获取最大的值
                maxNum = Math.max(maxNum, Integer.parseInt(new String(charArray)));
                //不停调换位置 可以理解为冒泡
                swap(charArray, i, j);
            }
        }
        //返回最大值
        return maxNum;
    }

    public static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
