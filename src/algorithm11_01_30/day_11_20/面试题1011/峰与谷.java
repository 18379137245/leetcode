package algorithm11_01_30.day_11_20.面试题1011;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_20.面试题1011
 * @className: 峰与谷
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/20 20:42
 * @version: 1.0
 */

public class 峰与谷 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 2, 3};
        wiggleSort(nums);
    }

    public static void wiggleSort(int[] nums) {
        // 首先排序
        Arrays.sort(nums);
        int n = nums.length;
        int[] arr = new int[n];
        // left, right 指针用来取值, idx 用来标记填充位置
        int left = 0, right = n - 1, idx = 0;
        // 逐个填充
        while (left < right) {
            arr[idx++] = nums[left++];
            arr[idx++] = nums[right--];
        }
        // 最后检查数组长度是不是奇数, 是的话需要补填最后一个位置
        if (n % 2 == 1) arr[idx] = nums[left];
        // 拷贝回原来的数组
        System.arraycopy(arr, 0, nums, 0, n);
    }


}
