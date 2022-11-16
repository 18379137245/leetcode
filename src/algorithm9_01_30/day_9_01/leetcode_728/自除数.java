package algorithm9_01_30.day_9_01.leetcode_728;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_01.leetcode_728
 * @className: 自除数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/1 19:39
 * @version: 1.0
 */

public class 自除数 {
    public static void main(String[] args) {

        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        //out 控制循环
        out:for (int i = left; i <= right; i++) {
            int cur = i;
            while (cur != 0) {
                int t = cur % 10;
                if (t == 0 || i % t != 0){
                    continue out;//成立跳出循环
                }
                cur /= 10;
            }
            //加入集合
            ans.add(i);
        }
        //返回集合
        return ans;
    }
}
