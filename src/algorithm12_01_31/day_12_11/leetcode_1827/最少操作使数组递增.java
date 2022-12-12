package algorithm12_01_31.day_12_11.leetcode_1827;

public class 最少操作使数组递增 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 1};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        int pre = nums[0] - 1, res = 0;
        for (int num : nums) {
            pre = Math.max(pre + 1, num);
            res += pre - num;
        }
        return res;
    }
}
