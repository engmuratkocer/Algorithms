package com.algorithms.study.easy;

import com.algorithms.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LowestCommonAnchestor {

    public static void main(String[] args) {

        TreeNode tree = TreeNode.getDefaultTree();

        int n = 2;
        int m = 8;

        int LCA = getLowestCommonAnchestor(tree, n, m);
        System.out.println("LCA of " + n + " and " + m + " : " + LCA);

        n = 2;
        m = 4;
        LCA = getLowestCommonAnchestor(tree, n, m);
        System.out.println("LCA of " + n + " and " + m + " : " + LCA);

    }

    private static int getLowestCommonAnchestor(TreeNode treeNode, int n, int m) {

        if (treeNode.getData() > n && treeNode.getData() > m) {
            return getLowestCommonAnchestor(treeNode.getLeftNode(), n, m);
        } else if (treeNode.getData() < n && treeNode.getData() < m) {
            return getLowestCommonAnchestor(treeNode.getRightNode(), n, m);
        }
        return treeNode.getData();
    }

}