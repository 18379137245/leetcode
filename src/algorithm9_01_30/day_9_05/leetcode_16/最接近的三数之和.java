package algorithm9_01_30.day_9_05.leetcode_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_04.leetcode_15
 * @className: 三数之和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/4 20:10
 * @version: 1.0
 */

public class 最接近的三数之和 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        System.out.println(threeSumClosest(nums, 3));

    }

    public static int threeSumClosest(int[] nums, int target) {
        //排序
        Arrays.sort(nums);
        //前三个数之和 ans
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            //左                 右
            int start = i + 1, end = nums.length - 1;
            //二分法
            while (start < end) {
                //每三个元素的和 sum 每一次都不一样
                int sum = nums[start] + nums[end] + nums[i];
                //Math.abs(target - sum) 获取它的绝对值
                //Math.abs(target - ans) 获取它的绝对值
                if (Math.abs(target - sum) < Math.abs(target - ans))
                    //成立留下最小数
                    ans = sum;
                //当前和大于目标值
                if (sum > target)
                    //往左移
                    end--;
                //当前和小于目标值
                else if (sum < target)
                    //往右移
                    start++;
                else//相等返回目标值
                    return ans;
            }
        }
        //到这代表这个值最接近目标值
        return ans;
    }

}
