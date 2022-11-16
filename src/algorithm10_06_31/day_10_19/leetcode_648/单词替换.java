package algorithm10_06_31.day_10_19.leetcode_648;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_19.leetcode_648
 * @className: 单词替换
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/19 19:52
 * @version: 1.0
 */

public class 单词替换 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String s = "aadsfasf absbs bbab cadsfafs";
        System.out.println(replaceWords(list, s));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < dictionary.size(); j++) {
                if(s[i].startsWith(dictionary.get(j))){
                    s[i] = dictionary.get(j);
                    break;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if(i < s.length - 1){
                stringBuilder.append(s[i]);
                stringBuilder.append(" ");
            }else {
                stringBuilder.append(s[i]);
            }
        }
        return String.join(" ",s);
//        return stringBuilder.toString();
    }
}
