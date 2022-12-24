package algorithm12_01_31.day_12_22.leetcode_1498;

import java.util.Arrays;

public class 满足条件的子序列数目 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        System.out.println(numSubseq(nums, target));
    }

    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mod = (int) 1e9 + 7;
        int[] tmp = new int[n];
        tmp[0] = 1;
        for (int i = 1; i < n; i++) {
            tmp[i] = (tmp[i - 1] << 1) % mod;
        }
        int res = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                res = (res + tmp[r - l]) % mod;
                l++;
            }
        }
        return res;
    }
}
