package com.rahulkumarpariharmailbox.Creational.FactoryPattern;

class Tree {
    TreeNode root;

    public static class TreeNode {
        int val;
        TreeNode leftChild, rightChild;

        public TreeNode(int val) {
            this.val = val;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
}
