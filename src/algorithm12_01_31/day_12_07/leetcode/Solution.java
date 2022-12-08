package algorithm12_01_31.day_12_07.leetcode;

import algorithm12_01_31.day_12_06.leetcode.二叉树的最大深度.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public static class TreeNode {
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
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node4 = new TreeNode(7);
//        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(15);
        root.left = node1;
        root.right = node2;
        node2.left = node6;
        node2.right = node4;
//        node4.left = node5;
//        System.out.println(levelOrder(root));
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println();
        System.out.println();
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        //返回的结果
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (null == root) {
            return res;
        }


        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        //根节点入队
        queue.add(root);

        while (!queue.isEmpty()) {
            //一层的结果
            List<Integer> level = new ArrayList<Integer>();
            int levelCount = queue.size();

            //添加节点到一层的List中去
            for (int i = 0; i < levelCount; i++) {
                //节点出队
                TreeNode node = queue.remove();

                //节点的左子树入队
                if (node.left != null) {
                    queue.add(node.left);
                }

                //节点的右子树入队   
                if (node.right != null) {
                    queue.add(node.right);
                }

                level.add(node.val);
            }
            res.add(level);
        }
        return res;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}