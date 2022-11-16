package algorithm10_06_31.day_10_15.leetcode_318;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_15.leetcode_318
 * @className: 最大单词长度乘积
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/15 19:21
 * @version: 1.0
 */

public class 最大单词长度乘积 {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        maxProduct(words);
    }
    public static int maxProduct(String[] words) {
         /*
        位运算+HashMap优化:
        因为这里要求是两个单词不含重复字母,因此可以将每个字母看成一个坑位,出现过就填坑
        到时候将两个单词的坑位进行对比找出有没有相同的坑位被占用的情况,就可以迅速判断出有没有出现重复字母
        这里可以用二级制位来当这个"坑位",因为坑位只有被填坑和没填(对应0或1)两种情况
        * 注意最后的乘积当中,当有一个单词words[k]的坑位与words[j]一样,但是长度是words[j]的大
        * 那么此时其实不用考虑words[k]的乘积,因为肯定是words[j]乘积的结果大
        * 因此我们可以用HashMap来存储相同坑位的单词最大长度
        */
        int len = words.length;
        // 每个单词的"占坑"情况
        int[] mask = new int[len];
        Map<Integer, Integer> map = new HashMap<>();
        // 遍历每个单词
        for(int i = 0; i < len; i++) {
            // 遍历单词的每个字母
            for(int j = 0; j < words[i].length(); j++) {
                // 'a'-'z'可以映射成0-25的数字分别对应不同位置的二进制位
                int pos = words[i].charAt(j) - 'a';
                // 出现过1次或以上就是1,其余为0
                mask[i] |= (1 << pos);
            }
            int curLen = words[i].length();
            // 维护mask对应的最大单词长度
            if(!map.containsKey(mask[i]) || map.get(mask[i]) < curLen) {
                map.put(mask[i], curLen);
            }
        }
        int res = 0;
        for(int mask1 : map.keySet()) {
            for(int mask2 : map.keySet()) {
                // 若这里mask1==mask2!=0,那么mask1&mask2!=0
                // 因此(mask1 & mask2) == 0就可以断定mask1与mask2不相等
                // 不相等且占坑不同因此可以判断没有重复字母
                if((mask1 & mask2) == 0) {
                    // 维护乘积最大值
                    res = Math.max(res, map.get(mask1) * map.get(mask2));
                }
            }
        }
        return res;
    }
}
