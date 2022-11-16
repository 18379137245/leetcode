package algorithm9_01_30.day_9_28.leetcode_274;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_28.leetcode_274
 * @className: H指数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/28 15:24
 * @version: 1.0
 */

public class H指数 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            //找出中间索引位置 对半查找
            int mid = left + (right - left) / 2;
            //以中间索引位置元素为目标
            //小于数组长度减去当前索引 则往左+1
            if (citations[mid] < n - mid) {
                left += 1;
            } else {
                //大于等于直接把中间索引位置移植最右
                right = mid;
            }
        }
        return citations[left] == 0 ? 0 : n - left;
    }
}
