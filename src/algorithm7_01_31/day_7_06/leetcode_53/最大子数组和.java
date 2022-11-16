package algorithm7_01_31.day_7_06.leetcode_53;

public class 最大子数组和 {


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0, maxSum = nums[0];
        for (int num : nums) {
            sum = Math.max(sum + num, num);

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

//    public static int maxSubArray(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
//
//        int[] a = new int[nums.length];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - i - 1 - 1; j++) {
//                if (nums[j] - nums[j + 1] > Math.abs(nums[j])) {
//                    a[i] = j;
//                }
//            }
//        }
//        int i = a[0];
//        int j = a[1];
//        if(i != 0 &&  j == 0){
//            j = i;
//            i = nums.length-j+1;
//        }
//        int sum = 0;
//        int count = 0;
//        if (i <= 1) {
//            for (int k = 0; k < nums.length; k++) {
//                if (nums[k] < 0) {
//                    count++;
//                }
//            }
//            for (int k = 0; k < nums.length; k++) {
//                if (count == nums.length) {
//                    for (int l = 0; l < nums.length-1; l++) {
//                        for (int m = 0; m < nums.length-1-i; m++) {
//                            if(nums[m] < nums[m+1]){
//                                int temp = nums[m];
//                                nums[m] = nums[m+1];
//                                nums[m+1] = temp;
//                            }
//                        }
//                    }
////                    return nums[0] > nums[1] ? nums[0] : nums[1];
//                    return nums[0];
//                } else if (nums.length == 2 && nums[k] < 0) {
//
//                } else {
//                    sum += nums[k];
//                }
//            }
//            return sum;
//        } else {
//            for (; j <= i; j++) {
//                sum += nums[j];
//            }
//            return sum;
//        }
//    }
}
