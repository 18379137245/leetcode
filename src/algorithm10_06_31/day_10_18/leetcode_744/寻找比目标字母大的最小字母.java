package algorithm10_06_31.day_10_18.leetcode_744;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_18.leetcode_744
 * @className: 寻找比目标字母大的最小字母
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/18 18:17
 * @version: 1.0
 */

public class 寻找比目标字母大的最小字母 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}
