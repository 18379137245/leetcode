package algorithm8_01_31.day_8_16.leetcode_520;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_16.leetcode_520
 * @className: 检测大写字母
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/16 20:31
 * @version: 1.0
 */

public class 检测大写字母 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));
    }
    public static boolean detectCapitalUse(String word) {
        if(word.length() == 1){
            return true;
        }
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) <= 'Z' && word.charAt(i) >= 'A'){
                count++;
            }else if (word.charAt(i) <= 'z' && word.charAt(i) >= 'a'){
                count1++;
            }
        }
        if(count == word.length() || count1 == word.length()){
            return true;
        }else if(count == 1 && word.charAt(0) <= 'Z' && word.charAt(0) >= 'A'){
            return true;
        }
        return false;
    }
}
