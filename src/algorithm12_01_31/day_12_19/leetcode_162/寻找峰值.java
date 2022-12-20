package algorithm12_01_31.day_12_19.leetcode_162;

public class 寻找峰值 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3, 4, 5, 6, 4, 5,2};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}
