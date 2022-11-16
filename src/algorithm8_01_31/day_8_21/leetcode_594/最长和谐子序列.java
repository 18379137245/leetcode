package algorithm8_01_31.day_8_21.leetcode_594;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_21.leetcode_594
 * @className: 最长和谐子序列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/21 19:56
 * @version: 1.0
 */

public class 最长和谐子序列 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        findLHS(nums);
    }

    public static int findLHS(int[] nums) {
        //排序升序
        Arrays.sort(nums);
        int begin = 0;
        int res = 0;

        for (int end = 0; end < nums.length; end++) {
            //循环 元素减元素 大于 1
            while (nums[end] - nums[begin] > 1) {
                //+1
                begin++;
            }
            //成立找最大值 不成立下一次循环
            if (nums[end] - nums[begin] == 1) {
                //res 赋值 最大值
                res = Math.max(res, end - begin + 1);
            }
        }
        //返回和谐子序列的个数
        return res;
    }
}
