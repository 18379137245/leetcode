package algorithm12_01_31.day_12_06.leetcode.二叉树的最大深度;

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
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(15);
        root.left = node1;
        root.right = node2;
        node2.left = node6;
        node2.right = node4;
        node4.left = node5;
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            //一直调用节点的左子树
            int leftHeight = maxDepth(root.left);
            //一直调用节点的右子树
            int rightHeight = maxDepth(root.right);
            //找出最大深度的节点
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
