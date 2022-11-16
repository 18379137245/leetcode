package algorithm8_01_31.day_8_30.leetcode_682;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_30.leetcode_682
 * @className: 棒球比赛
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/30 20:19
 * @version: 1.0
 */

public class 棒球比赛 {
    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] ops) {
        int[] nums = new int[1001];//数组，增加标记
        int index = 0;//循环到的位置
        for (int i = 0; i < ops.length; i++, index++) {
            if (ops[i].equals("+")) {
                nums[index] = nums[index - 1] + nums[index - 2];//前两个数叠加

            } else if (ops[i].equals("D")) {
                nums[index] = nums[index - 1] * 2; //前一个数的2倍

            } else if (ops[i].equals("C")) {
                index = index - 2;//删除自己和前一个
            } else {
                nums[index] = Integer.parseInt(ops[i]);//记录数字"5"
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += nums[i]; //叠加总数
        }
        return sum;//总和
    }
}
