package algorithm11_01_30.day_11_05.剑指Offer53;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_05.剑指Offer53
 * @className: n中缺失的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/5 19:54
 * @version: 1.0
 */

public class n中缺失的数字 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            if (arr[i] != nums[i]) {
                return i;
            }
        }
        return n;
    }
}
