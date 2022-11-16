package algorithm7_01_31.day_6_30.leetcode_169;

import java.util.Arrays;

public class 多数元素 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,1,2};

        //2 2 2 2 1 1 2
        //1 2 1 0 1 0 1
        //            1,2,2,2,2,3,3
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
//    public static int majorityElement(int[] nums) {
//        int major = nums[0];
//        int count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (count == 0) {
//                //前面都消完了，在重新赋值
//                count++;
//                major = nums[i];
//            } else if (major == nums[i]) {
//                //自己人，count就加1
//                count++;
//            } else {
//                //不是自己人就同归于尽，消掉一个
//                count--;
//            }
//        }
//        return major;
//    }

}
