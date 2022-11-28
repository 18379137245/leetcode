package algorithm11_01_30.day_11_27.leetcode_1385;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode_1385
 * @className: 两个数组间的距离值
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 18:34
 * @version: 1.0
 */

public class 两个数组间的距离值 {
    public static void main(String[] args) {
        System.out.println(3 >> 1);
        System.out.println(5 >> 1);
        System.out.println(9 >> 1);
        System.out.println(17 >> 1);
        int[] arr1 = {4, 5, 8}, arr2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int ans = 0;
        //在arr2中找到 大于等于|target-d| 并且 小于等于|target+d| 的值
        for (int target : arr1) {
            int l = 0, r = arr2.length - 1;//[l, r]
            while (l <= r) {
                int mid = l + r >> 1;
                if (Math.abs(target - arr2[mid]) <= d) break;

                //因为arr2[mid]不在 [ |target-d|, |target+d| ] 的范围内，所以它必然在这个范围的左侧或右侧
                if (arr2[mid] < target) {//arr2[mid]在上述范围的左侧，太小，所以mid+1
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            //l 和 r直到相遇都不存在[ |target-d|, |target+d| ] 的范围内值就加1
            if (r < l) ans++;
        }

        return ans;
    }
}
