package algorithm11_01_30.day_11_26.leetcode_852;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_26.leetcode_852
 * @className: 山脉数组的峰顶索引
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/26 18:57
 * @version: 1.0
 */

public class 山脉数组的峰顶索引 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
