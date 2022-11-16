package algorithm10_06_31.day_10_15.leetcode_316;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_15.leetcode_316
 * @className: 去除重复字母
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/15 19:04
 * @version: 1.0
 */

public class 去除重复字母 {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        int len = s.length();
        // 1. 特判
        if(len < 2){
            return s;
        }

        // 2.1 记录每个字符出现的最后一个位置，并且记录当前的字符是否已经出现过
        int[] lastIndex = new int[26];
        boolean[] set  = new boolean[26];                   // 用于记录当前的字符是否已经出现过
        char[] chars = s.toCharArray();
        for(int i = 0;i < len;i++){
            lastIndex[chars[i] - 'a'] = i;                  // 记录每个字符出现的最后一个位置
        }

        // 2.2 使用哨兵 ： 栈初始化的时候就加入哨兵 : 字符'a'
        LinkedList<Character> stack = new LinkedList<>();
        stack.addLast('a');

        // 3. 栈做判断
        for(int i = 0;i < len;i++){
            char curr = chars[i];
            if(set[curr - 'a']){                            // 说明当前字符之前已经出现过
                continue;
            }

            // 3.1 栈顶元素比当前元素大 且 这个字符后面还会再次出现
            while(stack.getLast() > curr && lastIndex[stack.getLast() - 'a'] > i){
                char top = stack.removeLast();              // 弹出栈顶元素
                set[top - 'a'] = false;                     // 将字符改为出现过
            }
            // 3.2 不满足while循环条件 ： 说明当前字符字典序是升序的 或者 当前字符之前没有出现过
            stack.addLast(curr);
            set[curr - 'a'] = true;
        }

        // 4. 转为字符串返回结果
        StringBuilder sb = new StringBuilder();
        stack.removeFirst();                               // 把之前哨兵干掉
        while(!stack.isEmpty()){
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }
}
