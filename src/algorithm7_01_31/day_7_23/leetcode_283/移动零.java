package algorithm7_01_31.day_7_23.leetcode_283;

import java.util.ArrayList;
import java.util.Arrays;

public class 移动零 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes3(nums);
    }
    public static void moveZeroes2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                list.add(nums[i]);
            }else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        Object[] objects = list.toArray();
        System.out.println("[");
        for (int i = 0; i < objects.length; i++) {
            if(i!=objects.length-1){
                System.out.print(objects[i]+",");
            }else {
                System.out.print(objects[i]+"]");
            }
        }
    }

    public static void moveZeroes1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = temp;
            }
        }
    }
    public static void moveZeroes3(int[] nums) {
        //如果数组长度等于0 代表数组没有数据 直接返回
        if(nums.length == 0){
            return;
        }
        //定义一个j变量索引
        int j = 0;
        //遍历数组长度
        for (int i = 0; i < nums.length; i++) {
            //判断数组元素不等于0  等于0跳过
            if(nums[i] != 0){
                //把当前的数组i的索引位置元素 赋给数组j索引位置 j从0开始
                nums[j++] = nums[i];
            }
        }
        //到这代表过滤完了0
        //i = j 把j索引的位置赋给i
        //因为前面把位置占完了所以要从后面开始赋值
        for (int i = j; i < nums.length; i++) {
            //从数组索引i 开始赋值 0
            //赋值到数组长度为止
            nums[i] = 0;
        }
    }
}
