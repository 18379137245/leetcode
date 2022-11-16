package algorithm11_01_30.day_11_01.剑指Offer40;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_01.剑指Offer40
 * @className: 最小的k个数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/1 20:28
 * @version: 1.0
 */

public class 最小的k个数 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(Arrays.toString(getLeastNumbers(nums, 2)));

    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            ints[i] = arr[i];
        }
        return ints;
    }
}
