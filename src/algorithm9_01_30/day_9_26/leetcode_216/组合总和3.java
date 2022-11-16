package algorithm9_01_30.day_9_26.leetcode_216;

import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_26.leetcode_216
 * @className: 组合总和3
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/26 20:26
 * @version: 1.0
 */

public class 组合总和3 {
    static List<List<Integer>> list;
    static int N = 10;
    static int k = 3;
    static int n = 9;
    public static void main(String[] args) {
        System.out.println(combinationSum3(k, n));
    }


    public static List<List<Integer>> combinationSum3(int k, int n) {
        list = new ArrayList<>();
        dfs(0,new ArrayList<>(),0,1);
        return list;
    }
    static void dfs(int len,List<Integer> child,int current,int index){
        //len 代表 有多少个元素 满足长度成立
        //可以认为是child集合的长度
        if(len == k){
            //current 是上面元素之和 满足目标值
            if(current == n){
                //进行添加
                list.add(new ArrayList<>(child));
            }
            //返回
            return;
        }
        //满足 i < N
        for (int i = index;i < N;i++){
            //集合添加元素
            child.add(i);
            //递归
            //index + 1
            //len + 1
            //current 算是和
            dfs(len + 1,child,current + i,i + 1);
            //到这代表执行完一个递归 相当于减去集合中的最后一个元素
            child.remove(child.size() - 1);
        }
    }
}
