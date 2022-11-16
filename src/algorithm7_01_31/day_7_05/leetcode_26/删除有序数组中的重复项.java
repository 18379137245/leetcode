package algorithm7_01_31.day_7_05.leetcode_26;


public class 删除有序数组中的重复项 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 33, 55, 55,};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[t++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
        return t;


    }
}
