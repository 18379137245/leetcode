package algorithm11_01_30.day_11_27.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode
 * @className: 有效的数独
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 19:18
 * @version: 1.0
 */

public class 有效的数独 {
    public static void main(String[] args) {
        char[][] board = {
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];//9行9个数
        int[][] lows = new int[9][9];//9列9个数
        int[][][] boxs = new int[3][3][9];//分小组后，行3个，列3个，每个小组9个数
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '0' - 1;//这里主要是字符与int类型计算，减1是为了计算数组中位置
                    rows[i][index]++;//在记录行的数组中统计这个数出现的次数
                    lows[j][index]++;//同理统计列
                    boxs[i / 3][j / 3][index]++;//同理计算块，这里有个求除数规则，可以将块做好标记，画图看下就明白了
                    //这里假设数独是规则的，则每个数在统计数组中不会出现大于1的情况
                    if (rows[i][index] > 1 || lows[j][index] > 1 || boxs[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
