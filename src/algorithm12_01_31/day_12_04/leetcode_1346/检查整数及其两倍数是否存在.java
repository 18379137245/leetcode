package algorithm12_01_31.day_12_04.leetcode_1346;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_04.leetcode_1346
 * @className: 检查整数及其两倍数是否存在
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/4 19:11
 * @version: 1.0
 */

public class 检查整数及其两倍数是否存在 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            int l = 0, r = n - 1;
            if (arr[i] >= 0) {
                l = i + 1;//arr大于零l为i+1
            } else {
                r = i - 1;//arr小于零r为i-1
            }
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == arr[i] * 2) {
                    return true;
                } else if (arr[mid] > arr[i] * 2) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return false;
    }
}
