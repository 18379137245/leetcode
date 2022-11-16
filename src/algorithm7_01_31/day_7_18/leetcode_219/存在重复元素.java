package algorithm7_01_31.day_7_18.leetcode_219;

import java.util.HashSet;

public class 存在重复元素 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums, 3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //定义一个HashSet 泛型是Integer的集合
        //不能放重复元素
        HashSet<Integer> set = new HashSet<>();
        //循环
        for(int i = 0; i < nums.length; i++) {
            //判断set集合 是否包含contains(nums[i])  存在 返回 ture
            if(set.contains(nums[i])) {
                return true;
            }
            //经过上面判断不成立 添加到集合当中add(nums[i])
            set.add(nums[i]);
            //再次判断 添加过后的长度 是否大于 给定的数值 k
            if(set.size() > k) {
                //成立 执行 删除操作 remove(内容代表key)  nums[i - k]的元素就是key
                set.remove(nums[i - k]);

            }
        }
        //返回false
        return false;
    }
}
