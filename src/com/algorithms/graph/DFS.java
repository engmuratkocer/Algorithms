package com.algorithms.graph;

import com.algorithms.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.HashSet;

public class DFS {

    public static void main(String[] args) {

        int searchElement = 10;
        TreeNode bTree = TreeNode.getDefaultTree();
        System.out.println(deapthFirstSearch(bTree, searchElement));

    }

    private static int deapthFirstSearch(TreeNode bTree, int searchElement) {


        HashSet<TreeNode> visited = new HashSet<>();
        
        return deapthFirstSearch(visited , bTree, searchElement);


    }

    private static int deapthFirstSearch(HashSet<TreeNode> visitedNodes, TreeNode bTree, int searchElement) {

        if (visitedNodes.contains(bTree)){
            return -1;
        }

        visitedNodes.add(bTree);

        if (bTree == null)
            return -1;

        if (bTree.data == searchElement)
            return bTree.data;

        int findVal = deapthFirstSearch(visitedNodes,bTree.leftNode,searchElement);

        if (findVal == -1 )
            findVal = deapthFirstSearch(visitedNodes,bTree.rightNode,searchElement);

        return findVal;
    }
}
