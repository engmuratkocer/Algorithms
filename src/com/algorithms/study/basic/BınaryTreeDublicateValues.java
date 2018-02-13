package com.algorithms.study.basic;

import com.algorithms.TreeNode;

public class BınaryTreeDublicateValues {

    public static void main(String[] args) {

        TreeNode node = new TreeNode("root");
        TreeNode lNode = new TreeNode("left_1");
        TreeNode lNode_left = new TreeNode("left_left");
        TreeNode lNode_right = new TreeNode("left_right");
        TreeNode rNode = new TreeNode("right_1");
        TreeNode rNode_left = new TreeNode("right_left");
        TreeNode rNode_right = new TreeNode("right_right");

        node.setLeftNode(lNode);
        node.setRightNode(rNode);

        lNode.setLeftNode(lNode_left);
        lNode.setRightNode(lNode_right);

        rNode.setLeftNode(rNode_left);
        rNode.setRightNode(rNode_right);


    }
}
