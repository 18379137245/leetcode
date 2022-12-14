package algorithm12_01_31.day_12_13.leetcode_1482;

import java.util.Arrays;

public class 制作m束花所需的最少天数 {
    static int[] bloomDay = {1, 10, 3, 10, 2};
    public static void main(String[] args) {

        System.out.println(minDays(bloomDay, 3, 1));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m * k ) return -1;
            /*
             思路和珂珂吃苹果还有D天装船应该类似的
             搞一个函数用来计算某些天数内是否能完成制作，然后确定最小的天数即可。
             重点是怎么确定指定天数内是否可以制作话
            */
        int left = -1 , right = 1000000000;
        while (left < right){
            int mid = left + right >>> 1;
            //如果mid天可以完成那就尝试更小的天数
            if(canMake(mid,m,k)){
                right = mid ;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 根据指定天数daysNum计算是否可以完成每m束每束k朵花的制作
     * @param daysNum 指定的天数
     * @param m m 束
     * @param k k 朵
     * @return true 可以制作
     */

    private static boolean canMake(int daysNum,int m,int k){
        //临时保存k因为tempK会不断的-- 又恢复到k
        int tempK=k;
        for(int i:bloomDay){
            //如元素的值小于daysNum的值说明开花了，可以摘
            if(i <= daysNum ){
                //花都开了，那就摘一朵，如果摘完发现已经够一束了那就把目标的束的数量减少
                if(--tempK==0){
                    //减少束的数量
                    m--;
                    //朵的数量要恢复
                    tempK=k;
                }
            }
            //一旦遇到不能摘的立马恢复朵的数量
            else{
                tempK=k;
            }
        }
        //如果束的数量小于等于0都是说明在daysNum天的时候可以完成m束花。
        return m <= 0;
    }
}
