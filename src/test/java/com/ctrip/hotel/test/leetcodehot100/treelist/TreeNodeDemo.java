package com.ctrip.hotel.test.leetcodehot100.treelist;

public class TreeNodeDemo {

    // 前序遍历（NLR）： 先访问根节点➡根的左子树➡根的右子树
    public static void preOrderTraversal(TreeNode root){
        if (root==null){
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历（LNR）： 先访问根的左子树➡根节点➡根的右子树
    public static void middleOrderTraversal(TreeNode root){
        if (root==null){
            return;
        }
        middleOrderTraversal(root.left);
        System.out.println(root.val);
        middleOrderTraversal(root.right);
    }
    // 后序遍历（LRN）： 先访问根的左子树➡根的右子树➡根节点
    public static void leftOrderTraversal(TreeNode root){
        if (root==null){
            return;
        }
        leftOrderTraversal(root.left);
        leftOrderTraversal(root.right);
        System.out.println(root.val);
    }
    public static void main(String[] args) {
        TreeNode root = initTreeNode();
        //preOrderTraversal(root); // 前序遍历
        middleOrderTraversal(root); // 中序遍历
        //leftOrderTraversal(root); // 后序遍历
    }

    // 构造二叉树
    private static TreeNode initTreeNode() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;
        treeNode5.right=treeNode8;
        treeNode3.left=treeNode6;
        treeNode3.right=treeNode7;
        return treeNode1;
    }

}
