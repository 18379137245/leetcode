package algorithm10_06_31.day_10_21.leetcode_110.二叉平衡树;

import com.sun.deploy.util.StringUtils;
import sun.plugin.com.Utils;
import sun.text.CollatorUtilities;

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
    static boolean  res = true;
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

    public static  void main(String[] args) {
        TreeNode root = new TreeNode();
//        TreeNode node1 = new TreeNode(2);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node4 = new TreeNode(3);
//        TreeNode node5 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(3);
//        TreeNode node7 = new TreeNode(3);
//        root.left = node1;
//        root.right = node2;
//        node1.left = node6;
//        node1.right = node4;
//        node6.left = node5;
//        node6.right = node7;
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return res;
        }
        maxDepth(root);
        return res;
    }
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            //一直调用节点的左子树
            int leftHeight = maxDepth(root.left) + 1;
            //一直调用节点的右子树
            int rightHeight = maxDepth(root.right)+ 1;
            //找出最大深度的节点
            if (Math.abs(rightHeight - leftHeight) > 1) res = false;
            return Math.max(leftHeight,rightHeight);
        }
    }
}
