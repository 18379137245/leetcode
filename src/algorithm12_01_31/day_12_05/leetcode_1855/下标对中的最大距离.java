package algorithm12_01_31.day_12_05.leetcode_1855;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_05.leetcode_1855
 * @className: 下标对中的最大距离
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/5 19:04
 * @version: 1.0
 */

public class 下标对中的最大距离 {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 2}, nums2 = {10, 10, 1};
        int count = maxDistance(nums1, nums2);
        System.out.println(count);
    }

    public static int maxDistance(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int res = 0;
        // 找最后一个大于等于 a[i] 的 b[j]
        for (int i = 0; i < n; i++) {
            int l = 0, r = m - 1;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (b[mid] >= a[i]) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }

            if (i <= l) {
                res = Math.max(res, l - i);
            }
        }
        return res;
    }
}
