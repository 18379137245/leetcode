package algorithm7_01_31.day_7_30.leetcode_350;

import java.util.ArrayList;
import java.util.Arrays;

public class 两个数组的交集2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersection = intersect(nums1, nums2);
        for (int i = 0; i < intersection.length; i++) {
            System.out.println(intersection[i]);
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        //两个数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //找到两个数组的长度
        int length1 = nums1.length, length2 = nums2.length;
        //定义一个数组长度为上面两个数组的最小长度
        int[] intersection = new int[Math.min(length1, length2)];
        //定义三个变量 代表索引
        int index1 = 0, index2 = 0, index = 0;
        //循环 索引跟长度比较  只要一方不成立就跳出
        while (index1 < length1 && index2 < length2) {
            //判断数组1的索引的元素值 是否小于 数组2的索引元素值
            if (nums1[index1] < nums2[index2]) {
                //成立 数组1的索引++
                index1++;
            }
            //判断数组1的索引的元素值 是否小于 数组2的索引元素值
            else if (nums1[index1] > nums2[index2]) {
                index2++;
            }
            //到这代表两个数组的索引元素值一样
            else {
                //将数组1的元素值给 intersection数组索引位置赋值
                intersection[index] = nums1[index1];
                //3个索引++
                index1++;
                index2++;
                index++;
            }
        }
        //返回一个新的数组 截取intersection数组 从索引0 到 index索引位置的元素
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);//1 1 2 2
        Arrays.sort(nums2);//2 2
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length = length1 > length2 ? length1 : length2;
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0, k = 0;
        if (length1 > length2) {
            for (int i = 0; i < length1; i++) {

                if (nums1[j] > nums2[k]) {
                    k++;
                    if(j != 0){
                        j--;
                        i--;
                    }
                }
                if (nums2.length == k){
                    int[] ints = list.stream().mapToInt(x -> x).toArray();
                    return ints;
                }
                if (nums1[j] == nums2[k]) {
                    k++;
                    list.add(nums1[j]);
                }
                if (k != 0) {
                    if (nums2.length == 1 || nums2.length == k) {
                        int[] ints = list.stream().mapToInt(x -> x).toArray();
                        return ints;
                    }
                }
                j++;
            }
        } else {
            for (int i = 0; i < length2; i++) {

                if (nums2[j] > nums1[k]) {
                    k++;
                    if(j > 1){
                        j--;
                        i--;
                    }
                }

                if (nums2[j] == nums1[k]) {
                    k++;
                    list.add(nums2[j]);
                }
                if (nums1.length == k){
                    int[] ints = list.stream().mapToInt(x -> x).toArray();
                    return ints;
                }
                j++;
                if (k != 0) {
                    if (nums1.length == k || nums1.length == 1 ) {
                        int[] ints = list.stream().mapToInt(x -> x).toArray();
                        return ints;
                    }
                }
            }
        }

        int[] ints = list.stream().mapToInt(x -> x).toArray();
        return ints;
    }
}
