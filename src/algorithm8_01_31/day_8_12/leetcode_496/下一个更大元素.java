package algorithm8_01_31.day_8_12.leetcode_496;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_12.leetcode_496
 * @className: 下一个更大元素
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/12 19:58
 * @version: 1.0
 */

public class 下一个更大元素 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] ints = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        //建一个新的数组长度为第一个数组的长度
        int[] res = new int[m];
        //遍历第一个数组
        for (int i = 0; i < m; ++i) {
            //定义第二个数组的索引
            int j = 0;
            // 索引 小于 数组长度 并且 第一数组索引位置元素 第二数组索引位置元素不同
            while (j < n && nums2[j] != nums1[i]) {
                //索引++
                ++j;
                //相同跳出
            }
            //定义新的索引
            int k = j + 1;
            //前提索引小于数组长度
            //因为元素相同所以要比较后面的数组元素
            while (k < n && nums2[k] < nums2[j]) {
                ++k;
            }

            //成立选第一个 不成立选第二个
            //nums2[k] : -1
            res[i] = k < n ? nums2[k] : -1;
        }
        //返回数组
        return res;
    }
    public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (nums1[i] == nums2[nums2.length - 1]) {
                        ints[index++] = -1;
                        if (nums1[i] == nums2[nums2.length - 1] && i == nums1.length - 1) {
                            return ints;
                        }
                    } else if (nums1[i] > nums2[j + 1]) {
                        for (int k = j + 1; k <= nums2.length - 1; k++) {
                            if (nums1[i] == nums2[k-1]) {
                                ints[index++] = -1;
                                break;
                            } else if (nums1[i] > nums2[k]) {
                            } else if (nums1[i] < nums2[k]) {
                                ints[index++] = nums2[k];
                                count++;
                                break;
                            } else if (count == 0) {
                                ints[index++] = -1;
                                break;
                            }
                        }
                    } else if (nums1[i] < nums2[j + 1]) {
                        ints[index++] = nums2[j + 1];
                    }
                }
            }
        }

        return ints;
    }
}
