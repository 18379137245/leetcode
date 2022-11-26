package algorithm11_01_30.day_11_24.面试题1624;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_24.面试题1624
 * @className: 数对和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/24 18:49
 * @version: 1.0
 */

public class 数对和 {

    public static void main(String[] args) {
        int[] nums = {5, 6, 5, 6};
        int target = 11;
        System.out.println(Arrays.toString(pairSums(nums, target).toArray()));
    }

    public static List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length <= 1) {
            return res;
        }
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                List<Integer> item = Arrays.asList(nums[i], nums[j]);
                i++;
                j--;
                res.add(item);
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}
