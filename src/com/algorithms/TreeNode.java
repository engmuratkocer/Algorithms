package com.algorithms;

public class TreeNode {

    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public static TreeNode getDefaultTree() {

        TreeNode node = new TreeNode(6);
        TreeNode lNode = new TreeNode(4);
        TreeNode lNode_left = new TreeNode(2);
        TreeNode lNode_right = new TreeNode(5);
        TreeNode rNode = new TreeNode(9);
        TreeNode rNode_left = new TreeNode(8);
        TreeNode rNode_right = new TreeNode(10);

        node.setLeftNode(lNode);
        node.setRightNode(rNode);

        lNode.setLeftNode(lNode_left);
        lNode.setRightNode(lNode_right);

        rNode.setLeftNode(rNode_left);
        rNode.setRightNode(rNode_right);

        return node;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
