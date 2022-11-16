package algorithm7_01_31.day_7_03.leetcode_01;

import java.util.Scanner;

public class 两数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 5, 5, 11, 10};
//        [3,2,4]
//        6
        int target = sc.nextInt();
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    num[0] = i;
                    num[1] = j;
                    return num;
                }
            }
        }
        return num;
    }
}
