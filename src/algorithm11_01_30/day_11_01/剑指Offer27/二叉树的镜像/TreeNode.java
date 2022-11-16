package algorithm11_01_30.day_11_01.剑指Offer27.二叉树的镜像;


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
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
//        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(6);
        TreeNode node8 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node4;
        node1.right = node6;
        node2.left = node7;
        node2.right = node8;
//        node2.right = node4;
//        node4.left = node5;
        TreeNode treeNode = mirrorTree(root);
        System.out.println(treeNode);
    }

    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //遍历左子树所有元素
        TreeNode left = mirrorTree(root.left);
        //遍历右子树所有元素
        TreeNode right = mirrorTree(root.right);
        //交换左右子树元素
        root.left = right;
        root.right = left;
        return root;
    }
}