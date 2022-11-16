package algorithm10_06_31.day_10_18.leetcode_747;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_18.leetcode_747
 * @className: 至少是其他数字两倍的最大数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/18 18:41
 * @version: 1.0
 */

public class 至少是其他数字两倍的最大数 {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int max = 0;
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
        }
        int count = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if(max >= nums[i] * 2){
                count++;
            }else if(max == nums[i]){
                index = i;
            }
        }
        if(count == n - 1){
            return index;
        }else{
            return -1;
        }
    }
}
