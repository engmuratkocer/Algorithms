package com.algorithms.graph;

import com.algorithms.TreeNode;

public class TreeMirror {


    public static void main(String[] args) {


        System.out.println(" First Tree ");
        System.out.println(TreeNode.getDefaultTree().toString());

        TreeNode mirroredTree = mirror(TreeNode.getDefaultTree());
        System.out.println(" Mirrored Tree ");
        System.out.println(mirroredTree.toString());

    }

    private static TreeNode mirror(TreeNode tree) {

        if (tree == null) {
            return tree;
        }

        tree.leftNode = mirror(tree.leftNode);
        tree.rightNode = mirror(tree.rightNode);

        TreeNode tmpNode = tree.rightNode;

        tree.rightNode = tree.leftNode;
        tree.leftNode = tmpNode;

        return tree;
    }

}