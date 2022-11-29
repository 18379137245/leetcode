package algorithm11_01_30.day_11_28.leetcode_744;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_28.leetcode_744
 * @className: 寻找比目标字母大的最小字母
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/28 18:37
 * @version: 1.0
 */

public class 寻找比目标字母大的最小字母 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        if (target >= letters[length - 1]) {
            return letters[0];
        }
        int left = 0, right = length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return letters[left];
    }
}
