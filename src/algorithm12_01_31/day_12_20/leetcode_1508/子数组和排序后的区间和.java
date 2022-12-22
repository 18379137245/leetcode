package algorithm12_01_31.day_12_20.leetcode_1508;

import java.util.Arrays;

public class 子数组和排序后的区间和 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = 4, left = 1, right = 5;
        System.out.println(rangeSum(nums, n, left, right));
    }

    public static int rangeSum(int[] nums, int n, int left, int right) {
        final int MODULO = 1000000007;
        int sumsLength = n * (n + 1) / 2;
        int[] sums = new int[sumsLength];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                sums[index++] = sum;
            }
        }
        Arrays.sort(sums);
        int ans = 0;
        for (int i = left - 1; i < right; i++) {
            ans = (ans + sums[i]) % MODULO;
        }
        return ans;
    }
}
