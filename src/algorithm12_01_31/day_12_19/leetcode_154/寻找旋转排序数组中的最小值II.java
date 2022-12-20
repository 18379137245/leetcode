package algorithm12_01_31.day_12_19.leetcode_154;

public class 寻找旋转排序数组中的最小值II {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            }else if(nums[pivot] > nums[high]){
                low = pivot + 1;
            }else{
                high--;
            }
        }
        return nums[low];
    }
}
