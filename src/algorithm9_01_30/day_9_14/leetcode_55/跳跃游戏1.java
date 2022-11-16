package algorithm9_01_30.day_9_14.leetcode_55;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_14.leetcode_55
 * @className: 跳跃游戏1
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/14 20:33
 * @version: 1.0
 */

public class 跳跃游戏1 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        //前n-1个元素能够跳到的最远距离
        int k = 0;
        for (int i = 0; i <= k; i++) {
            //第i个元素能够跳到的最远距离
            int temp = i + nums[i];
            //更新最远距离
            k = Math.max(k, temp);
            //如果最远距离已经大于或等于最后一个元素的下标,则说明能跳过去,退出. 减少循环
            if (k >= nums.length - 1) {
                return true;
            }
        }
        //最远距离k不再改变,且没有到末尾元素
        return false;
    }
}
