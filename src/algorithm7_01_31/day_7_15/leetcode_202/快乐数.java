package algorithm7_01_31.day_7_15.leetcode_202;

import java.util.HashSet;
import java.util.Set;

public class 快乐数 {
    public static void main(String[] args) {
        System.out.println(isHappy(23));
    }
    private static int getNext(int n) {
        //定义一个变量totalSum为0
        int totalSum = 0;

        //判断进来数值是否大于0  成立 true  否则 false
        // ture 执行下面代码
        while (n > 0) {
            //给变量d 赋值  n对10取余
            int d = n % 10;
            //给变量n 赋值  n/除10
            n = n / 10;
            //给变量totalSum 赋值  d的平方
            totalSum += d * d;
        }

        //返回给调用者
        return totalSum;
    }

    public static boolean isHappy(int n) {
        //Hashset 不能存储重复的值
        Set<Integer> seen = new HashSet<>();
        //   n != 1 判断进来的数 是否是1如果是1  直接返回
        //   !seen.contains(n)  判断集合是否存在该数 存在true 不存在false  !取反true变false  false变ture
        //   两个true才能执行下面代码
        while (n != 1 && !seen.contains(n)) {
            //添加到集合
            seen.add(n);
            //调用方法并给n赋值
            n = getNext(n);
        }
        //返回给调用者
        return n == 1;
    }
}
