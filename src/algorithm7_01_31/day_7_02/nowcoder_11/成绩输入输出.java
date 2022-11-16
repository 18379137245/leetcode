package algorithm7_01_31.day_7_02.nowcoder_11;

import java.util.Scanner;

public class 成绩输入输出 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(";");
        String[] split1 = s.split(",");
        String[] split2 = split1[0].split(";");
        String s1 = split2[1];
        String s2 = split1[1];
        String s3 = split1[2];
        Double aDouble1 = Double.valueOf(s1);
        Double aDouble2 = Double.valueOf(s2);
        Double aDouble3 = Double.valueOf(s3);
        System.out.println("The each subject score of No. "+split[0]+" is "+String.format("%.2f",aDouble1)+", "+String.format("%.2f",aDouble2)+", "+String.format("%.2f",aDouble3)+".");
    }


}
