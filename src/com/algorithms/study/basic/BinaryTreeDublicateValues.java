package com.algorithms.study.basic;

import com.algorithms.TreeNode;

public class BinaryTreeDublicateValues {

    public static void main(String[] args) {

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


    }
}
