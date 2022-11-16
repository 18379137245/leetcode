package algorithm8_01_31.day_8_14.leetcode_506;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_14.leetcode_506
 * @className: 相对名次
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/14 18:58
 * @version: 1.0
 */

public class 相对名次 {
    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        String[] relativeRanks = findRelativeRanks(score);
        System.out.println(Arrays.toString(relativeRanks));
    }

    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] desc = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        //二维数组
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; ++i) {
            //赋值
            arr[i][0] = score[i];
            //下标索引
            arr[i][1] = i;
        }
        //排序降序
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] ans = new String[n];

        for (int i = 0; i < n; ++i) {
            //前3个走else 最大的三个 1是下标
            if (i >= 3) {
                ans[arr[i][1]] = "" + (i + 1);
            } else {
                ans[arr[i][1]] = desc[i];
            }
        }
        //返回
        return ans;
    }

    public static int[] print(int[] score) {
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - i - 1; j++) {
                if (score[j] < score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        int[] arr = score;
        return arr;
    }
}
