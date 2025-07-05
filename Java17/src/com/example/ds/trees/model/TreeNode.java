package com.example.ds.trees.model;

public class TreeNode {
    public int data;
    public TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
    }
}
// This class represents a node in a binary tree.
// It contains an integer data field and references to the left and right child nodes.
// The constructor initializes the node with a given value, while the left and right child references are set to null by default.
// This structure is commonly used in binary search trees, AVL trees, and other tree-based data structures.