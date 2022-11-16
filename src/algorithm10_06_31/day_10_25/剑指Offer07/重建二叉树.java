package algorithm10_06_31.day_10_25.剑指Offer07;

import java.util.HashMap;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_25.剑指Offer07
 * @className: 重建二叉树
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/25 18:53
 * @version: 1.0
 */

public class 重建二叉树 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};
        buildTree(preorder,inorder);
    }

    static int[] preorder;
    static HashMap<Integer, Integer> dic = new HashMap<>();
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        //this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++)
            dic.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }
    static TreeNode recur(int root, int left, int right) {
        if(left > right) return null;                          // 递归终止
        TreeNode node = new TreeNode(preorder[root]);          // 建立根节点
        int i = dic.get(preorder[root]);                       // 划分根节点、左子树、右子树
        node.left = recur(root + 1, left, i - 1);              // 开启左子树递归
        node.right = recur(root + i - left + 1, i + 1, right); // 开启右子树递归
        return node;                                           // 回溯返回根节点
    }

}
