package algorithm11_01_30.day_11_12.剑指OfferII007;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_12.剑指OfferII007
 * @className: 数组中和为0的三个数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/12 19:36
 * @version: 1.0
 */

public class 数组中和为0的三个数 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(threeSum(nums).toArray()));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums); // O(nlogn)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
