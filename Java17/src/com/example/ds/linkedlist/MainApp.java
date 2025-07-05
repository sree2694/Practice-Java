package com.example.ds.linkedlist;

import com.example.ds.linkedlist.singly.*;
import com.example.ds.linkedlist.doubly.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Singly Linked List ===");
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.traverse();

        list.delete(3);
        System.out.print("After deletion: ");
        list.traverse();

        System.out.println("Reversed:");
        list.head = LinkedListUtils.reverse(list.head);
        list.traverse();

        System.out.println("Middle element: " + LinkedListUtils.findMiddle(list.head).data);

        System.out.println("=== Merge Two Sorted Lists ===");
        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.add(1); l1.add(4); l1.add(6);
        SinglyLinkedList l2 = new SinglyLinkedList();
        l2.add(2); l2.add(3); l2.add(5);
        Node merged = LinkedListUtils.mergeSorted(l1.head, l2.head);
        SinglyLinkedList mergedList = new SinglyLinkedList();
        mergedList.head = merged;
        mergedList.traverse();

        System.out.println("Cycle detection: " + LinkedListUtils.hasCycle(merged)); // false

        System.out.println("\n=== Doubly Linked List ===");
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.add(10); dlist.add(20); dlist.add(30);
        System.out.print("Forward: ");
        dlist.traverseForward();
        System.out.print("Backward: ");
        dlist.traverseBackward();
    }
}
// This code demonstrates the usage of singly and doubly linked lists, including operations like adding, deleting, reversing, finding the middle element, merging sorted lists, and cycle detection.
// It also shows how to traverse both singly and doubly linked lists in forward and backward directions.