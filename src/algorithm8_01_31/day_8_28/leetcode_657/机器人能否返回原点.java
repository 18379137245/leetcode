package algorithm8_01_31.day_8_28.leetcode_657;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_28.leetcode_657
 * @className: 机器人能否返回原点
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/28 19:24
 * @version: 1.0
 */

public class 机器人能否返回原点 {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int u = 0,d = 0,r = 0,l = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                u++;
            }else if(moves.charAt(i) == 'D'){
                d++;
            }else if(moves.charAt(i) == 'R'){
                r++;
            }else if(moves.charAt(i) == 'L'){
                l++;
            }
        }
        return u == d && r == l;
    }
    public boolean judgeCircle2(String moves) {
        int[] steps = new int[128];
        for(char ch:moves.toCharArray()){
            steps[ch]++;
        }
        return steps['U']==steps['D'] && steps['L']==steps['R'];
    }
}
