package algorithm10_06_31.day_10_09.leetcode_80;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_09.leetcode_80
 * @className: 删除有序数组中重复项2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/9 19:34
 * @version: 1.0
 */

public class 删除有序数组中重复项2 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        return process(nums, 2);
    }
    static int process(int[] nums, int k) { // 最多保留k位相同数字
        int slow = 0; // 慢指针从0开始
        for (int fast : nums) { // 快指针遍历整个数组
            // 检查被保留的元素nums[slow−k]是否和当前待检查元素fast相同
            if (slow < k || nums[slow - k] != fast) {
                nums[slow++] = fast;
            }
        }
        return slow; // 从nums[0]到nums[slow−1]的每个元素都不相同
    }
}
