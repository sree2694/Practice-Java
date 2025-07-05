package com.example.ds.trees.bst;

import com.example.ds.trees.model.TreeNode;

public class BinarySearchTree {
    public TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode node, int data) {
        if (node == null) return new TreeNode(data);
        if (data < node.data) node.left = insertRec(node.left, data);
        else if (data > node.data) node.right = insertRec(node.right, data);
        return node;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(TreeNode node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        return key < node.data ? searchRec(node.left, key) : searchRec(node.right, key);
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(TreeNode node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.data + " ");
        }
    }
}
// This class implements a Binary Search Tree (BST) with methods for inserting nodes, searching for values, and traversing the tree in in-order, pre-order, and post-order.
// The `insert` method adds a new value to the tree, maintaining the BST property.
// The `search` method checks if a value exists in the tree.
// The traversal methods print the values in different orders, which can be useful for various applications like sorting or displaying the tree structure.