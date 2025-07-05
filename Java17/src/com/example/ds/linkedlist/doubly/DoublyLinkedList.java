package com.example.ds.linkedlist.doubly;

public class DoublyLinkedList {
    public DoublyNode head;

    public void add(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void traverseForward() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void traverseBackward() {
        DoublyNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}
// Additional methods like delete, reverse, findMiddle, etc. can be added similarly
// as in the SinglyLinkedList class, but adapted for the doubly linked list structure.