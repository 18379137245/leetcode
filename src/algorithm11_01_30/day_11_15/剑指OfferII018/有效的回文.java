package algorithm11_01_30.day_11_15.剑指OfferII018;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_15.剑指OfferII018
 * @className: 有效的回文
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/15 19:54
 * @version: 1.0
 */

public class 有效的回文 {
    public static void main(String[] args) {
        String s = "1A man, a plan, a canal: Panama1";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            //判断当前元素是否为数字或者英文字母
            if (Character.isLetterOrDigit(ch)) {
                //转换小写toLowerCase
                sgood.append(Character.toLowerCase(ch));
            }
        }
        //反转后的字符串
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }
}
