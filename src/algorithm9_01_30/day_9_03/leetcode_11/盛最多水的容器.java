package algorithm9_01_30.day_9_03.leetcode_11;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_03.leetcode_11
 * @className: 盛最多水的容器
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/3 19:58
 * @version: 1.0
 */

public class 盛最多水的容器 {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }

    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;

        while(i < j) {

            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }
}
