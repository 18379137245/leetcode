package algorithm9_01_30.day_9_07.leetcode_41;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_07.leetcode_41
 * @className: 缺失的第一个正数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/7 20:19
 * @version: 1.0
 */

public class 缺失的第一个正数 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //循环判断有没有负数或者0
        for (int i = 0; i < n; ++i) {
            //有就它赋值长度+1
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            //获取当前元素的绝对值
            int num = Math.abs(nums[i]);
            //绝对值小于长度
            if (num <= n) {
                //变成负数
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            //大于 0 直接返回 索引位置+1的索引
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        //到这代表数组中全度小于0
        return n + 1;

    }
}
