package algorithm10_06_31.day_10_12.leetcode_153;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_12.leetcode_153
 * @className: 寻找旋转排序数组中的最小值
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/12 19:15
 * @version: 1.0
 */

public class 寻找旋转排序数组中的最小值 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public static int findMin1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;                /* 左闭右闭区间，如果用右开区间则不方便判断右值 */
        while (left < right) {                      /* 循环不变式，如果left == right，则循环结束 */
            int mid = left + (right - left) / 2;    /* 地板除，mid更靠近left */
            if (nums[mid] > nums[right]) {          /* 中值 > 右值，最小值在右半边，收缩左边界 */
                left = mid + 1;                     /* 因为中值 > 右值，中值肯定不是最小值，左边界可以跨过mid */
            } else if (nums[mid] < nums[right]) {   /* 明确中值 < 右值，最小值在左半边，收缩右边界 */
                right = mid;                        /* 因为中值 < 右值，中值也可能是最小值，右边界只能取到mid处 */
            }
        }
        return nums[left];    /* 循环结束，left == right，最小值输出nums[left]或nums[right]均可 */
    }
}
