package algorithm11_01_30.day_11_30.leetcode_1539;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_30.leetcode_1539
 * @className: 第k个缺失的正整数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/30 18:57
 * @version: 1.0
 */

public class 第k个缺失的正整数 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, 5));
    }

    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k++;
            }
        }

        return k;
    }

}
