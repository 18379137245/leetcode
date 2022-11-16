package algorithm9_01_30.day_9_27.leetcode_229;

import com.sun.javafx.image.impl.IntArgb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Adler32;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_27.leetcode_229
 * @className: 多数元素2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/27 20:15
 * @version: 1.0
 */

public class 多数元素2 {


    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(Arrays.toString(majorityElement(nums).toArray()));
    }

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i] + 1));
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i : map.keySet()) {
            int integer = map.get(i);
            if( integer > nums.length / 3){
                list.add(integer);
            }
        }
        return list;
    }
}
