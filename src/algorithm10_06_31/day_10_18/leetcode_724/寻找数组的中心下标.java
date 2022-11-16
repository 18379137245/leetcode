package algorithm10_06_31.day_10_18.leetcode_724;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_18.leetcode_724
 * @className: 寻找数组的中心下标
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/18 18:06
 * @version: 1.0
 */

public class 寻找数组的中心下标 {
    public static void main(String[] args) {
        int[] nums = { 1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int x : nums) sum += x;
        int sum1 = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum1 += nums[i];
            if (sum - sum1 == sum1 - nums[i])
                return i;
        }
        return -1;
    }

}
