package algorithm7_01_31.day_7_01.leetcode_125;

import java.util.ArrayList;
import java.util.Scanner;

public class 验证回文串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("isPalindrome(s) = " + isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        ArrayList arrayList = new ArrayList();
        int count = 0;
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= '0' && s.charAt(i) <= '9' ){
                arrayList.add(s.charAt(i));
            }
        }
        Object[] s1 = arrayList.toArray();
        for (int i = 0; i < s1.length; i++) {
            num += s1[i];
        }
        String num1 = num.toLowerCase();

        for (int i = 0; i < num1.length(); i++) {
                for (int j = num1.length() - 1 - i; j >= 0; j--) {
                    char c = num1.charAt(i);
                    char d = num1.charAt(j);
                    if (c == d) {
                        count++;
                        i++;
                    } else {
                        return false;
                    }
                }
            }
        if(count == num1.length()){
            return true;
        } else {
            return false;
        }
    }


//    String s1 = s.replaceAll(" ", "");
//    String s2 = s1.replaceAll(",", "");
//    String s3 = s2.replaceAll(":", "");
//    String s4 = s3.replaceAll("\\.", "");
//    String s5 = s4.toLowerCase();
//
//    int count = 0;
//        for (int i = 0; i < s5.length(); i++) {
//        for (int j = s5.length()-1-i; j >= 0 ; j--) {
//            char c = s5.charAt(i);
//            char d = s5.charAt(j);
//            if(c == d){
//                count++;
//                i++;
//            }else {
//                return false;
//            }
//        }
//    }
//        if(count == s5.length()){
//        return true;
//    }else {
//        return false;
//    }
}
