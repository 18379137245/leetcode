package algorithm11_01_30.day_11_03.剑指Offer45;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_03.剑指Offer45
 * @className: 把数组排成最小的数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/3 20:12
 * @version: 1.0
 */

public class 把数组排成最小的数 {

    public static void main(String[] args) {
        int[] nums = {23, 2, 30};
        minNumber(nums);
    }

    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);

        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s);
        return res.toString();
    }
}
