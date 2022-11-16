package algorithm8_01_31.day_8_26.leetcode_643;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_26.leetcode_643
 * @className: 子数组最大平均数1
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/26 20:42
 * @version: 1.0
 */

public class 子数组最大平均数1 {
    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        //添加前 k 个数据
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        //前 k 个数据的和
        int maxSum = sum;
        //从k 到 n
        for (int i = k; i < n; i++) {
            //nums[i] 新的数据 没被添加过的数据
            //nums[i - k] 第一个数据
            //sum 前k个总和
            sum = sum - nums[i - k] + nums[i];
            //选最大的值
            maxSum = Math.max(maxSum, sum);
        }
        //返回平均数
        return 1.0 * maxSum / k;
    }
}
