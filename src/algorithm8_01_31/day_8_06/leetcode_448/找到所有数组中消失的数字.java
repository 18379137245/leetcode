package algorithm8_01_31.day_8_06.leetcode_448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_06.leetcode_448
 * @className: 找到所有数组中消失的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/6 19:47
 * @version: 1.0
 */
public class 找到所有数组中消失的数字 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        disappearedNumbers.forEach(System.out::println);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        //TreeSet集合 可以去重  默认升序
        TreeSet set = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            //添加元素 集合里有一样的元素则添加无效 可以做到去重
            set.add(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            //如果set集合 添加i 成立证明 set集合没有这个元素
            if(set.add(i)){
                //list集合添加 数组没有的数据 i
                list.add(i);
            }
        }
        //返回数组没有的数据集合
        return list;
    }
}
