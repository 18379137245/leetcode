package algorithm8_01_31.day_8_18.leetcode_551;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_18.leetcode_551
 * @className: 学生出勤记录1
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/18 19:18
 * @version: 1.0
 */

public class 学生出勤记录1 {
    public static void main(String[] args) {
        System.out.println(checkRecord("LALL"));
    }

    public static boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                l = 0;
                if(a >= 2){
                    return false;
                }
            }else if (s.charAt(i) == 'L') {
                l++;
                if (l >= 3) {
                    return false;
                }
            }else {
                l = 0;
            }
        }
        return true;
    }
}
