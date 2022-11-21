package algorithm11_01_30.day_11_20.面试题1003;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_20.面试题1003
 * @className: 搜索旋转数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/20 20:35
 * @version: 1.0
 */

public class 搜索旋转数组 {
    public static void main(String[] args) {
        int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int target = 5;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
