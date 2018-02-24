package com.algorithms.graph;

import com.algorithms.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.Map;

public class RightHighestElementInBTree {

    public static void main(String[] args) {

        TreeNode bTree = TreeNode.getDefaultTree();
        bTree.level = 0;
        System.out.println(findRightMostElement(bTree).data);

    }

    private static TreeNode findRightMostElement(TreeNode node) {

        maxLevel.level = Integer.MIN_VALUE;

        return findRightMostElement(node, false);
    }
    static TreeNode maxLevel = new TreeNode(-1);



    private static TreeNode findRightMostElement(TreeNode node, boolean isRight) {

        if (node == null) {
            return maxLevel;
        }

        if (node.leftNode != null) {
            node.leftNode.level = node.level + 1;
        }

        if (node.rightNode != null) {
            node.rightNode.level = node.level + 1;
        }

        findRightMostElement(node.leftNode, false);
        findRightMostElement(node.rightNode, true);

        if (isRight) {

            if (node != null && node.level > maxLevel.level)
                maxLevel = node;

        }

        return maxLevel;
    }
}