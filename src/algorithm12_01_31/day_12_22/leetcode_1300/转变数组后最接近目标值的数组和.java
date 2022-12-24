package algorithm12_01_31.day_12_22.leetcode_1300;

import java.util.Arrays;

public class 转变数组后最接近目标值的数组和 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3};
        int target = 10;
        System.out.println(findBestValue(arr, target));
    }

    public static int findBestValue(int[] arr, int target) {
        int max = Arrays.stream(arr).max().getAsInt();
        int start = 0, end = max;
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if (getSum(mid, arr) < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return Math.abs(getSum(start, arr) - target) <= Math.abs(getSum(end, arr) - target) ? start : end;
    }

    // Time: O(n)
    private static int getSum(int value, int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > value) {
                sum += value;
            } else {
                sum += num;
            }
        }
        return sum;
    }
}
