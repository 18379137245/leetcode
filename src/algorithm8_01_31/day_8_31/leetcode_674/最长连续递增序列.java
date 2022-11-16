package algorithm8_01_31.day_8_31.leetcode_674;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_31.leetcode_674
 * @className: 最长连续递增序列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/31 19:45
 * @version: 1.0
 */

public class 最长连续递增序列 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length && nums[i] < nums[i + 1]) {
                max = Math.max(max,++min);
            }else {
                min = 1;
            }
        }
        return max;
    }
}
