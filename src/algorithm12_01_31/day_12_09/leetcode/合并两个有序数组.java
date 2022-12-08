package algorithm12_01_31.day_12_09.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class 合并两个有序数组 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int[] nums3 = new int[m + n];
//        int a = 0;
//        if (m > 0) {
//            for (int i = 0; i < m; i++) {
//                nums3[i] = nums1[i];
//            }
//        } else if (n > 0) {
//            for (int i = 0; i < n + m; i++) {
//                nums3[i] = nums2[i];
//            }
//        }
//        if (n == 0) {
//            System.out.println(Arrays.toString(nums3).replaceAll(" ", ""));
////            return Arrays.toString(nums3).trim();
//        }
//        for (int i = n; i < n + m; i++, a++) {
//            nums3[i] = nums2[a];
//        }
//        Arrays.sort(nums3);
//        System.out.println(Arrays.toString(nums3).replaceAll(" ", ""));
////        return Arrays.toString(nums3).trim();
//    }


}
