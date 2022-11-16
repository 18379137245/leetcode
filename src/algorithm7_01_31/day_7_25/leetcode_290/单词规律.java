package algorithm7_01_31.day_7_25.leetcode_290;

public class 单词规律 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));

    }
    public static boolean wordPattern(String pattern, String s) {
        // 替代 正向映射 HashMap
        String[] patternMap = new String[26];
        // 将 String 转化成 char[] 加速程序，因为 String.charAt() 每次调用都会检查下标是否越界
        char[] patternArray = pattern.toCharArray();
        // 使用空格将s分离成 String 数组
        String[] splitString = s.split(" ");
        // 如果两个数组的长度不等，则一定不可能一一映射，返回false
        if(patternArray.length != splitString.length){
            return false;
        }
        // 遍历 pattern 每一个字母
        for(int i = 0; i < patternArray.length; i++){
            // patternArray[i] 为当前字母
            // splitString[i] 为当前字符串
            System.out.println(patternArray[i] - 'a');
            if(patternMap[patternArray[i]-'a'] == null){
                // 如果当前字母没有对应的字符串
                // 通过遍历整个数组来确认没有其他字母与当前字符串已经形成映射关系
                for(int j = 0; j < 26; j++){
                    System.out.println(patternMap[j]);
                    if(patternMap[j] != null && patternMap[j].equals(splitString[i])){
                        // 如果已经有其他的字母与当前字符串形成了映射关系，则不可能产生一一双向对应，返回false
                        return false;
                    }
                }
                // 如果不存在已经形成的映射，那么建立新的字母与字符串的映射
                patternMap[patternArray[i]-'a'] = splitString[i];
                System.out.println(patternMap[patternArray[i] - 'a'] = splitString[i]);
            }else{
                // 如果当前字母已经有了对应的字符串
                // 如果对应的字符串与当前字符串不相符，那么一一对应不成立，返回false
                if(!patternMap[patternArray[i]-'a'].equals(splitString[i])){
                    return false;
                }
            }
        }
        // 遍历完毕，没有问题，返回true
        return true;
    }
}
