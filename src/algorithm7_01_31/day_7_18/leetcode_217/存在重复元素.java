package algorithm7_01_31.day_7_18.leetcode_217;

import java.util.Arrays;

public class 存在重复元素 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        //排序 升序
        Arrays.sort(nums);
        //一下代码条件成立必须数组为升序
        //遍历循环i  nums.length不减1  会因为nums[i + 1] 数组越界
        for (int i = 0; i < nums.length - 1; i++) {
            //判断用第一个元素跟后面所有的元素相比一样 返回 ture  没有 i++
            if (nums[i] == nums[i + 1]) {
                return true;
            }

        }
        //能到这就证明没有重复元素
        return false;
    }
//    public static boolean containsDuplicate(int[] nums) {
//        //遍历循环i
//        for (int i = 0; i < nums.length; i++) {
//            //遍历循环j = i + 1 这样可以跳过前面的已经过滤好的数据
//            for (int j = i + 1; j < nums.length; j++) {
//                //判断用第一个元素跟后面所有的元素相比一样 返回 ture
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
