package algorithm7_01_31.day_7_26.leetcode_303;

public class NumArray {
    //定义一个数组
    int[] sums;

    public NumArray(int[] nums) {
        //n = nums数组长度
        int n = nums.length;
        //给数组 长度 静态初始化 n+1 以防下方数值越界
        sums = new int[n + 1];
        //遍历循环 n次
        for (int i = 0; i < n; i++) {
            //i 是 索引  nums[i] 代表元素值
            //给sums[i+1] 赋值 每次赋值都是数组前两个数相加
            //sums[i] = 0 初始化默认数组里面的都是0
            //nums[i] = 就是传进来的数值
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        //i j 代表位置
        //sums[j+1] - sums[i]
        //sums[j+1] 代表 j 位置的元素
        //sums[i] 代表 i 位置的元素
        //用后面的元素 减掉 前面的元素  就能得到数组中间的和
        return sums[j + 1] - sums[i];
    }
}
