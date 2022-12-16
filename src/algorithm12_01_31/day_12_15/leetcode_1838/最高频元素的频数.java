package algorithm12_01_31.day_12_15.leetcode_1838;

import java.util.Arrays;

public class 最高频元素的频数 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 1;
        int len = nums.length;
        int i = 0;// i表示滑窗的左边界
        int cur = 0;// 创造当前滑窗所需要的步数
        for (int j = 1; j < len; j++) {
            cur += (nums[j] - nums[j - 1]) * (j - i);// j为滑窗的右边界
            // 先将nums[j]放到滑窗里，超了再移动左边界
            while (cur > k) {// 步数超了，就要移动左边界
                cur -= nums[j] - nums[i];// 释放添加nums[i]进滑窗所需要的步数
                i++;//移动左边界
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
