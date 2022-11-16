package algorithm7_01_31.day_7_26.leetcode_303;

public class 区域和检索数组不可变 {

    public static void main(String[] args) {
        int[] nums = {1,23, 45,6};
        NumArray numArray = new NumArray(nums);
        int i = numArray.sumRange(0, 3);
        System.out.println(i);
    }


}
