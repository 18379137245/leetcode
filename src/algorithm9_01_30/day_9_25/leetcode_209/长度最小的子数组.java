package algorithm9_01_30.day_9_25.leetcode_209;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_25.leetcode_209
 * @className: 长度最小的子数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/25 19:01
 * @version: 1.0
 */

public class 长度最小的子数组 {
    public static void main(String[] args) {
        int target = 2;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int ol = 0, hi = 0, min = Integer.MAX_VALUE;
        int sum = 0;
        //遍历数组长度
        while (hi < nums.length) {
            //依次添加元素
            sum += nums[hi++];
            //当前和大于等于目标时
            while (sum >= target) {
                //选出最小值
                //hi - ol 代表多个元素和大于等于目标值
                //找出以最少的元素满足和大于等于目标
                min = Math.min(min, hi - ol);
                //用和减去第一位依次类推
                //如果减完之后还能成立和大于等于目标时继续循环
                sum -= nums[ol++];
            }
        }
        //到这如果min还是等于开始赋值代表没有成立的 为true 选 0 反之选 min
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
