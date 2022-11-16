package algorithm11_01_30.day_11_13.剑指OfferII011;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_13.剑指OfferII011
 * @className: s0和1个数相同的子数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/13 18:50
 * @version: 1.0
 */

public class s0和1个数相同的子数组 {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        int n = nums.length, pre = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // 无前缀时，前缀和为0，下标为-1
        for(int j = 0; j < n; j++){
            pre += nums[j] == 0 ? -1 : 1; // 只有两种可能，为0时-1
            if(map.containsKey(pre)){
                int i = map.get(pre); // 针对pre[j](即pre)，找不到pre[i](也是pre)时，i=n，使j-i+1必为负
                max = Math.max(max, j - i);
            }
            else map.put(pre, j);
        }
        return max;
    }
}
