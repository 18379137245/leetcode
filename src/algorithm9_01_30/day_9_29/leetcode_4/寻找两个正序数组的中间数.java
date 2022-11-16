package algorithm9_01_30.day_9_29.leetcode_4;

import java.awt.font.NumericShaper;
import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_29.leetcode_4
 * @className: 寻找两个正序数组的中间数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/29 19:18
 * @version: 1.0
 */

public class 寻找两个正序数组的中间数 {
    public static void main(String[] args) {
        int[] nums1 = {2,4}, nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            ints[i] = nums1[i];
        }
        int n = nums1.length;
        for (int i = 0; i < nums2.length; i++) {
            ints[n++] = nums2[i];
        }
        Arrays.sort(ints);
        if (ints.length % 2 == 1) {
            return ints[ints.length / 2];
        } else {
            int i = (ints[ints.length / 2] + ints[ints.length / 2 - 1]);
            if (i % 2 == 0) {
                return i / 2;
            } else {
                return (ints[ints.length / 2] + ints[ints.length / 2 - 1]) / 2 + 0.5;
            }
        }
    }
}
