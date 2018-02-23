package com.algorithms;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeNode {

    public int data;
    public TreeNode leftNode = null;
    public TreeNode rightNode = null;

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

    @Override
    public String toString() {

        Map<Integer, List<String>> strMap = new HashMap<>();
        Map<Integer, List<String>> map = constructTreeString(strMap,this, 0);

        int mapLength = map.size();

        String text = "";

        for (int i = 0; i < mapLength; i++) {

            for (String str : map.get(i)) {
                text +=" - " + str;
            }
            text += " \n";
        }

        return text;
    }

    private Map<Integer, List<String>> constructTreeString(Map<Integer, List<String>> strMap, TreeNode tree, int level) {

        if (tree == null)
            return strMap;

        String treeText = tree.data +" ";

        if (strMap.get(level) == null){
            List l =  new ArrayList<String>();
            l.add(treeText);
            strMap.put(level,l);
        }else{
            List<String> l = strMap.get(level);
            l.add(treeText);
            strMap.put(level, l);
        }

        constructTreeString(strMap, tree.leftNode, level+1);
        constructTreeString(strMap, tree.rightNode, level+1);

        return strMap;
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
