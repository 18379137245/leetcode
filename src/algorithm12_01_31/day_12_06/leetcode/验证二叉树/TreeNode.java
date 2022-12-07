package algorithm12_01_31.day_12_06.leetcode.验证二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_21.leetcode_104.二叉树的最大深度
 * @className: TreeNode
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/21 18:53
 * @version: 1.0
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node4 = new TreeNode(6);
//        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node2.left = node6;
        node2.right = node4;
//        node2.right = node4;
//        node4.left = node5;
        System.out.println(generateTrees(root));
    }

    public static boolean generateTrees(TreeNode root) {
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        double inorder = -Double.MAX_VALUE;
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            // 如果中序遍历得到的节点的值小于等于前一个 inorder，说明不是二叉搜索树
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
