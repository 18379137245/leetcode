package algorithm9_01_30.day_9_10.leetcode_45;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_10.leetcode_45
 * @className: 跳跃游戏2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/10 20:16
 * @version: 1.0
 */

public class 跳跃游戏2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        jump(nums);
    }
    public static int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
}
