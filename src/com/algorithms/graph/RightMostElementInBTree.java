package com.algorithms.graph;

import com.algorithms.TreeNode;

public class RightMostElementInBTree {


    public static void main(String[] args) {

        TreeNode node = TreeNode.getDefaultTree();
        System.out.println(rightMostElementRecursively(node).data);
        System.out.println(rightMostElementIteratively(node).data);

    }

    private static TreeNode rightMostElementRecursively(TreeNode node) {

        if (node == null)
            return null;

        TreeNode elm = rightMostElementRecursively(node.rightNode);

        if (elm == null)
            return node;

        return elm;
    }

    private static TreeNode rightMostElementIteratively(TreeNode node) {

        if (node == null)
            return null;


        while(node.rightNode != null){
            node = node.rightNode;
        }

        return node;
    }

}
