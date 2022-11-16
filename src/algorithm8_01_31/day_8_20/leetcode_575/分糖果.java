package algorithm8_01_31.day_8_20.leetcode_575;

import java.util.TreeSet;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_20.leetcode_575
 * @className: 分糖果
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/20 19:51
 * @version: 1.0
 */

public class 分糖果 {
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(candyType));
    }

    public static int distributeCandies(int[] candyType) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int arr : candyType) {
            set.add(arr);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
