package algorithm7_01_31.day_7_03.leetcode_09;

import java.util.ArrayList;

public class 回文数 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }
    public static boolean isPalindrome(int x) {
        if(x <0){
            String s = "-"+x;
        }
        String s = x+"";
        System.out.println(s);
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < list.size();) {
            for (int j = list.size()-1-i; j >= 0;) {
                if(list.get(i).equals(list.get(j))){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
