package algorithm7_01_31.day_7_16.leetcode_205;

public class 同构字符串 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("addde", "teeee"));
    }
    public static boolean isIsomorphic(String s, String t) {
        //以第一个元素的长度遍历
        for(int i = 0; i < s.length(); i++){
            //判断 s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i)) 成立 返回false
            // indexOf 返回指定字符第一次出现的字符串内的索引。
            // charAt() 返回指定索引处的 char值。
            // s.indexOf(s.charAt(i))  代表s.indexOf(里面的s.charAt(i)) 元素所在的索引位置第一次出现的位置
            // t.indexOf(t.charAt(i))  代表t.indexOf(里面的t.charAt(i)) 元素所在的索引位置第一次出现的位置
            // 一样 不成立  1 != 1  不成立一直循环 直到结束循环 返回ture
            // 比如 1 != 2 成立 返回false
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        //返回给调用者 true
        return true;
    }
}
