package algorithm7_01_31.day_7_22.leetcode_268;

import java.util.Arrays;

public class 丢失的数字 {
    public static void main(String[] args) {
        int[] nums = {8,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        //进来数据没有重复的所以可以进行一个排序 升序
        Arrays.sort(nums);
        //length = 它的长度也是最大的一个数 如果一下循环没有成立 就返回最大的
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            //经过上面的排序 索引 就相当于元素了
            //nums[i]元素 不等于 索引值的话 那就是这个元素不存在 就返回这个索引
            if(nums[i] != i){
                return i;
            }
        }
        //返回排序的最后一个数也就是最大的数
        return length;
    }
}
