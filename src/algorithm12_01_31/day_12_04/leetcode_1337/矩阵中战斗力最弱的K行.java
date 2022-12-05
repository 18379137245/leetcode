package algorithm12_01_31.day_12_04.leetcode_1337;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_04.leetcode_1337
 * @className: 矩阵中战斗力最弱的K行
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/4 18:46
 * @version: 1.0
 */

public class 矩阵中战斗力最弱的K行 {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        System.out.println(Arrays.toString(kWeakestRows(mat, 3)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        List<Integer> lines = new ArrayList<>();
        for (int i = 0; i < mat.length; i++)
            lines.add(binarySearch(mat[i]) * 100 + i);
        Collections.sort(lines);
        for (int i = 0; i < k; i++)
            ans[i] = lines.get(i) % 100;
        return ans;
    }

    public static int binarySearch(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
