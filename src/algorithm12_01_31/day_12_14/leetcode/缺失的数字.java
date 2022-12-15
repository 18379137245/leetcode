package algorithm12_01_31.day_12_14.leetcode;

import java.util.Arrays;

public class 缺失的数字 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int n = nums.length;
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        return sum1 - sum;
    }
}
