package com.example.ds.trees;

import com.example.ds.trees.bst.BinarySearchTree;

public class MainApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.insert(val);
        }

        System.out.println("In-order traversal:");
        bst.inOrder(); // 20 30 40 50 60 70 80

        System.out.println("Pre-order traversal:");
        bst.preOrder(); // 50 30 20 40 70 60 80

        System.out.println("Post-order traversal:");
        bst.postOrder(); // 20 40 30 60 80 70 50

        System.out.println("Search for 40: " + bst.search(40)); // true
        System.out.println("Search for 90: " + bst.search(90)); // false
    }
}
//     if (node != null) {
//         postOrderRec(node.left);
//         postOrderRec(node.right);    