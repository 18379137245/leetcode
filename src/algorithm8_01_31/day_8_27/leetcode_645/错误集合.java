package algorithm8_01_31.day_8_27.leetcode_645;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_27.leetcode_645
 * @className: 错误集合
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/27 20:46
 * @version: 1.0
 */

public class 错误集合 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};
        int[] errorNums = findErrorNums(nums);
        String s = Arrays.toString(errorNums);
        System.out.println(s);
    }

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] cnts = new int[n + 1];

        //遍历循环
        for (int x : nums){
            //x相当于key ++值 value
            cnts[x]++;
        }
        //返回数据
        int[] ans = new int[2];

        for (int i = 1; i <= n; i++) {
            //等于0相当于没有出现过
            if (cnts[i] == 0){
                //未出现数据 放第二位
                ans[1] = i;
            }
            //等于2相当于出现过两次
            if (cnts[i] == 2){
                //重复数据 放第一位
                ans[0] = i;
            }
        }
        return ans;
    }
}
