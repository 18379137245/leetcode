package algorithm9_01_30.day_9_02.leetcode_8;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_02.leetcode_8
 * @className: 字符串转换整数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/2 20:09
 * @version: 1.0
 */

public class 字符串转换整数 {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(myAtoi2("3.14"));
    }

    public static int myAtoi(String s) {
        int count = 0;
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        if ("".equals(s)) return 0;//表示字符串为空或字符串全为空格的情况
        char first = s.charAt(0);//取去掉字符串后的首字母
        if (first == '-' || first == '+' || (first >= '0' && first <= '9')) {
            sb.append(first);//首字母为+ -,数字
        } else if (first < '0' || first > '9') {
            //字符串中的第一个非空格字符不是一个有效整数字符
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '-' || s.charAt(i) == '+') {
                count++;
            } else{
                break;
            }
        }
        StringBuilder str = new StringBuilder();
        try {
            String substring = s.substring(0, count);
            int x = Integer.parseInt(substring);
            str.append(Math.abs(x));
            int result = Integer.parseInt(str.toString());
            return x > 0 ? result : -result;
        } catch (Exception e) {
            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
    public static int myAtoi2(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        String strTrim = s.trim();//去字符前后空格
        if("".equals(strTrim)) return 0;//表示字符串为空或字符串全为空格的情况
        char first = strTrim.charAt(0);//取去掉字符串后的首字母
        if(first == '-' || first == '+' || (first >= '0' && first <= '9')){
            stringBuffer.append(first);//首字母为+ -,数字
        }else if(first < '0' || first > '9'){
            //字符串中的第一个非空格字符不是一个有效整数字符
            return 0;
        }
        for(int i = 1; i < strTrim.length(); i++){
            if(strTrim.charAt(i) < '0' || strTrim.charAt(i) > '9'){
                break;
            }
            stringBuffer.append(strTrim.charAt(i));
        }
        if(stringBuffer.toString().equals("+") || stringBuffer.toString().equals("-")){
            //如果该有效字符只为+，-
            return 0;
        }
        int number;
        try{
            number = Integer.parseInt(stringBuffer.toString());
            return number;
        }catch(Exception e){
            return strTrim.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
