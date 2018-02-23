package com.algorithms.graph;

import com.algorithms.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

public class BFS {

    public static void main(String[] args) {


        int searchElement = 8;
        TreeNode bTree = TreeNode.getDefaultTree();
        System.out.println(breathFirstSearch(bTree, searchElement));

    }

    private static int breathFirstSearch(TreeNode bTree, int searchElement) {

        if (bTree == null)
            return -1;

        LinkedList<TreeNode> nextToVisit = new LinkedList<>();
        nextToVisit.add(bTree);

        while (!nextToVisit.isEmpty()) {

            TreeNode currentNode = nextToVisit.remove();

            if (currentNode.data == searchElement)
                return currentNode.data;


            if (currentNode.leftNode != null)
                nextToVisit.add(currentNode.leftNode);

            if (currentNode.rightNode != null)
                nextToVisit.add(currentNode.rightNode);

        }

        return -1;
    }


}
