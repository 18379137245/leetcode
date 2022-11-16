package algorithm7_01_31.day_7_29.leetcode_349;

import java.util.HashSet;
import java.util.Set;

public class 两个数组的交集 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] intersection = intersection(nums1, nums2);
        for (int i = 0; i < intersection.length; i++) {
            System.out.println(intersection[i]);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        int length1 = nums1.length;
        int length2 = nums2.length;
        if (length1 > length2){
            for (int num : nums1) {
                set1.add(num);
            }
        }else {
            for (int num : nums2) {
                set1.add(num);
            }
        }

        if (length1 > length2){
            for (int num : nums2) {
                if(set1.contains(num)){
                    set2.add(num);
                }
            }
        }else {
            for (int num : nums1) {
                if(set1.contains(num)){
                    set2.add(num);
                }
            }
        }
        int[] ints = set2.stream().mapToInt(x -> x).toArray();
        return ints;
    }
}
