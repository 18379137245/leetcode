package algorithm12_01_31.day_12_09.leetcode_658;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_09.leetcode_658
 * @className: 找到K个最接近的元素
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/8 17:35
 * @version: 1.0
 */

public class 找到K个最接近的元素 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 4, x = -1;
        System.out.println(Arrays.toString(findClosestElements(arr, k, x).toArray()));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;
        int left = 0;
        int right = size - k;
        while (left < right) {
            // int mid = left + (right - left) / 2;
            int mid = (left + right) / 2;
            // 尝试从长度为 k + 1 的连续子区间删除一个元素
            // 从而定位左区间端点的边界值
            if (x - arr[mid] > arr[mid + k] - x) {
                // 下一轮搜索区间是 [mid + 1..right]
                left = mid + 1;
            } else {
                // 下一轮搜索区间是 [left..mid]
                right = mid;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
