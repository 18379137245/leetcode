package algorithm7_01_31.day_7_06.leetcode_27;

public class 移除元素 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int a = 2;
        System.out.println(removeElement(nums, a));
    }
    public static int removeElement(int[] nums, int val) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                //把数组元素不等于val 的数据放到前面从0开始
                nums[t++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return t;
    }
}
